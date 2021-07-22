package com.java.main;

import com.java.dao.LinkListDao;
import com.java.model.LinkList;

public class LinkListMain {
    public static void main(String[] args) {
        LinkListDao linkListDao=new LinkListDao();
        //创建链表
        LinkList list=linkListDao.Init_LinkList();

        //数据插入链表
        linkListDao.Insert_LinkList(list, 0, "A");
        linkListDao.Insert_LinkList(list, 1, "B");
        linkListDao.Insert_LinkList(list, 2, "C");
        linkListDao.Insert_LinkList(list, 3, "D");
        linkListDao.Insert_LinkList(list, 4, "D");

        //打印链表
        System.out.println("插入数据之后的链表为:");
        linkListDao.Print_LinkList(list);
        System.out.println();

        //删除指定位置的值
        linkListDao.RemoveByPos_LinkList(list, 2);

        //打印链表
        System.out.println("删除元素C之后的链表为:");
        linkListDao.Print_LinkList(list);
        System.out.println();

        //获得链表长度
        System.out.println("链表长度为:");
        System.out.println(linkListDao.Size_LinkList(list));

        //查找值为3的位置
        System.out.println("值为D的位置为:");
        linkListDao.Find_LinkList(list, "D");
        System.out.println();

        //返回第一个结点元素的值
        System.out.println("第一个结点元素为:");
        System.out.println(linkListDao.Front_LinkList(list));
    }
}
