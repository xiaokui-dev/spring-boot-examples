package example.data.structure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2021-07-08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinkQueueNode {

    /**
     * 队列结点的数据域
     */
    public Object data;

    /**
     * 队列结点的指针
     */
    public LinkQueueNode next;
}
