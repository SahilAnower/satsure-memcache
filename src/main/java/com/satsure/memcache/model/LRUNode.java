package com.satsure.memcache.model;

public class LRUNode<K> {
    private K key;
    private LRUNode<K> prev;
    private LRUNode<K> next;

    public LRUNode(K key) {
        this.key = key;
        this.prev = null;
        this.next = null;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setPrev(LRUNode<K> prev) {
        this.prev = prev;
    }

    public void setNext(LRUNode<K> next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public LRUNode<K> getPrev() {
        return prev;
    }

    public LRUNode<K> getNext() {
        return next;
    }
}
