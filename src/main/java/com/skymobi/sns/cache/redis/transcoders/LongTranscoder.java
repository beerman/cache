package com.skymobi.sns.cache.redis.transcoders;

/**
 * User: thor
 * Date: 12-12-21
 * Time: 下午3:40
 */
public class LongTranscoder implements Transcoder<Long>{
    @Override
    public byte[] encode(Long v) {
        return String.valueOf(v).getBytes();
    }

    @Override
    public Long decode(byte[] v) {
        return Long.parseLong(new String(v));
    }
}
