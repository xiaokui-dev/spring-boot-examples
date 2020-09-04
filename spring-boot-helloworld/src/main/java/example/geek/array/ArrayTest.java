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
     * 数组能放下的最大数
     */
    private int size;

    /**
     * 数组中真实元素
     */
    private int count;

    /**
     * 构造方法,定义数组大小
     * @param size 数组大小
     */
    public ArrayTest(int size) {
        this.data = new int[size];
        this.size = size;
        // 一个元素都没有
        this.count = 0;
    }

    /**
     * 根据索引查找数组元素并返回
     * @param index index
     * @return int
     */
    public int findByIndex(int index){
        // 索引小于 0 或者 >= 数组大小，返回 -1
        if(index < 0 || index >= size){
            return -1;
        }
        return data[index];
    }

    /**
     * 插入元素, index 相同则覆盖
     * @param index 数组索引
     * @param value 值
     * @return true/false
     */
    public boolean insert(int index,int value){
        // 位置不合法
        if(index < 0 || index >= size){
            log.info("ArrayTest.insert [位置不合法]");
            return false;
        }
//        for (int i = count; i > index; i--) {
//            data[i] = data[i - 1];
//        }
        data[index] = value;
        return true;
    }

    /**
     * 根据下标删除数组中元素
     * @param index 下标
     * @return true/false
     */
    public boolean delete(int index){
        // 位置不合法
        if(index < 0 || index >= size){
            return false;
        }
//        // 从删除位置开始,将后面的元素向前移动一位
//        for (int i = index + 1; i < length; i++) {
//            data[i - 1] = data[i];
//        }
        return true;
    }


    public void printAll(){
        for (int i = 0; i < size; i++) {
            log.info("ArrayTest.printAll i = {},value = {}",i,data[i]);
        }
    }

}
