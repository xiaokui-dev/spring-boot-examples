package com.java.main;

import com.java.dao.SeqQueueDao;
import com.java.model.SeqQueue;

public class SeqQueueMain {
    public static void main(String[] args) {
        SeqQueueDao seqQueueDao=new SeqQueueDao();
        //初始化队列
        SeqQueue queue=seqQueueDao.Init_SeqQueue();

        //入队
        seqQueueDao.Push_SeqQueue(queue,"A");
        seqQueueDao.Push_SeqQueue(queue,"B");
        seqQueueDao.Push_SeqQueue(queue,"C");
        seqQueueDao.Push_SeqQueue(queue,"D");
        seqQueueDao.Push_SeqQueue(queue,"E");

        //出队
        while (queue.size>0){
            //查找队头元素
            Object o=seqQueueDao.Front_SeqQueue(queue);
            System.out.println(o);
            //出队
            seqQueueDao.Pop_SeqQueue(queue);
        }
    }
}
