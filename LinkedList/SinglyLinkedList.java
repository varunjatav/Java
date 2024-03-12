package LinkedList;

public class SinglyLinkedList {
    
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;


        private ListNode(int value){
            this.data = value;
        }
    }


    public void SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty(){
        return this.head == null;
    }
    public int length(){
        return length;
    }

    public void insertTail(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
            tail = head;
        }else{
           tail.next = newNode;
           tail = tail.next;
        }
    }
    public void insertHead(int value){
        ListNode newNode = new ListNode(value);
        ListNode temp = null;
        if(isEmpty()){
            head = newNode;
        }else{
            temp = newNode;
            temp.next = head;
            head = temp;
        }
    }
    public void printForward(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void DeletFirst(){
       
        if(isEmpty()){
            System.out.println("null");
        }else{
            ListNode temp = head;
            head = head.next;
            temp.next = null;
        }
    }
    public ListNode DeleteLast(){
       if(isEmpty() || head.next == null){
        return head;
       }
       ListNode previous = null;
       ListNode current = head;
       while(current.next != null){
        previous = current;
        current = current.next;
       }
       previous.next = null;
       return current;
    }
 public static void main(String[] args){
    SinglyLinkedList sll = new SinglyLinkedList();
   
    sll.insertHead(1);
    sll.insertHead(2);
    sll.insertHead(3);
    sll.insertHead(4);
    sll.insertHead(5);
    sll.printForward();
    // sll.DeletFirst();
    // sll.DeletFirst();
    // sll.DeletFirst();
    // sll.DeletFirst();
    // sll.DeletFirst();
    // sll.DeletFirst();
    sll.DeleteLast();
    sll.DeleteLast();
    sll.DeleteLast();
    sll.DeleteLast();
    sll.DeleteLast();
    sll.printForward();
   
 }
}
