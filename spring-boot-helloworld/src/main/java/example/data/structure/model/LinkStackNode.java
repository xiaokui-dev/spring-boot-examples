package com.java.model;

public class LinkStackNode {
    //栈结点的数据域
    public Object data;
    //栈结点的指针
    public LinkStackNode next;

    //构造方法
    public LinkStackNode(Object data, LinkStackNode next) {
        this.data = data;
        this.next = next;
    }
}
