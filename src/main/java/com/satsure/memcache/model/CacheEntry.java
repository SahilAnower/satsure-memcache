package com.satsure.memcache.model;

public class CacheEntry<V> {
    private V value;
    private final Long expiresAt;
    private LRUNode<?> lruNode;

    public CacheEntry(V value, Long expiresAt) {
        this.value = value;
        this.expiresAt = expiresAt;
    }

    public boolean isExpired() {
        return System.currentTimeMillis() > expiresAt;
    }

    public void setLruNode(LRUNode<?> lruNode) {
        this.lruNode = lruNode;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
