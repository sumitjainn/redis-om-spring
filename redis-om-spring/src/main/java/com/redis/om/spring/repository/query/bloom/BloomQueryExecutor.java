package com.redis.om.spring.repository.query.bloom;

import com.redis.om.spring.annotations.Bloom;
import com.redis.om.spring.ops.RedisModulesOperations;
import com.redis.om.spring.ops.pds.BloomOperations;
import com.redis.om.spring.util.ObjectUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.repository.query.RepositoryQuery;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Optional;

public class BloomQueryExecutor {

  public static final String EXISTS_BY_PREFIX = "existsBy";
  private static final Log logger = LogFactory.getLog(BloomQueryExecutor.class);
  final RepositoryQuery query;
  final RedisModulesOperations<String> modulesOperations;

  public BloomQueryExecutor(RepositoryQuery query, RedisModulesOperations<String> modulesOperations) {
    this.query = query;
    this.modulesOperations = modulesOperations;
  }

  public Optional<String> getBloomFilter() {
    String methodName = query.getQueryMethod().getName();
    boolean hasExistByPrefix = methodName.startsWith(EXISTS_BY_PREFIX);
    if (hasExistByPrefix && boolean.class.isAssignableFrom(query.getQueryMethod().getReturnedObjectType())) {
      String targetProperty = ObjectUtils.firstToLowercase(methodName.substring(EXISTS_BY_PREFIX.length()));
      logger.debug(String.format("Target Property : %s", targetProperty));
      Class<?> entityClass = query.getQueryMethod().getEntityInformation().getJavaType();

      try {
        Field field = ReflectionUtils.findField(entityClass, targetProperty);
        if (field == null) {
          return Optional.empty();
        }
        if (field.isAnnotationPresent(Bloom.class)) {
          Bloom bloom = field.getAnnotation(Bloom.class);
          return Optional.of(!org.apache.commons.lang3.ObjectUtils.isEmpty(bloom.name()) ?
            bloom.name() :
            String.format("bf:%s:%s", entityClass.getSimpleName(), field.getName()));
        }
      } catch (SecurityException e) {
        // NO-OP
      }
    }
    return Optional.empty();
  }

  public Object executeBloomQuery(Object[] parameters, String bloomFilter) {
    logger.debug(String.format("filter:%s, params:%s", bloomFilter, Arrays.toString(parameters)));
    BloomOperations<String> ops = modulesOperations.opsForBloom();
    return ops.exists(bloomFilter, parameters[0].toString());
  }
}
