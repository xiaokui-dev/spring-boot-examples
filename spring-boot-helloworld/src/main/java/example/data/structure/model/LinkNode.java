package com.java.model;

public class LinkNode {
    //链表结点的数据域
    public Object data;
    //链表结点的指针域
    public LinkNode next;

    public LinkNode() {
        super();
        // TODO Auto-generated constructor stub
    }

    //构造方法
    public LinkNode(Object data, LinkNode next) {
        super();
        this.data = data;
        this.next = next;
    }

}
