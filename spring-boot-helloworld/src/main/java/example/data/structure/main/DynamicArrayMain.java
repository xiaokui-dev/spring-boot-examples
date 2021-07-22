package com.java.main;

import com.java.dao.DynamicArrayDao;
import com.java.model.DynamicArray;
import static com.java.model.DynamicArray.capacity;

public class DynamicArrayMain {
    public static void main(String[] args) {
        DynamicArrayDao dynamicArrayDao=new DynamicArrayDao();
        //初始化动态数组
        DynamicArray myArray=dynamicArrayDao.Init_Array();
        System.out.println("初始化动态数组:");
        //获取容量
        System.out.println("数组容量:"+capacity);
        System.out.println("数组实际大小:"+dynamicArrayDao.Size_Array(myArray));
        //插入元素
        for(int i=0;i<10;i++){
            dynamicArrayDao.PushBack_Array(myArray,i);
        }
        System.out.println();

        System.out.println("插入元素之后:");
        //获取容量
        System.out.println("数组容量:"+capacity);
        System.out.println("数组实际大小:"+dynamicArrayDao.Size_Array(myArray));
        System.out.println();

        //打印插入元素
        System.out.println("打印插入的元素:");
        dynamicArrayDao.Print_Array(myArray);
        System.out.println();

        //根据元素位置删除元素
        dynamicArrayDao.RemoveByPos_Array(myArray,2);
        //根据元素值删除元素
        dynamicArrayDao.RemoveByValue_Array(myArray,7);
        System.out.println();

        //打印删除后的数组
        System.out.println("打印删除后的元素:");
        dynamicArrayDao.Print_Array(myArray);
        System.out.println();

        //查找元素为5的位置
        System.out.println();
        System.out.print("元素5的位置为: ");
        int pos=dynamicArrayDao.Find_Array(myArray,5);
        System.out.println(pos);

        //查找位置为7的元素值
        System.out.println();
        System.out.print("位置为7的元素为: ");
        int value=dynamicArrayDao.At_Array(myArray,7);
        System.out.println(value);

        //获取容量
        System.out.println();
        System.out.println("此时的数组容量:"+capacity);
        System.out.println("此时的数组实际大小:"+dynamicArrayDao.Size_Array(myArray));
        System.out.println();
    }
}
