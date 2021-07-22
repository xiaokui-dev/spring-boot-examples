package example.data.structure.main;

import example.data.structure.dao.LinkListDao;
import example.data.structure.model.LinkList;

import java.util.LinkedList;

/**
 * Description : 链表方法测试
 *
 * @author : xiaokui
 * @date : 2021-07-08
 */
public class LinkListMain {

    public static void main(String[] args) {
        LinkListDao linkListDao = new LinkListDao();
        //创建链表
        LinkList list = linkListDao.initLinkList();

        //数据插入链表
        linkListDao.insertLinkList(list, 0, "A");
        linkListDao.insertLinkList(list, 1, "B");
        linkListDao.insertLinkList(list, 2, "C");
        linkListDao.insertLinkList(list, 3, "D");
        linkListDao.insertLinkList(list, 4, "D");

        //打印链表
        System.out.println("插入数据之后的链表为:");
        linkListDao.printLinkList(list);
        System.out.println();

        //删除指定位置的值
        linkListDao.removeByPosLinkList(list, 2);

        //打印链表
        System.out.println("删除元素C之后的链表为:");
        linkListDao.printLinkList(list);
        System.out.println();

        //获得链表长度
        System.out.println("链表长度为:");
        System.out.println(linkListDao.sizeLinkList(list));

        //查找值为3的位置
        System.out.println("值为D的位置为:");
        linkListDao.findLinkList(list, "D");
        System.out.println();

        //返回第一个结点元素的值
        System.out.println("第一个结点元素为:");
        System.out.println(linkListDao.frontLinkList(list));

        new LinkedList<>().add(1,"L");
    }


}
