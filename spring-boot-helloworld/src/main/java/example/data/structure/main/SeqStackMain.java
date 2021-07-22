package example.data.structure.main;

import example.data.structure.dao.SeqStackDao;
import example.data.structure.model.SeqStack;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2021-07-11
 */
public class SeqStackMain {

    public static void main(String[] args) {
        SeqStackDao seqStackDao = new SeqStackDao();
        //初始化栈
        SeqStack stack = seqStackDao.initSeqStack();

        //入栈
        seqStackDao.pushSeqStack(stack, "A");
        seqStackDao.pushSeqStack(stack, "B");
        seqStackDao.pushSeqStack(stack, "C");
        seqStackDao.pushSeqStack(stack, "D");
        seqStackDao.pushSeqStack(stack, "E");

        //输出栈元素
        while (stack.size > 0) {
            //查找栈顶元素
            Object o = seqStackDao.topSeqStack(stack);
            System.out.println(o);
            //出栈
            seqStackDao.popSeqStack(stack);
        }
    }
}
