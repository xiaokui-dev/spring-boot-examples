package com.java.model;

public class SeqQueue {
    //动态数组的最大容量
    public final static int Max_Size=1024;

    //队列的结点数据
    public Object[] data;
    //队列的长度，用来标识数组中的元素个数
    public int size;

    //构造函数
    public SeqQueue(Object[] data, int size) {
        this.data = data;
        this.size = size;
    }
}
