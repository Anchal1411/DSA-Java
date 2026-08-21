public class LinkedListBasics {
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

        // Add node at begining 

        public void addFirst(int data){
            Node newNode = new Node(data);
            size ++;
            if(head == null){
                head = tail = newNode;
                
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // Add node at last

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

        // Print the LL

        public void print(){
            if(head == null){
                System.out.println("LL is empty");
                return;
            }
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        
        // Add node in middle 
        public void add(int idx, int data){
            if(idx == 0){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size ++;
            Node temp = head;
            int i = 0;

            while(i < idx-1){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;


        }

        // Remove first node

        public int removeFirst(int data){
            if(size == 0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            } else if(size == 1){
                int val = head.data;
            head = tail = null;
            
            
            }

            Node newNode = new Node(data);
            int val = head.data;
            head = head.next;
            size --;
            return val;

        }

        // Remove last node

        public int removeLast(int data){
            if(size == 0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            Node prev = head;
            for(int i = 0; i < size -2; i++){
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size --;
            return val;
        }

        // Find middle node

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
