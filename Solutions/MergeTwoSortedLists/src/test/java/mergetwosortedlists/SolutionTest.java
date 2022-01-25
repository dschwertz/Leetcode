package mergetwosortedlists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SolutionTest {
    Solution solution = new Solution();
    ListNode list1Head;
    ListNode list2Head;
    ListNode expectedHead;
    ListNode resultHead;

    ListNode setList(int[] nums) {
        if (nums.length == 0) return null;

        ListNode headNode = new ListNode();
        ListNode current = new ListNode();
        headNode.val = nums[0];
        headNode.next = current;

        for (int i = 1; i < nums.length; ++i) {
            current.val = nums[i];
            current.next = new ListNode();
            current = current.next;
        }

        return headNode;
    }

    @Test
    void example1() {
        list1Head = setList(new int[]{1,2,4});
        list2Head = setList(new int[]{1,3,4});
        expectedHead = setList(new int[]{1,1,2,3,4,4});

        resultHead = solution.mergeTwoLists(list1Head, list2Head);
        while (expectedHead != null) {
            System.out.println("expected: " + expectedHead.val + " actual: " + resultHead.val);
            assertEquals(expectedHead.val, resultHead.val);
            resultHead = resultHead.next;
            expectedHead = expectedHead.next;
        }
    }

    @Test
    void example2() {
        list1Head = setList(new int[]{});
        list2Head = setList(new int[]{});

        resultHead = solution.mergeTwoLists(list1Head, list2Head);
        assertNull(resultHead);
    }

    @Test
    void example3() {
        list1Head = setList(new int[]{});
        list2Head = setList(new int[]{0});
        expectedHead = setList(new int[]{0});

        resultHead = solution.mergeTwoLists(list1Head, list2Head);
        while (resultHead != null) {
            assertEquals(expectedHead.val, resultHead.val);
            resultHead = resultHead.next;
            expectedHead = expectedHead.next;
        }
    }

    @Test
    void example4() {
        list1Head = setList(new int[]{-2,-2,-1});
        list2Head = setList(new int[]{1,3,4});
        expectedHead = setList(new int[]{-2,-2,-1,1,3,4});

        resultHead = solution.mergeTwoLists(list1Head, list2Head);
        while (resultHead != null) {
            assertEquals(expectedHead.val, resultHead.val);
            resultHead = resultHead.next;
            expectedHead = expectedHead.next;
        }
    }

    @Test
    void example5() {
        list1Head = setList(new int[]{-2,-2,-1,6,6,6,6});
        list2Head = setList(new int[]{1,3,4});
        expectedHead = setList(new int[]{-2,-2,-1,1,3,4,6,6,6,6});

        resultHead = solution.mergeTwoLists(list1Head, list2Head);
        while (resultHead != null) {
            assertEquals(expectedHead.val, resultHead.val);
            resultHead = resultHead.next;
            expectedHead = expectedHead.next;
        }
    }

    @Test
    void example6() {
        list1Head = setList(new int[]{1});
        list2Head = setList(new int[]{1});
        expectedHead = setList(new int[]{1,1});

        resultHead = solution.mergeTwoLists(list1Head, list2Head);
        while (expectedHead.next != null) {
            assertEquals(expectedHead.val, resultHead.val);
            resultHead = resultHead.next;
            expectedHead = expectedHead.next;
        }
    }
}
