package com.java.dao;

import com.java.model.SeqStack;
import static com.java.model.SeqStack.Max_Size;

public class SeqStackDao {
    //初始化栈
    public SeqStack Init_SeqStack(){
        //动态数组初始化，加数组容量
        Object[] data1=new Object[Max_Size];

        //栈初始化，元素个数size为0
        SeqStack stack=new SeqStack(data1,0);

        //数组赋值
        for(int i=0;i<Max_Size;i++){
            stack.data[i]=0;
        }
        return stack;
    }
    //入栈
    public void Push_SeqStack(SeqStack stack,Object data){
        if(stack==null){
            return;
        }
        if(data==null){
            return;
        }
        //如果栈容量小于或等于数组容量
        if(stack.size==Max_Size){
            return;
        }
        //元素入栈
        stack.data[stack.size]=data;
        stack.size++;
    }
    //查找栈顶元素
    public Object Top_SeqStack(SeqStack stack){
        if(stack==null){
            return null;
        }
        //若栈元素为0，则返回null
        if(stack.size==0){
            return null;
        }
        //栈顶元素，注意数组下标从0开始，所以要减1
        return stack.data[stack.size-1];
    }
    //出栈操作
    public void Pop_SeqStack(SeqStack stack){
        if(stack==null){
            return;
        }
        if(stack.size==0){
            return;
        }
        //出栈
        stack.size--;
    }
    //判断是否为空
    public boolean IsEmpty(SeqStack stack){
        if(stack==null){
            return false;
        }
        if(stack.size==0){
            return true;
        }
        return false;
    }
    //返回栈中元素的个数
    public int Size_SeqStack(SeqStack stack){
        return stack.size;
    }
    //清空栈
    public void Clear_SeqStack(SeqStack stack){
        if(stack==null){
            return;
        }
        for(int i=0;i<stack.size;i++){
            stack.data[i]=null;
        }
        stack.size=0;
    }
}
