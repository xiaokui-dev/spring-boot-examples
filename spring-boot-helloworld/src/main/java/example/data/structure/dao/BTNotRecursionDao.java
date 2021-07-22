package example.data.structure;

import java.util.Stack;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2021-07-11
 */
public class BTNotRecursionDao {

    /**
     * 二叉树先序遍历（非递归）
     */
    public void XBTNotRecursion(BinaryTreeNode root){
        BinaryTreeNode temp = root;
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        while (temp != null || !stack.isEmpty()) {
            //遇到一个结点，就把它入栈并访问它，然后去遍历它的左子树；
            while (temp != null) {
                stack.push(temp);
                //输出当前结点
                System.out.print(temp.ch + " ");
                temp = temp.lchild;
            }
            if(!stack.isEmpty()) {
                //当左子树遍历结束后，从栈顶弹出这个结点；
                temp = stack.pop();
                //然后按其右指针再去先序遍历该结点的右子树
                temp = temp.rchild;
            }
        }
    }

    //二叉树中序遍历（非递归）
    public void ZBTNotRecursion(BinaryTreeNode root){
        BinaryTreeNode temp = root;
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        while (temp != null || !stack.isEmpty()) {
            //遇到一个结点，就把它入栈并访问它，然后去遍历它的左子树；
            while (temp != null) {
                stack.push(temp);
                temp = temp.lchild;
            }
            if(!stack.isEmpty()) {
                //当左子树遍历结束后，从栈顶弹出这个结点；
                temp = stack.pop();
                //输出当前结点
                System.out.print(temp.ch + " ");
                //然后按其右指针再去中序遍历该结点的右子树
                temp = temp.rchild;
            }
        }
    }
    //二叉树后序遍历（非递归）
    public void HBTNotRecursion(BinaryTreeNode root){
        BinaryTreeNode temp = root;
        //标记访问序列中前一个二叉树节点（当前节点的之前访问的节点）
        BinaryTreeNode pre = null;
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        while (temp != null || !stack.isEmpty()) {
            //遇到一个结点，就把它入栈并访问它，然后去遍历它的左子树；
            while (temp != null) {
                stack.push(temp);
                temp = temp.lchild;
            }
            if(!stack.isEmpty()) {
                //先查看栈顶结点
                temp = stack.peek();
                //如果一个结点右孩子是空，或者右孩子刚被访问过，那么就访问该节点。否则就往右孩子走。
                if(temp.rchild == null || temp.rchild == pre) {
                    //输出当前结点
                    System.out.print(temp.ch + " ");
                    //出栈
                    stack.pop();
                    pre = temp;
                    temp = null;
                }else {
                    temp = temp.rchild;
                }
            }
        }
    }
}
