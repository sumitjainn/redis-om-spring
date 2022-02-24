package com.redis.om.spring.tuple;

import java.util.function.Function;

import com.redis.om.spring.tuple.impl.mapper.EmptyTupleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.DecupleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.UndecupleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.DuodecupleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.TredecupleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.QuattuordecupleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.QuindecupleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.SexdecupleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.SeptendecupleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.OctodecupleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.NovemdecupleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.SingleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.VigintupleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.PairMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.TripleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.QuadMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.QuintupleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.HextupleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.SeptupleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.OctupleMapperImpl;
import com.redis.om.spring.tuple.impl.mapper.NonupleMapperImpl;

public final class Fields {

  private Fields() {}

  @SuppressWarnings("unchecked")
  public static <T> Function<T, EmptyTuple> toTuple() {
    return (Function<T, EmptyTuple>) EmptyTupleMapperImpl.EMPTY_MAPPER;
  }

  public static <T, T0> Function<T, Single<T0>> toTuple(Function<T, T0> m0) {
    return new SingleMapperImpl<>(m0);
  }

  public static <T, T0, T1> Function<T, Pair<T0, T1>> of(Function<T, T0> m0, Function<T, T1> m1) {
    return new PairMapperImpl<>(m0, m1);
  }

  public static <T, T0, T1, T2> Function<T, Triple<T0, T1, T2>> of(Function<T, T0> m0, Function<T, T1> m1,
      Function<T, T2> m2) {
    return new TripleMapperImpl<>(m0, m1, m2);
  }

  public static <T, T0, T1, T2, T3> Function<T, Quad<T0, T1, T2, T3>> of(Function<T, T0> m0, Function<T, T1> m1,
      Function<T, T2> m2, Function<T, T3> m3) {
    return new QuadMapperImpl<>(m0, m1, m2, m3);
  }

  public static <T, T0, T1, T2, T3, T4> Function<T, Quintuple<T0, T1, T2, T3, T4>> toTuple(Function<T, T0> m0,
      Function<T, T1> m1, Function<T, T2> m2, Function<T, T3> m3, Function<T, T4> m4) {
    return new QuintupleMapperImpl<>(m0, m1, m2, m3, m4);
  }

  public static <T, T0, T1, T2, T3, T4, T5> Function<T, Hextuple<T0, T1, T2, T3, T4, T5>> toTuple(Function<T, T0> m0,
      Function<T, T1> m1, Function<T, T2> m2, Function<T, T3> m3, Function<T, T4> m4, Function<T, T5> m5) {
    return new HextupleMapperImpl<>(m0, m1, m2, m3, m4, m5);
  }

  public static <T, T0, T1, T2, T3, T4, T5, T6> Function<T, Septuple<T0, T1, T2, T3, T4, T5, T6>> toTuple(
      Function<T, T0> m0, Function<T, T1> m1, Function<T, T2> m2, Function<T, T3> m3, Function<T, T4> m4,
      Function<T, T5> m5, Function<T, T6> m6) {
    return new SeptupleMapperImpl<>(m0, m1, m2, m3, m4, m5, m6);
  }

  public static <T, T0, T1, T2, T3, T4, T5, T6, T7> Function<T, Octuple<T0, T1, T2, T3, T4, T5, T6, T7>> toTuple(
      Function<T, T0> m0, Function<T, T1> m1, Function<T, T2> m2, Function<T, T3> m3, Function<T, T4> m4,
      Function<T, T5> m5, Function<T, T6> m6, Function<T, T7> m7) {
    return new OctupleMapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7);
  }

  public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8> Function<T, Nonuple<T0, T1, T2, T3, T4, T5, T6, T7, T8>> toTuple(
      Function<T, T0> m0, Function<T, T1> m1, Function<T, T2> m2, Function<T, T3> m3, Function<T, T4> m4,
      Function<T, T5> m5, Function<T, T6> m6, Function<T, T7> m7, Function<T, T8> m8) {
    return new NonupleMapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8);
  }

  public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> Function<T, Decuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9>> toTuple(
      Function<T, T0> m0, Function<T, T1> m1, Function<T, T2> m2, Function<T, T3> m3, Function<T, T4> m4,
      Function<T, T5> m5, Function<T, T6> m6, Function<T, T7> m7, Function<T, T8> m8, Function<T, T9> m9) {
    return new DecupleMapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9);
  }

  public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Function<T, Undecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> toTuple(
      Function<T, T0> m0, Function<T, T1> m1, Function<T, T2> m2, Function<T, T3> m3, Function<T, T4> m4,
      Function<T, T5> m5, Function<T, T6> m6, Function<T, T7> m7, Function<T, T8> m8, Function<T, T9> m9,
      Function<T, T10> m10) {
    return new UndecupleMapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10);
  }

  public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Function<T, Duodecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> toTuple(
      Function<T, T0> m0, Function<T, T1> m1, Function<T, T2> m2, Function<T, T3> m3, Function<T, T4> m4,
      Function<T, T5> m5, Function<T, T6> m6, Function<T, T7> m7, Function<T, T8> m8, Function<T, T9> m9,
      Function<T, T10> m10, Function<T, T11> m11) {
    return new DuodecupleMapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11);
  }

  public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Function<T, Tredecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> toTuple(
      Function<T, T0> m0, Function<T, T1> m1, Function<T, T2> m2, Function<T, T3> m3, Function<T, T4> m4,
      Function<T, T5> m5, Function<T, T6> m6, Function<T, T7> m7, Function<T, T8> m8, Function<T, T9> m9,
      Function<T, T10> m10, Function<T, T11> m11, Function<T, T12> m12) {
    return new TredecupleMapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12);
  }

  public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Function<T, Quattuordecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> toTuple(
      Function<T, T0> m0, Function<T, T1> m1, Function<T, T2> m2, Function<T, T3> m3, Function<T, T4> m4,
      Function<T, T5> m5, Function<T, T6> m6, Function<T, T7> m7, Function<T, T8> m8, Function<T, T9> m9,
      Function<T, T10> m10, Function<T, T11> m11, Function<T, T12> m12, Function<T, T13> m13) {
    return new QuattuordecupleMapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13);
  }

  public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Function<T, Quindecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>> toTuple(
      Function<T, T0> m0, Function<T, T1> m1, Function<T, T2> m2, Function<T, T3> m3, Function<T, T4> m4,
      Function<T, T5> m5, Function<T, T6> m6, Function<T, T7> m7, Function<T, T8> m8, Function<T, T9> m9,
      Function<T, T10> m10, Function<T, T11> m11, Function<T, T12> m12, Function<T, T13> m13, Function<T, T14> m14) {
    return new QuindecupleMapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14);
  }

  public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Function<T, Sexdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> toTuple(
      Function<T, T0> m0, Function<T, T1> m1, Function<T, T2> m2, Function<T, T3> m3, Function<T, T4> m4,
      Function<T, T5> m5, Function<T, T6> m6, Function<T, T7> m7, Function<T, T8> m8, Function<T, T9> m9,
      Function<T, T10> m10, Function<T, T11> m11, Function<T, T12> m12, Function<T, T13> m13, Function<T, T14> m14,
      Function<T, T15> m15) {
    return new SexdecupleMapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15);
  }

  public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Function<T, Septendecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>> toTuple(
      Function<T, T0> m0, Function<T, T1> m1, Function<T, T2> m2, Function<T, T3> m3, Function<T, T4> m4,
      Function<T, T5> m5, Function<T, T6> m6, Function<T, T7> m7, Function<T, T8> m8, Function<T, T9> m9,
      Function<T, T10> m10, Function<T, T11> m11, Function<T, T12> m12, Function<T, T13> m13, Function<T, T14> m14,
      Function<T, T15> m15, Function<T, T16> m16) {
    return new SeptendecupleMapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16);
  }

  public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> Function<T, Octodecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>> toTuple(
      Function<T, T0> m0, Function<T, T1> m1, Function<T, T2> m2, Function<T, T3> m3, Function<T, T4> m4,
      Function<T, T5> m5, Function<T, T6> m6, Function<T, T7> m7, Function<T, T8> m8, Function<T, T9> m9,
      Function<T, T10> m10, Function<T, T11> m11, Function<T, T12> m12, Function<T, T13> m13, Function<T, T14> m14,
      Function<T, T15> m15, Function<T, T16> m16, Function<T, T17> m17) {
    return new OctodecupleMapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17);
  }

  public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> Function<T, Novemdecuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>> toTuple(
      Function<T, T0> m0, Function<T, T1> m1, Function<T, T2> m2, Function<T, T3> m3, Function<T, T4> m4,
      Function<T, T5> m5, Function<T, T6> m6, Function<T, T7> m7, Function<T, T8> m8, Function<T, T9> m9,
      Function<T, T10> m10, Function<T, T11> m11, Function<T, T12> m12, Function<T, T13> m13, Function<T, T14> m14,
      Function<T, T15> m15, Function<T, T16> m16, Function<T, T17> m17, Function<T, T18> m18) {
    return new NovemdecupleMapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17,
        m18);
  }

  public static <T, T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> Function<T, Vigintuple<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>> toTuple(
      Function<T, T0> m0, Function<T, T1> m1, Function<T, T2> m2, Function<T, T3> m3, Function<T, T4> m4,
      Function<T, T5> m5, Function<T, T6> m6, Function<T, T7> m7, Function<T, T8> m8, Function<T, T9> m9,
      Function<T, T10> m10, Function<T, T11> m11, Function<T, T12> m12, Function<T, T13> m13, Function<T, T14> m14,
      Function<T, T15> m15, Function<T, T16> m16, Function<T, T17> m17, Function<T, T18> m18, Function<T, T19> m19) {
    return new VigintupleMapperImpl<>(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17,
        m18, m19);
  }

}