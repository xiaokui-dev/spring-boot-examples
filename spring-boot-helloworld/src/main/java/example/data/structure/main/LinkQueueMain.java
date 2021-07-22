package example.data.structure.main;


import example.data.structure.dao.LinkQueueDao;
import example.data.structure.model.LinkQueue;

/**
 * Description :队列方法
 *
 * @author : xiaokui
 * @date : 2021-07-08
 */
public class LinkQueueMain {

    public static void main(String[] args) {
        LinkQueueDao linkQueueDao = new LinkQueueDao();
        //初始化队列
        LinkQueue queue = linkQueueDao.initLinkQueue();

        //入队列
        linkQueueDao.pushLinkQueue(queue, "A");
        linkQueueDao.pushLinkQueue(queue, "B");
        linkQueueDao.pushLinkQueue(queue, "C");
        linkQueueDao.pushLinkQueue(queue, "D");
        linkQueueDao.pushLinkQueue(queue, "E");

        //输出队列元素
        while (!linkQueueDao.isEmptyLinkQueue(queue)) {
            //查找队头元素
            Object o = linkQueueDao.frontLinkQueue(queue);
            System.out.println(o);
            //出队列
            linkQueueDao.popLinkQueue(queue);
        }
    }
}
