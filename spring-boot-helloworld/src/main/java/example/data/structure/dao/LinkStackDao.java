package com.java.dao;

import com.java.model.LinkStack;
import com.java.model.LinkStackNode;

public class LinkStackDao {
    //初始化栈
    public LinkStack Init_LinkStack(){
        //初始化栈顶指针
        LinkStackNode head=new LinkStackNode(0,null);
        //初始化栈
        LinkStack stack=new LinkStack(head,0);

        return stack;
    }

    //入栈
    public void Push_LinkStack(LinkStack stack,Object data){
        if (stack == null){
            return;
        }
        if (data == null){
            return;
        }
        //创建新插入的结点，也就是栈顶指针后面的第一个元素，因为只能在栈顶进行元素插入或删除
        LinkStackNode newNode=new LinkStackNode(data,null);
        //进入插入操作
        newNode.next=stack.head.next;
        //栈顶指针的next等于新插入结点
        stack.head.next=newNode;
        //栈容量加1
        stack.size++;
    }

    //出栈
    public void Pop_LinkStack(LinkStack stack){
        if (stack == null){
            return;
        }
        if (stack.size == 0){
            return;
        }
        //删除栈顶指针后面的第一个元素
        stack.head.next=stack.head.next.next;
        //栈容量减1
        stack.size--;
    }

    //返回栈顶元素
    public Object Top_LinkStack(LinkStack stack){
        if (stack == null){
            return null;
        }
        if (stack.size == 0){
            return null;
        }
        //栈顶元素也就是栈顶指针后面的第一个元素
        return stack.head.next.data;
    }

    //返回栈容量，也就是栈元素个数
    public int Size_LinkStack(LinkStack stack){
        if (stack == null){
            return -1;
        }
        return stack.size;
    }

    //清空栈
    public void Clear_LinkStack(LinkStack stack){
        if (stack == null){
            return ;
        }
        stack.head.next=null;
        stack.size=0;
    }
}
