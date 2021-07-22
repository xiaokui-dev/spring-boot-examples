package com.java.model;

public class SeqStack {
    //动态数组的最大容量
    public final static int Max_Size=1024;

    //栈的结点数据
    public Object[] data;
    //栈的长度，用来标识数组中的元素个数
    public int size;

    //构造函数
    public SeqStack(Object[] data, int size) {
        this.data = data;
        this.size = size;
    }
}
