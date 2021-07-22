package example.data.structure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description : LinkList是整个链表，包括头结点以及链表元素个数；
 * 链表：是由不连续的内存空间组成；
 * 链表的优点： 插入删除速度快 内存利用率高，不会浪费内存 大小没有固定，拓展很灵活。（每一个数据存储了下一个数据的地址，增删效率高）
 * 链表的缺点：不能随机查找，必须从第一个开始遍历，查找效率低
 * @author : xiaokui
 * @date : 2021-07-08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinkList {

    /**
     * 链表的头结点
     */
    public LinkNode head;

    /**
     * 链表的元素个数
     */
    public int size;
}
