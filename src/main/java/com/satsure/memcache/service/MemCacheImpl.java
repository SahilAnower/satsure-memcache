package com.satsure.memcache.service;

import java.util.Map;

public class MemCacheImpl<K, V> implements Memcache<K, V> {

    @Override
    public void put(K key, V value) {

    }

    @Override
    public void put(K key, V value, long expiresAt) {

    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public boolean delete(K key) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Map<String, Object> getStats() {
        return Map.of();
    }
}
