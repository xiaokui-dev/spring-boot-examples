package example.data.structure.main;

import example.data.structure.dao.BTNotRecursionDao;
import example.data.structure.model.BinaryTreeNode;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2021-07-11
 */
public class BTRecursionMain {

    public static void main(String[] args) {
        BTNotRecursionDao.BTRecursionDao btRecursionDao = new BTNotRecursionDao.BTRecursionDao();
        //创建树结点
        BinaryTreeNode node1 = new BinaryTreeNode('A', null, null);
        BinaryTreeNode node2 = new BinaryTreeNode('B', null, null);
        BinaryTreeNode node3 = new BinaryTreeNode('C', null, null);
        BinaryTreeNode node4 = new BinaryTreeNode('D', null, null);
        BinaryTreeNode node5 = new BinaryTreeNode('E', null, null);
        BinaryTreeNode node6 = new BinaryTreeNode('F', null, null);
        BinaryTreeNode node7 = new BinaryTreeNode('G', null, null);
        BinaryTreeNode node8 = new BinaryTreeNode('H', null, null);

        //建立结点间的关系
        /* node1就是A，结点A的左孩子是B(node2)，右孩子是F(node6) */
        node1.lchild = node2;
        node1.rchild = node6;
        /* node2就是B，结点B的左孩子为null(初始化就是null，所以不用管)，右孩子是C(node3) */
        node2.rchild = node3;
        node3.lchild = node4;
        node3.rchild = node5;
        node6.rchild = node7;
        node7.lchild = node8;

        //递归遍历
        System.out.println("先序遍历结果:");
        /* 根结点为A */
        btRecursionDao.RecursionBiTree(node1);



//        //创建树结点
//        BinaryTreeNode node1 = new BinaryTreeNode('A', null, null);
//        BinaryTreeNode node2 = new BinaryTreeNode('B', null, null);
//        BinaryTreeNode node3 = new BinaryTreeNode('C', null, null);
//        BinaryTreeNode node4 = new BinaryTreeNode('D', null, null);
//        BinaryTreeNode node5 = new BinaryTreeNode('E', null, null);
//        BinaryTreeNode node6 = new BinaryTreeNode('F', null, null);
//        BinaryTreeNode node7 = new BinaryTreeNode('G', null, null);
//        BinaryTreeNode node8 = new BinaryTreeNode('H', null, null);
//
//        //建立结点间的关系
//        node1.lchild = node2;  /* node1就是A，结点A的左孩子是B(node2)，右孩子是F(node6) */
//        node1.rchild = node6;
//        node2.rchild = node3;  /* node2就是B，结点B的左孩子为null(初始化就是null，所以不用管)，右孩子是C(node3) */
//        node3.lchild = node4;
//        node3.rchild = node5;
//        node6.rchild = node7;
//        node7.lchild = node8;
//
//        BTNotRecursionDao btNotRecursionDao = new BTNotRecursionDao();
//        //非递归遍历
//        System.out.println("先序遍历结果:");
//        btNotRecursionDao.XBTNotRecursion(node1);  /* 根结点为A */
//        System.out.println();
//        System.out.println("中序遍历结果:");
//        btNotRecursionDao.ZBTNotRecursion(node1);
//        System.out.println();
//        System.out.println("后序遍历结果:");
//        btNotRecursionDao.HBTNotRecursion(node1);
    }


}
