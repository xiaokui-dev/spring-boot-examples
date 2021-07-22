package example.data.structure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description :
 * @author : xiaokui
 * @date : 2021-07-11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeqQueue {
    /**
     * 动态数组的最大容量
     */
    public final static int MAX_SIZE =1024;

    /**
     * 队列的结点数据
     */
    public Object[] data;

    /**
     * 队列的长度，用来标识数组中的元素个数
     */
    public int size;
}
