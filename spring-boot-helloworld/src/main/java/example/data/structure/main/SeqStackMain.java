package com.java.main;

import com.java.dao.SeqStackDao;
import com.java.model.SeqStack;

public class SeqStackMain {
    public static void main(String[] args) {
        SeqStackDao seqStackDao=new SeqStackDao();
        //初始化栈
        SeqStack stack=seqStackDao.Init_SeqStack();

        //入栈
        seqStackDao.Push_SeqStack(stack,"A");
        seqStackDao.Push_SeqStack(stack,"B");
        seqStackDao.Push_SeqStack(stack,"C");
        seqStackDao.Push_SeqStack(stack,"D");
        seqStackDao.Push_SeqStack(stack,"E");

        //输出栈元素
        while(stack.size>0) {
            //查找栈顶元素
            Object o = seqStackDao.Top_SeqStack(stack);
            System.out.println(o);
            //出栈
            seqStackDao.Pop_SeqStack(stack);
        }
    }
}
