package com.java.main;

import com.java.dao.LinkStackDao;
import com.java.model.LinkStack;

public class LinkStackMain {
    public static void main(String[] args) {
        LinkStackDao linkStackDao=new LinkStackDao();
        //初始化栈
        LinkStack stack=linkStackDao.Init_LinkStack();

        //入栈
        linkStackDao.Push_LinkStack(stack,"A");
        linkStackDao.Push_LinkStack(stack,"B");
        linkStackDao.Push_LinkStack(stack,"C");
        linkStackDao.Push_LinkStack(stack,"D");
        linkStackDao.Push_LinkStack(stack,"E");

        //输出栈元素
        while(stack.size>0){
            //查找栈顶元素
            Object o=linkStackDao.Top_LinkStack(stack);
            System.out.println(o);
            //出栈
            linkStackDao.Pop_LinkStack(stack);
        }
    }
}
