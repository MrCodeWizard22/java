// implementing queue in this program 
import java.util.*;
public class QueueB {
    public static int n = 7;
    public static int arr [] = new int [n];
    public static int f = -1 ;
    public static int r = -1;
    

    // this is cicular queue implementation and now commenting this for linked list implementation

    // public static class Queue{
    //     public static void enque(int data ){
    //         if(isFull()){
    //             System.out.println("queue is full ");
    //             return;
    //         }
    //         if(f == -1){
    //             f++;
    //             r++;
    //         }
    //         else{
    //             r = (r + 1)% n;
    //         }

    //         arr[r] = data ;

    //     }
    //     public static void deque(){
    //         if(isEmpty()){
    //             System.out.println("queue is empty nothing to show ");
    //             return ;
    //         }
    //         if(f == r){
    //             f = r = -1;
    //         }
    //         else{
    //             f = (f + 1) % n;
    //         }
    //     }
    //     public static boolean isEmpty(){

    //         return f == -1;
    //     }
    //     public static boolean isFull(){

    //         return (r + 1)%n == f ;
    //     }

    //     public static void display (){
    //         int i = f;
    //         if (f != -1){
    //             while((i + 1)%n != f){
    //                 System.out.print(arr[i] + "--");
    //                 i = (i + 1) % n;
    //             }
    //         }
    //     }
    // }

    // the linked list implementation of queue

    // static class Node {
    //     int data ;
    //     Node next ;
    //     Node (int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }
    // static class Queue{
    //     public static Node front = null;
    //     public static Node rear = null;

    //     public static void enque(int data){
    //         Node newnode = new Node(data);
    //         if (front == null){
    //             front = rear = newnode ;
    //         }
    //         else{
    //             rear.next = newnode ;
    //             rear = newnode;
    //         }

    //     }
    //     public static void deque(){
    //         if(front == null ){
    //             System.out.println("queue is empty nothing to delete");
    //             return;
    //         }
    //         Node temp = front ;
    //         front = front.next ;
    //         temp.next = null ;


    //     }
    //     public boolean isEmpty(){
    //         return front == null;
    //     }

    //     public static void display (){
    //         Node temp = front ;
    //         if (front == null ){
    //             System.out.println("queue is empty nothing to show ");
    //             return ;
    //         }
    //         while(temp.next != null){
    //             System.out.print(temp.data + "--");
    //             temp = temp.next;
    //         }
    //         System.out.print(temp.data);
    //     }
    // }
    public static void main(String []args){

        Queue <Integer> q = new LinkedList<>();
        q.add(7);
        q.add(49);
        q.add(33);
        q.add(45);
        q.add(18);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());

        // Queue q = new Queue();
        // q.enque(7);
        // q.enque(49);
        // q.enque(33);
        // q.display();
        // System.out.println();
        // q.deque();
        // q.display();

    }
}
