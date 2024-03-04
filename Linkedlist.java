// the basics of llinkedlist 
import java.util.*;
public class Linkedlist {

    // node class
    public static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    // declaration of head and tail ptrs
    public static Node head;
    public static Node tail;

    // function for addition of node at begining of ll 

    public void addbeg(int data){
        Node newnode = new Node (data);
        newnode .next = null;
        if(head == null){
            head = tail = newnode;

            return ;
        }
        newnode .next = head;
        head = newnode ;
    }

    // function for addition of node at ending of ll 
    public void addtail(int data){
        
        
        Node newnode = new Node (data);
        newnode.next = null;
        if (tail == null){
            head = tail = newnode;
            return ;
        }
        tail.next = newnode;
        tail = newnode ;


       // if we don't manage a tail pointer
        // Node temp = head;
        // while(temp.next != null){
        //     temp = temp.next;
        // }
        // temp.next = newnode ;


    }

    // function for addition of node at any pos in ll

    public void addind(int data , int pos){
        if (pos == 0){
            addbeg(data);
            return ;
        }
        Node temp = head;
        int count = 1;
        Node newnode = new Node (data);
        newnode .next = null;

        while((temp!=null && count < pos) ){
            temp = temp.next;
            count ++;
            if (temp.next==null && count < pos-1){
                break;
            }
        }
        newnode .next = temp.next;
        temp.next = newnode ;
        
    
    }

    // function to print the ll 

    public void show(Node head){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }

    // function to find the length of the linkedlist 
    public int getlength(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count ++;
        }
        return count ;
    }

    // function to remove the head of the linked list 
    public void delhead(){
        if (head == null ){
            return ;
        }
        else if (head.next == null){
            head = tail = null;
            return ;
        }
        Node temp = head;
        head = temp .next;
        temp.next = null;
        
    }

    // function to delete the tail node from linked list 
    public void deltail (){
        if (tail ==null){
            return ;

        }
        else if (tail == head){
            head = tail =null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp .next;
        }
        temp .next = null;
        tail = temp;
    }

    // linearsearch in linked list 
    // function will find the first occurance of the linkedlist 
    public int findval(int key){
        Node temp = head;
        int count = 0;
        while(temp != null){
            if (temp.data == key ){
                return count ;
            }
            count ++;
            temp= temp.next;
        }
        return -1;
    }

    // searching the node using recursion
    public boolean recurSearch(Node head, int key ){
        Node temp = head;
        if (temp == null){
            return false;
        }
        if (temp.data == key){
            return true;
        }
        return recurSearch(temp.next, key);

    }
    public static void main(String []args){

        Linkedlist ll = new Linkedlist();
        ll.addbeg(7);
        ll.addbeg(5);
        ll.addtail(6);
        ll.addtail(8);
        ll.addbeg(4);

        ll.addind(15,3);
        ll.addind(20, 6);


        ll.addind(50, 20);

        ll.delhead();
        ll.deltail();
        ll.show(head);

        System.out.println("the length of linked list is : "+ ll.getlength(head));

        System.out.println(ll.findval(8) == -1 ? "key not found" : "found at: " + ll.findval(8));
        System.out.println(ll.findval(4) == -1 ? "key not found" : "found at: " + ll.findval(4));
        System.out.println(ll.recurSearch(head, 4));



    }
    
}
