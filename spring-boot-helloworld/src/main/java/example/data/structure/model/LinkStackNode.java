package example.data.structure.model;

/**
 * Description :
 * 栈的链式存储简称链栈；
 * 存储结构类似于链表；
 * <p>
 * 包括链栈结点的数据域和指针域；
 * 数据域是Object类型的，指针域是LinkStackNode类型的
 *
 * @author : xiaokui
 * @date : 2021-07-11
 */
public class LinkStackNode {

    /**
     * 栈结点的数据域
     */
    public Object data;

    /**
     * 栈结点的指针
     */
    public LinkStackNode next;

    public LinkStackNode(Object data, LinkStackNode next) {
        this.data = data;
        this.next = next;
    }
}

