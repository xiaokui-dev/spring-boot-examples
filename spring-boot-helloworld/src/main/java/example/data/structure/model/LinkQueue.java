package com.java.model;

public class LinkQueue {
    //队列头结点
    public LinkQueueNode head;
    //队列容量
    public int size;

    public LinkQueue(LinkQueueNode head, int size) {
        this.head = head;
        this.size = size;
    }
}
