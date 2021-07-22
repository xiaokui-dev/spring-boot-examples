package example.data.structure.dao;

import example.data.structure.model.SeqQueue;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2021-07-11
 */
public class SeqQueueDao {

    /**
     * 初始化队列
     */
    public SeqQueue initSeqQueue() {
        //动态数组初始化，加数组容量
        Object[] data1 = new Object[SeqQueue.MAX_SIZE];

        //栈初始化，元素个数size为0
        SeqQueue queue = new SeqQueue(data1, 0);

        //数组赋值
        for (int i = 0; i < SeqQueue.MAX_SIZE; i++) {
            queue.data[i] = 0;
        }
        return queue;
    }

    /**
     * 入队
     */
    public void pushSeqQueue(SeqQueue queue, Object data) {
        if (queue == null) {
            return;
        }
        if (data == null) {
            return;
        }
        //如果队列容量小于或等于数组容量
        if (queue.size == SeqQueue.MAX_SIZE) {
            return;
        }
        //元素入队
        queue.data[queue.size] = data;
        queue.size++;
    }

    /**
     * 返回队头元素
     */
    public Object frontSeqQueue(SeqQueue queue) {
        if (queue == null) {
            return null;
        }
        if (queue.size == 0) {
            return null;
        }
        //队头元素下标为0
        return queue.data[0];
    }

    /**
     * 返回队尾元素
     */
    public Object backSeqQueue(SeqQueue queue) {
        if (queue == null) {
            return null;
        }
        if (queue.size == 0) {
            return null;
        }
        //队尾元素，数组下标从0开始，所以减一
        return queue.data[queue.size - 1];
    }

    /**
     * 获取队列长度
     */
    public int getLengthSeqQueue(SeqQueue queue) {
        if (queue == null) {
            return 0;
        }
        return queue.size;
    }

    /**
     * 出队
     */
    public void popSeqQueue(SeqQueue queue) {
        if (queue == null) {
            return;
        }
        if (queue.size == 0) {
            return;
        }
        //出队操作需要移动全部元素
        for (int i = 0; i < queue.size - 1; i++) {
            queue.data[i] = queue.data[i + 1];
        }
        queue.size--;
    }

    /**
     * 清空队列
     */
    public void clearSeqQueue(SeqQueue queue) {
        if (queue == null) {
            return;
        }
        queue.size = 0;
    }

    /**
     * 判断队列是否为空
     */
    public boolean isEmpty(SeqQueue queue) {
        if (queue == null) {
            return false;
        }
        if (queue.size == 0) {
            return true;
        }
        return false;
    }
}
