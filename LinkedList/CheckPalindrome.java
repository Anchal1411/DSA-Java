
public class CheckPalindrome {

     static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

        public static Node head;
        public static Node tail;
        public static int size;

        
    public static boolean isPalindrome(Node head) {

    //  Find middle
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    //  Reverse second half
    Node prev = null;
    Node curr = slow;

    while (curr != null) {
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    // Compare both halves
    Node left = head;
    Node right = prev;

    while (right != null) {
        if (left.data != right.data) {
            return false;
        }

        left = left.next;
        right = right.next;
    }

    return true;
}
    
}
