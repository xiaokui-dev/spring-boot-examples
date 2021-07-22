package example.data.structure.dao;

import example.data.structure.model.SeqStack;

/**
 * Description :包括入栈、出栈、查看栈顶元素等等；
 *
 * @author : xiaokui
 * @date : 2021-07-11
 */
public class SeqStackDao {

    public SeqStack initSeqStack() {
        //动态数组初始化，加数组容量
        Object[] data1 = new Object[SeqStack.MAX_SIZE];

        //栈初始化，元素个数size为0
        SeqStack stack = new SeqStack(data1, 0);

        //数组赋值
        for (int i = 0; i < SeqStack.MAX_SIZE; i++) {
            stack.data[i] = 0;
        }
        return stack;
    }


    public void pushSeqStack(SeqStack stack, Object data) {
        if (stack == null) {
            return;
        }
        if (data == null) {
            return;
        }
        //如果栈容量小于或等于数组容量
        if (stack.size == SeqStack.MAX_SIZE) {
            return;
        }
        //元素入栈
        stack.data[stack.size] = data;
        stack.size++;
    }


    public Object topSeqStack(SeqStack stack) {
        if (stack == null) {
            return null;
        }
        //若栈元素为0，则返回null
        if (stack.size == 0) {
            return null;
        }
        //栈顶元素，注意数组下标从0开始，所以要减1
        Object o = stack.data[stack.size - 1];
        return o;
    }

    public void popSeqStack(SeqStack stack) {
        if (stack == null) {
            return;
        }
        if (stack.size == 0) {
            return;
        }
        //出栈
        stack.size--;
    }

    public boolean isEmpty(SeqStack stack) {
        if (stack == null) {
            return false;
        }
        if (stack.size == 0) {
            return true;
        }
        return false;
    }

    public int sizeSeqStack(SeqStack stack) {
        return stack.size;
    }

    public void clearSeqStack(SeqStack stack) {
        if (stack == null) {
            return;
        }
        for (int i = 0; i < stack.size; i++) {
            stack.data[i] = null;
        }
        stack.size = 0;
    }

}
