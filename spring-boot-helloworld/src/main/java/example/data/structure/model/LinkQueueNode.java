package com.java.model;

public class LinkQueueNode {
    //队列结点的数据域
    public Object data;
    //队列结点的指针
    public LinkQueueNode next;

    //构造方法
    public LinkQueueNode(Object data, LinkQueueNode next) {
        this.data = data;
        this.next = next;
    }
}
