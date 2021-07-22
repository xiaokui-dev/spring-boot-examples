package example.data.structure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description :
 * 树是一种非线性结构，有一个直接前驱，但可能有多个直接后继（1：n）；
 * 树的定义具有递归性，树中还有树；
 * 树可以为空，即结节点个数为0；
 *
 * 根：根节点，没有前驱；
 * 叶子：终端结点，没有后继；
 * 双亲：上层的那个结点，就是直接前驱；
 * 孩子：下层结点的子树，就是直接后继；
 * 结点：树的数据元素；（上图的结点数为11）
 * 结点的度：结点挂接的子树数，有几个直接后继就是几度；
 * 树的度：所有结点度中的最大值，Max{各结点的度}，（上图树的度为2）；
 * 树的深度（或高度）：所有结点中最大的层数，（上图数的深度为3层）；
 *
 * 二叉树: 每个结点最多只有两个子结点（不存在度大于2的结点）；
 * 满二叉树：
 * 叶子结点全部都在最底层；
 * 除叶子结点外，每个结点都有左右两个子节点；
 *
 * 完全二叉树：
 * 叶子结点全都都在最底的两层；
 * 最后一层只缺少右边的叶子结点，左边一定有叶子结点；
 * 除了最后一层，其它层的结点个数均达到最大值；
 *
 * 先序遍历:也就是先访问根结点，再左边子结点，最后右边子结点；俗称DLR；
 * 中序遍历: 也就是先访问左结点，再根结点，最后右结点；俗称LDR；
 * 后序遍历: 先访问左结点，再右结点，最后根结点；俗称LRD；
 * @author : xiaokui
 * @date : 2021-07-11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
