public class zigzagLinkedList {
    

 public static class Node{
        int data;
         Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

      public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

 
    }

     public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
 public void zigzag(){
    Node slow = head;
    Node fast = head.next;
    
    while(fast != null && fast.next != null){
         slow = slow.next;
         fast = fast.next.next;
    }

         Node mid = slow;

         Node curr = mid.next;
         mid.next = null;
         Node prev = null;
         Node next;

         while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
         }

         Node left = head;
         Node right = prev;
         Node nextL, nextR; 

         while(left!= null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            right = nextR;
            left = nextL;
         }

         
        }

        public static void main(String args[]){
           zigzagLinkedList ll = new zigzagLinkedList();
            ll.addLast(1);
            ll.addLast(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
           
            ll.print();
            ll.zigzag();
            ll.print();
        }


}