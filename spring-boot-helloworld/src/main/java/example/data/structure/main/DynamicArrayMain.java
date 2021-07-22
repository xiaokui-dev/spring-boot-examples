package example.data.structure.main;

import example.data.structure.dao.DynamicArrayDao;
import example.data.structure.model.DynamicArray;

/**
 * Description : 数组方法测试
 *
 * @author : xiaokui
 * @date : 2021-07-08
 */
public class DynamicArrayMain {

    public static void main(String[] args) {
        DynamicArrayDao dynamicArrayDao = new DynamicArrayDao();
        // 初始化动态数组
        DynamicArray myArray = dynamicArrayDao.initArray();
        System.out.println("初始化动态数组:");
        // 获取容量
        System.out.println("数组容量:" + DynamicArray.CAPACITY);
        System.out.println("数组实际大小:" + dynamicArrayDao.sizeArray(myArray));
        // 插入元素
        for (int i = 0; i < 10; i++) {
            dynamicArrayDao.pushBackArray(myArray, i);
        }
        System.out.println();

        System.out.println("插入元素之后:");
        //获取容量
        System.out.println("数组容量:" + DynamicArray.CAPACITY);
        System.out.println("数组实际大小:" + dynamicArrayDao.sizeArray(myArray));
        System.out.println();

        //打印插入元素
        System.out.println("打印插入的元素:");
        dynamicArrayDao.printArray(myArray);
        System.out.println();

        //根据元素位置删除元素
        dynamicArrayDao.removeByPosArray(myArray, 2);
        //根据元素值删除元素
        dynamicArrayDao.removeByValueArray(myArray, 7);
        System.out.println();

        //打印删除后的数组
        System.out.println("打印删除后的元素:");
        dynamicArrayDao.printArray(myArray);
        System.out.println();

        //查找元素为5的位置
        System.out.println();
        System.out.print("元素5的位置为: ");
        int pos = dynamicArrayDao.findArray(myArray, 5);
        System.out.println(pos);

        //查找位置为7的元素值
        System.out.println();
        System.out.print("位置为7的元素为: ");
        int value = dynamicArrayDao.atArray(myArray, 7);
        System.out.println(value);

        //获取容量
        System.out.println();
        System.out.println("此时的数组容量:" + DynamicArray.CAPACITY);
        System.out.println("此时的数组实际大小:" + dynamicArrayDao.sizeArray(myArray));
        System.out.println();
    }
}
