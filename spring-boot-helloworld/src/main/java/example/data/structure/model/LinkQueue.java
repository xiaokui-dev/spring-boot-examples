package example.data.structure.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description :
 * 队列是一种受限的线性表；
 * 队列只允许在一端进行插入操作，另一端进行删除操作；
 * 允许插入的一端叫队尾，允许删除的的一端叫队头；
 * 即先进先出，后进后出；
 *
 * @author : xiaokui
 * @date : 2021-07-08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinkQueue {
    /**
     * 队列头结点
     */
    public LinkQueueNode head;

    /**
     * 队列容量
     */
    public int size;
}
