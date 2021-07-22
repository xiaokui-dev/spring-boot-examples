package com.java.dao;

import com.java.model.LinkQueue;
import com.java.model.LinkQueueNode;

public class LinkQueueDao {
    //初始化队列
    public LinkQueue Init_LinkQueue(){
        //初始化队列头结点
        LinkQueueNode head=new LinkQueueNode(0,null);
        //初始化队列
        LinkQueue queue=new LinkQueue(head,0);

        return queue;
    }

    //入队列
    public void Push_LinkQueue(LinkQueue queue,Object data){
        if (queue == null){
            return;
        }
        if (data == null){
            return;
        }
        //创建新插入的结点，也就是队列顶指针后面的第一个元素，因为只能在队列顶进行元素插入或删除
        LinkQueueNode newNode=new LinkQueueNode(data,null);
        //进入插入操作
        newNode.next=queue.head.next;
        //队列顶指针的next等于新插入结点
        queue.head.next=newNode;
        //队列容量加1
        queue.size++;
    }

    //出队列
    public void Pop_LinkQueue(LinkQueue queue){
        if (queue == null){
            return;
        }
        if (queue.size == 0){
            return;
        }
        //pPrev指头结点，pCurrent指头结点后面的第一个元素，直到pCurrent为空为止
        LinkQueueNode pPrev=queue.head;
        LinkQueueNode pCurrent=pPrev.next;
        while (pCurrent.next!=null){
            pPrev=pCurrent;
            pCurrent=pPrev.next;
        }
        pPrev.next=null;
        //队列容量减1
        queue.size--;
    }

    //返回队尾元素
    public Object Top_LinkQueue(LinkQueue queue){
        if (queue == null){
            return null;
        }
        if (queue.size == 0){
            return null;
        }
        //队尾元素也就是队列头指针后面的第一个元素
        return queue.head.next.data;
    }

    //返回队头元素
    public Object Front_LinkQueue(LinkQueue queue){
        if (queue == null){
            return null;
        }
        if (queue.size == 0){
            return null;
        }
        //队头元素也就是前面插入的元素，采用循环一直找到队头元素
        LinkQueueNode pCurrent=queue.head;
        while (pCurrent.next!=null){
            pCurrent=pCurrent.next;
        }
        return pCurrent.data;
    }

    //返回队列容量，也就是队列元素个数
    public int Size_LinkQueue(LinkQueue queue){
        if (queue == null){
            return -1;
        }
        return queue.size;
    }

    //判断队列是否为空
    public boolean IsEmpty_LinkQueue(LinkQueue queue){
        if(queue.size==0){
            return true;
        }
        return false;
    }

    //清空队列
    public void Clear_LinkQueue(LinkQueue queue){
        if (queue == null){
            return ;
        }
        queue.head.next=null;
        queue.size=0;
    }
}
