package example.data.structure;

/**
 * Description :主要包括属性有数组容量，结点数据和数组长度；
 *
 * @author : xiaokui
 * @date : 2021-07-08
 */
public class DynamicArray {

    //动态数组最大容量
    public final static int capacity = 100;

    //顺序表的结点数据
    public int[] data;

    //顺序表的长度，用来标识数组中的元素个数
    public int size;

    //构造函数

    public DynamicArray(int[] data, int size) {
        this.data = data;
        this.size = size;

    }
}
