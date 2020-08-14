package example.geek.array;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Description : 数组
 * 1) 数组的插入、删除、按照下标随机访问操作；
 * 2）数组中的数据是int类型的；
 *
 * @author : xiaokui
 * @date : 2020-08-14
 */
@Slf4j
@Data
public class ArrayTest {

    /**
     * 定义整形数组
     */
    private int[] data;

    /**
     * 数组长度
     */
    private int length;

    /**
     * 构造方法,定义数组大熊啊
     * @param size 数组大小
     */
    public ArrayTest(int size) {
        this.data = new int[size];
        this.length = size;
    }

    /**
     * 根据索引查找数组元素并返回
     * @param index index
     * @return int
     */
    public int findByIndex(int index){
        if(index < 0 || index >= length){
            return -1;
        }
        return data[index];
    }

    /**
     * 尾部插入元素, index 相同则覆盖
     * @param index 数组索引
     * @param value 值
     * @return true/false
     */
    public boolean insert(int index,int value){
        // 位置不合法
        if(index < 0 || index > length){
            log.info("ArrayTest.insert [位置不合法]");
            return false;
        }
        for (int i = length; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        return true;
    }

    public void printAll(){
        for (int i = 0; i < length; i++) {
            log.info("ArrayTest.printAll i = {},value = {}",i,data[i]);
        }
    }

}
