package com.satsure.memcache.service;

import java.util.Map;

public interface Memcache<K, V> {
    void put(K key, V value);

    void put(K key, V value, long expiresAt);

    V get(K key);

    boolean delete(K key);

    void clear();

    Map<String, Object> getStats();
}
