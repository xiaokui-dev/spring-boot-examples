package com.java.model;

public class LinkStack {
    //栈顶指针，也就是所谓的头结点
    public LinkStackNode head;
    //栈的容量
    public int size;

    public LinkStack(LinkStackNode head, int size) {
        this.head = head;
        this.size = size;
    }
}
