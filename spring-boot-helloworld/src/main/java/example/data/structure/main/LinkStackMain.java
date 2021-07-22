package example.data.structure.main;


import example.data.structure.dao.LinkStackDao;
import example.data.structure.model.LinkStack;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2021-07-11
 */
public class LinkStackMain {

    public static void main(String[] args) {
        LinkStackDao linkStackDao = new LinkStackDao();
        //初始化栈
        LinkStack stack = linkStackDao.initLinkStack();

        //入栈
        linkStackDao.pushLinkStack(stack, "A");
        linkStackDao.pushLinkStack(stack, "B");
        linkStackDao.pushLinkStack(stack, "C");
        linkStackDao.pushLinkStack(stack, "D");
        linkStackDao.pushLinkStack(stack, "E");

        //输出栈元素
        while (stack.size > 0) {
            //查找栈顶元素
            Object o = linkStackDao.topLinkStack(stack);
            System.out.println(o);
            //出栈
            linkStackDao.popLinkStack(stack);
        }
    }


}
