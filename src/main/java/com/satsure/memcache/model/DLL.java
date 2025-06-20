package com.satsure.memcache.model;

public class DLL<K> {
    private final LRUNode<K> head;
    private final LRUNode<K> tail;

    public DLL() {
        this.head = new LRUNode<>(null);
        this.tail = new LRUNode<>(null);
        head.setNext(tail);
        tail.setPrev(head);
    }

    public void addToFront(LRUNode<K> lruNode) {
        lruNode.setNext(head.getNext());
        lruNode.setPrev(head);
        head.getNext().setPrev(lruNode);
        head.setNext(lruNode);
    }

    public void remove(LRUNode<K> lruNode) {
        lruNode.getPrev().setNext(lruNode.getNext());
        lruNode.getNext().setPrev(lruNode.getPrev());
    }

    public void reset() {
        head.setNext(tail);
        tail.setPrev(head);
    }

    public boolean isEmpty() {
        return tail.getPrev() == head;
    }
}
