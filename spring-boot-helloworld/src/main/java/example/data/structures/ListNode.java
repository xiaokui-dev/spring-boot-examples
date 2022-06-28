package example.data.structures;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2022-06-27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListNode {

    private int val;

    private ListNode next;

    public static ListNode reverseForCycle(ListNode head){
        ListNode preNode = null;
        ListNode currentNode = head;
        while (currentNode != null){
            ListNode nextNode = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = nextNode;
        }
        return preNode;
    }

    public static ListNode reverseForRecursion(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode last = reverseForRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1,null);
        ListNode listNode2 = new ListNode(2,null);
        ListNode listNode3 = new ListNode(3,null);
        ListNode listNode4 = new ListNode(4,null);
        ListNode listNode5 = new ListNode(5,null);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        System.out.println(listNode1);
        System.out.println(reverseForCycle(listNode1));
//        System.out.println(reverseForRecursion(listNode1));

        // 单向链表。奇数位升序，偶数位降序。要求重新排序后输出一个升序链表

    }
}
