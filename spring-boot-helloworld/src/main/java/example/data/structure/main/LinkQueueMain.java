package com.java.main;

import com.java.dao.LinkQueueDao;
import com.java.model.LinkQueue;

public class LinkQueueMain {
    public static void main(String[] args) {
        LinkQueueDao linkQueueDao=new LinkQueueDao();
        //初始化队列
        LinkQueue queue=linkQueueDao.Init_LinkQueue();

        //入队列
        linkQueueDao.Push_LinkQueue(queue,"A");
        linkQueueDao.Push_LinkQueue(queue,"B");
        linkQueueDao.Push_LinkQueue(queue,"C");
        linkQueueDao.Push_LinkQueue(queue,"D");
        linkQueueDao.Push_LinkQueue(queue,"E");

        //输出队列元素
        while(!linkQueueDao.IsEmpty_LinkQueue(queue)){
            //查找队头元素
            Object o=linkQueueDao.Front_LinkQueue(queue);
            System.out.println(o);
            //出队列
            linkQueueDao.Pop_LinkQueue(queue);
        }
    }
}
