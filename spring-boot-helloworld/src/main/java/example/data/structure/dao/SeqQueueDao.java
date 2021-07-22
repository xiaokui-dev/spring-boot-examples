package com.java.dao;

import com.java.model.SeqQueue;
import static com.java.model.SeqQueue.Max_Size;

public class SeqQueueDao {
    //初始化队列
    public SeqQueue Init_SeqQueue(){
        //动态数组初始化，加数组容量
        Object[] data1=new Object[Max_Size];

        //栈初始化，元素个数size为0
        SeqQueue queue=new SeqQueue(data1,0);

        //数组赋值
        for(int i=0;i<Max_Size;i++){
            queue.data[i]=0;
        }
        return queue;
    }

    //入队
    public void Push_SeqQueue(SeqQueue queue, Object data){
        if(queue==null){
            return;
        }
        if(data==null){
            return;
        }
        //如果队列容量小于或等于数组容量
        if(queue.size==Max_Size){
            return;
        }
        //元素入队
        queue.data[queue.size]=data;
        queue.size++;
    }

    //返回队头元素
    public Object Front_SeqQueue(SeqQueue queue){
        if(queue==null){
            return null;
        }
        if(queue.size==0){
            return null;
        }
        //队头元素下标为0
        return queue.data[0];
    }

    //返回队尾元素
    public Object Back_SeqQueue(SeqQueue queue){
        if(queue==null){
            return null;
        }
        if(queue.size==0){
            return null;
        }
        //队尾元素，数组下标从0开始，所以减一
        return queue.data[queue.size-1];
    }

    //获取队列长度
    public int GetLengthSeqQueue(SeqQueue queue){
        if(queue==null){
            return 0;
        }
        return queue.size;
    }

    //出队
    public void Pop_SeqQueue(SeqQueue queue){
        if(queue==null){
            return;
        }
        if(queue.size==0){
            return;
        }
        //出队操作需要移动全部元素
        for (int i = 0; i < queue.size-1; i++) {
            queue.data[i]=queue.data[i+1];
        }
        queue.size--;
    }

    //清空队列
    public void Clear_SeqQueue(SeqQueue queue){
        if(queue==null){
            return;
        }
        queue.size=0;
    }

    //判断队列是否为空
    public boolean IsEmpty(SeqQueue queue){
        if(queue==null){
            return false;
        }
        if(queue.size==0){
            return true;
        }
        return false;
    }
}
