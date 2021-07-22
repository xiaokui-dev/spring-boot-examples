package example.data.structure.dao;

import example.data.structure.model.LinkStack;
import example.data.structure.model.LinkStackNode;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2021-07-11
 */
public class LinkStackDao {

    public LinkStack initLinkStack() {
        //初始化栈顶指针
        LinkStackNode head = new LinkStackNode(0, null);
        //初始化栈
        return new LinkStack(head, 0);
    }

    public void pushLinkStack(LinkStack stack, Object data) {
        if (stack == null) {
            return;
        }
        if (data == null) {
            return;
        }
        //创建新插入的结点，也就是栈顶指针后面的第一个元素，因为只能在栈顶进行元素插入或删除
        LinkStackNode newNode = new LinkStackNode(data, null);
        //进入插入操作
        newNode.next = stack.head.next;
        //栈顶指针的next等于新插入结点
        stack.head.next = newNode;
        //栈容量加1
        stack.size++;
    }

    public void popLinkStack(LinkStack stack) {
        if (stack == null) {
            return;
        }
        if (stack.size == 0) {
            return;
        }
        //删除栈顶指针后面的第一个元素
        stack.head.next = stack.head.next.next;
        //栈容量减1
        stack.size--;
    }

    public Object topLinkStack(LinkStack stack) {
        if (stack == null) {
            return null;
        }
        if (stack.size == 0) {
            return null;
        }
        //栈顶元素也就是栈顶指针后面的第一个元素
        return stack.head.next.data;
    }

    public int sizeLinkStack(LinkStack stack) {
        if (stack == null) {
            return -1;
        }
        return stack.size;
    }

    public void clearLinkStack(LinkStack stack) {
        if (stack == null) {
            return;
        }
        stack.head.next = null;
        stack.size = 0;
    }


}
