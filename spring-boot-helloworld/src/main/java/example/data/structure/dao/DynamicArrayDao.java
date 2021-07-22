package com.java.dao;

import com.java.model.DynamicArray;
import static com.java.model.DynamicArray.capacity;

public class DynamicArrayDao {

    //初始化数组
    public DynamicArray Init_Array(){
        //数组数据域初始化
        int[] data1=new int[capacity];

        //DynamicArray初始化
        DynamicArray myArray=new DynamicArray(data1,0);

        //数组赋值
        for(int i=0;i<capacity;i++){
            myArray.data[i]=0;
        }
        return myArray;
    }

    //插入指定值
    public void PushBack_Array(DynamicArray array,int value){
        if(array==null){
            return;
        }
        //如果线性表容量小于或等于数组容量
        if(array.size==capacity){
            return;
        }
        //插入元素
        array.data[array.size]=value;
        array.size++;
    }

    //根据位置删除
    public void RemoveByPos_Array(DynamicArray array,int pos){
        if (array == null){
            return;
        }
        //判断位置是否有效
        if(pos < 0 || pos >= array.size){
            return;
        }
        //删除元素
        for (int i = pos; i < array.size -1; i ++){
            array.data[i] = array.data[i + 1];
        }
        array.size--;
    }

    //查找元素,返回该值第一次出现时对应的下标位置
    public int Find_Array(DynamicArray array,int value){
        if(array==null){
            return -1;
        }
        //找到该值第一次出现的位置，-1表示没有找到；
        int pos=-1;
        for(int i=0;i<array.size;i++){
            if(array.data[i]==value){
                pos=i;
                break;
            }
        }
        return pos;
    }

    //根据位置查找到某个元素
    public int At_Array(DynamicArray array,int pos){
        if(array==null){
            return -1;
        }
        return array.data[pos];
    }

    //根据值删除
    public void RemoveByValue_Array(DynamicArray array,int value){
        if(array==null){
            return;
        }
        //首先找到该值对应的数组下标
        int pos=Find_Array(array,value);
        //调用根据位置删除的方法
        RemoveByPos_Array(array,pos);
    }

    //打印
    public void Print_Array(DynamicArray array){
        if(array==null){
            return;
        }
        for(int i=0;i<array.size;i++){
            System.out.print(array.data[i]+",");
        }
    }

    //清空数组
    public void Clear_Array(DynamicArray array){
        if(array==null){
            return;
        }
        for(int i=0;i<array.size;i++){
            array.data[i]=0;
        }
        array.size=0;
    }

    //获得动态数组当前元素个数
    public int Size_Array(DynamicArray array){
        if(array==null){
            return -1;
        }
        return array.size;
    }
}
