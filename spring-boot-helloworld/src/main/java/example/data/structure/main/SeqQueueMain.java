package example.data.structure.main;


import example.data.structure.dao.SeqQueueDao;
import example.data.structure.model.SeqQueue;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2021-07-11
 */
public class SeqQueueMain {
    public static void main(String[] args) {
        SeqQueueDao seqQueueDao = new SeqQueueDao();
        //初始化队列
        SeqQueue queue = seqQueueDao.initSeqQueue();

        //入队
        seqQueueDao.pushSeqQueue(queue, "A");
        seqQueueDao.pushSeqQueue(queue, "B");
        seqQueueDao.pushSeqQueue(queue, "C");
        seqQueueDao.pushSeqQueue(queue, "D");
        seqQueueDao.pushSeqQueue(queue, "E");

        //出队
        while (queue.size > 0) {
            //查找队头元素
            Object o = seqQueueDao.frontSeqQueue(queue);
            System.out.println(o);
            //出队
            seqQueueDao.popSeqQueue(queue);
        }
    }
}
