package example.data.structure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description :
 * 包括链栈的栈顶指针和链表元素个数；
 * 栈顶指针是LinkStackNode类型的，链栈元素个数是int型的
 *
 * @author : xiaokui
 * @date : 2021-07-11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinkStack {

    /**
     * 栈顶指针，也就是所谓的头结点
     */
    public LinkStackNode head;

    /**
     * 栈的容量
     */
    public int size;

}