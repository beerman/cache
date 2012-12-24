package com.skymobi.sns.cache.redis.transcoders;

/**
 * User: thor
 * Date: 12-12-21
 * Time: 下午3:37
 */
public interface Transcoder<T> {

    public final static IntegerTranscoder INTEGER_TRANSCODER = new IntegerTranscoder();
    public final static LongTranscoder LONG_TRANSCODER = new LongTranscoder();
    public final static DoubleTranscoder DOUBLE_TRANSCODER = new DoubleTranscoder();
    public final static StringTranscoder STRING_TRANSCODER = new StringTranscoder();
    public final static SerializingTranscoder SERIALIZING_TRANSCODER = new SerializingTranscoder();

    byte[] encode(T v);

    T decode(byte[] v);
}
