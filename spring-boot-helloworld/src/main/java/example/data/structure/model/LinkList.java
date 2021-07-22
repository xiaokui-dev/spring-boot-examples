package com.java.model;

public class LinkList {
    //链表的头结点
    public LinkNode head;
    //链表的元素个数
    public int size;

    public LinkList() {
        super();
        // TODO Auto-generated constructor stub
    }

    ///构造方法
    public LinkList(LinkNode head, int size) {
        super();
        this.head = head;
        this.size = size;
    }

}
