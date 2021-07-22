package example.data.structure.dao;

import example.data.structure.model.LinkList;
import example.data.structure.model.LinkNode;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2021-07-08
 */
public class LinkListDao {

    /**
     * 初始化链表
     */
    public LinkList initLinkList() {
        // 设置头结点的指针域和数据域
        LinkNode node = new LinkNode(0, null);
        return new LinkList(node, 0);
    }

    /**
     * 指定位置插入
     */
    public void insertLinkList(LinkList list, int pos, Object data) {
        //判断list是否有效
        if (list == null) {
            return;
        }
        //判断data是否有效
        if (data == null) {
            return;
        }
        //判断位置pos是否有效
        if (pos < 0 || pos > list.size) {
            //在链表的尾部插入
            pos = list.size;
        }

        //第一步，创建新的结点，也就是待插入的结点
        LinkNode newNode = new LinkNode(data, null);
        //第二步，找到待插入结点前面一个结点pCurrent，并使其等于list的头结点
        LinkNode pCurrent = list.head;
        for (int i = 0; i < pos; i++) {
            pCurrent = pCurrent.next;
        }
        //第三步，新结点入链表，进行插入操作
//        newNode.next = pCurrent.next;
        pCurrent.next = newNode;
        //第四步，链表的size要加1
        list.size++;

    }

    /**
     * 删除指定位置的值
     */
    public void removeByPosLinkList(LinkList list, int pos) {
        if (list == null) {
            return;
        }
        if (pos < 0 || pos >= list.size) {
            return;
        }
        //第一步，找到待删除结点的前面一个结点pCurrent
        LinkNode pCurrent = list.head;
        for (int i = 0; i < pos; i++) {
            pCurrent = pCurrent.next;
        }
        //第二步，进行删除操作
        pCurrent.next = pCurrent.next.next;
        //第三步，链表的size要减1
        list.size--;
    }

    /**
     * 获得链表的长度
     */
    public int sizeLinkList(LinkList list) {
        return list.size;
    }

    /**
     * 查找指定元素的位置
     */
    public void findLinkList(LinkList list, Object data) {
        //注意这里要从头结点的下一个结点开始，因为头结点不存放数据信息
        LinkNode pCurrent = list.head.next;
        for (int i = 0; i < list.size; i++) {
            if (pCurrent.data == data) {
                System.out.print(i + ",");
            }
            pCurrent = pCurrent.next;
        }
    }

    /**
     * 返回第一个结点元素的值
     */
    public Object frontLinkList(LinkList list) {
        return list.head.next.data;
    }

    /**
     * 打印链表结点
     */
    public void printLinkList(LinkList list) {
        if (list == null) {
            return;
        }
        LinkNode pCurrent = list.head.next;
        for (int i = 0; i < list.size; i++) {
            System.out.print(pCurrent.data + ",");
            pCurrent = pCurrent.next;
        }
    }


}
