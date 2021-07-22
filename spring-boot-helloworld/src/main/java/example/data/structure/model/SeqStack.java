package example.data.structure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description :
 * 栈是一种受限线性表，也就是说，栈元素具有线性关系，即前驱后继关系；
 * 只不过它是 一种特殊的线性表而已
 * 线性表是在表尾进行插入和删除操作，而在栈中表尾是指栈顶，而不是栈底；
 * 栈是在栈顶进行数据操作，即先进后出，后进先出
 * 栈的顺序存储结构简称顺序栈；
 * 利用一组地址连续的存储单元依次存放自栈底到栈顶的数据元素；
 * 同时附设指针top指示栈顶元素在顺序表中的位置；
 * <p>
 * 属性有栈的容量，结点数据以及栈的实际大小（即长度）
 *
 * @author : xiaokui
 * @date : 2021-07-11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeqStack {

    /**
     * 动态数组的最大容量
     */
    public final static int MAX_SIZE = 1024;

    /**
     * 栈的结点数据
     */
    public Object[] data;

    /**
     * 栈的长度，用来标识数组中的元素个数
     */
    public int size;

}
