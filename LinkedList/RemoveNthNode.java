public class RemoveNthNode {

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

        
    public void deleteNthNodeFromEnd(int n ){
            Node temp = head;
            int size = 0;
            while(temp != null){
                temp = temp.next;
                size ++;
            }

            if(size == n){
                head = head.next;
            }

            int i = 0;
            Node prev = head;
            while( i < size - n){
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
        }

        private Node midNode(Node head){
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    
}
