package example.data.structure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description : LinkNode是结点，包括结点的数据域和指针域；
 *
 * @author : xiaokui
 * @date : 2021-07-08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinkNode {

    /**
     * 链表结点的数据域
     */
    public Object data;

    /**
     * 链表结点的指针域
     */
    public LinkNode next;

}

