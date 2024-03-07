// merge sort on linked list 
// first we find middle using slow fast but difference is that we initialize the fast with head.next
// then we will apply the mergesort to head to middle and middle next to null

public class Mergesort3 {

    // declaration of node of linkedlist 
    public static class Node {
        int data;
        Node next;
        public Node (int data){
            this.data = data;
            this.next = null;

        }

    }

    // head
    public static Node head;

    // function to add data to linkedlist 
    public void addFirst(int data ){

        Node newnode = new Node(data);
        newnode.next = null;

        if (head == null ){
            head = newnode ;
        }
        else{
            newnode.next = head;
            head = newnode;
        }

    }
    
    // function to print the linked list 
    public void show(){
        Node temp = head ;
        while(temp.next != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }


    // mergefunction

    public static Node merge (Node left , Node right ){
        Node dummy = new Node (-1);
        Node temp = dummy;
        while(left != null && right != null){
            if (left.data < right.data){
                temp.next = left ;
                left = left.next;
                temp = temp.next;
            }
            else {
                temp.next = right ;
                temp = temp.next;
                right = right .next;
            }
        }
        if (left != null){
            temp.next = left ;
        }
        if (right != null){
            temp.next = right;
        }
        return dummy.next;
    }

    // function to find the mid of the linkedlist 
    public static Node findmid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast .next.next;
        }
        return slow ;
    }

    // mergesort function 
    public static Node mergesort(Node head){
        if (head == null || head.next == null ){
            return head;
        }

        Node mid = findmid (head );
        Node righthead = mid.next; 
        mid.next = null;

        Node left = mergesort(head);
        Node right = mergesort(righthead);

        Node ans = merge (left, right );

        return ans;
    }

    public static void main(String []args){
        Mergesort3 ll = new Mergesort3();
        ll.addFirst(6);
        ll.addFirst(7);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(10);
        ll.addFirst(8);

        ll.show();

        head = mergesort(head);
        ll.show(); 
    }
    
}
