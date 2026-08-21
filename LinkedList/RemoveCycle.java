public class RemoveCycle {
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


            //Detect Cycle 


 public static void isCycle(){
    Node slow = head;
    Node fast = head;

    boolean cycle = false;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast){
            cycle = true;
            break;
        }
    }

    if(cycle == false){
        return;
    }

    // Remove the cycle 

    slow = head;
    Node prev = null;

    while(slow != fast){
        prev = fast;
        slow = slow.next;
        fast = fast.next;
        
    }

    prev.next = null;

}


    
}
