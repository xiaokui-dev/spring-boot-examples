package example.geek;

import example.ApplicationTests;
import example.geek.array.ArrayTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * Description : 数据单元测试
 *
 * @author : xiaokui
 * @date : 2020-08-24
 */
class ArrayTests extends ApplicationTests {

    @Test
    void printAll(){
        ArrayTest arrayTest = new ArrayTest(5);
        arrayTest.printAll();
        arrayTest.insert(1,1);
        arrayTest.insert(1,2);
        arrayTest.insert(2,2);
        arrayTest.insert(3,3);
        arrayTest.insert(4,4);
        arrayTest.insert(5,5);
        arrayTest.printAll();
    }
}
