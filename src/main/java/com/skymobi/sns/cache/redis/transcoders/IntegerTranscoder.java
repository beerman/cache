package com.skymobi.sns.cache.redis.transcoders;

/**
 * User: thor
 * Date: 12-12-21
 * Time: 下午3:38
 */
public class IntegerTranscoder implements Transcoder<Integer> {
    @Override
    public byte[] encode(Integer v) {
        return String.valueOf(v).getBytes();
    }

    @Override
    public Integer decode(byte[] v) {
        return Integer.parseInt(new String(v));
    }
}
