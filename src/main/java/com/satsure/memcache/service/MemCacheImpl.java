package com.satsure.memcache.service;

import com.satsure.memcache.model.CacheEntry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MemCacheImpl<K, V> implements Memcache<K, V> {

    private final Integer maxSize;
    private final Long defaultTtl;
    private final Map<K, CacheEntry<V>> cacheEntryMap;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    private final AtomicLong hits = new AtomicLong(0);
    private final AtomicLong misses = new AtomicLong(0);
    private final AtomicLong evictions = new AtomicLong(0);
    private final AtomicLong expiredRemovals = new AtomicLong(0);

    public MemCacheImpl(Integer maxSize, Long defaultTtl) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("Max size not valid");
        }

        this.maxSize = maxSize;
        this.defaultTtl = defaultTtl;
        this.cacheEntryMap = new ConcurrentHashMap<>(maxSize);
    }

    @Override
    public void put(K key, V value) {
        put(key, value, System.currentTimeMillis() + defaultTtl);
    }

    @Override
    public void put(K key, V value, long expiresAt) {
        writeLock.lock();
        try {

        }catch (Exception ex) {

        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public V get(K key) {
        readLock.lock();
        try {

        } catch (Exception ex) {

        } finally {
            readLock.unlock();
        }
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
