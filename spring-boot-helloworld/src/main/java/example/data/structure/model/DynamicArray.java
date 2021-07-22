package example.data.structure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description :主要包括属性有数组容量，结点数据和数组长度；
 * 数组：在内存中，是一块连续的内存区域
 * 数组优点： 随机访问性强，查找速度快（连续内存空间导致的）
 * 数组缺点： 插入和删除效率低 可能浪费内存 内存空间要求高，必须有足够的连续内存空间。数组大小固定，不能动态拓展
 *
 * @author : xiaokui
 * @date : 2021-07-08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DynamicArray {

    /**
     * 动态数组最大容量
     */
    public final static int CAPACITY = 15;

    /**
     * 顺序表的结点数据
     */
    public int[] data;

    /**
     * 顺序表的长度，用来标识数组中的元素个数
     */
    public int size;
}