package example.data.structure;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2021-07-11
 */
public class BinaryTreeNode {

    /**
     * 树的根结点
     */
    public char ch;

    /**
     * 左结点
     */
    public BinaryTreeNode lchild;

    /**
     * 右结点
     */
    public BinaryTreeNode rchild;

    public BinaryTreeNode(char ch, BinaryTreeNode lchild, BinaryTreeNode rchild) {
        this.ch = ch;
        this.lchild = lchild;
        this.rchild = rchild;
    }


}
