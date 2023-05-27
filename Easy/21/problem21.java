import java.util.ArrayList;
import java.util.Collections;

public class problem21 {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ArrayList<Integer> array = new ArrayList<>();

        while (list1 != null) {
            array.add(list1.val);
            list1 = list1.next;

        }

        while (list2 != null) {
            array.add(list2.val);
            list2 = list2.next;

        }

        Collections.sort(array);

        ListNode results = new ListNode();
        ListNode curr = results;
        for (Integer v : array) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        results = results.next;

        return results;

    }

    public static void main(String[] args) {

        // Test your solution here

        // Create sample ListNode objects for testing
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // ListNode list1 = new ListNode(0);
        // ListNode list2 = new ListNode();

        // Call the mergeTwoLists method
        ListNode mergedList = mergeTwoLists(list1, list2);
        ListNode curr = mergedList;

        System.out.println();

    }

}
