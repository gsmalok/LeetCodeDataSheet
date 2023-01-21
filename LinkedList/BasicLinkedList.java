package LinkedList;

public class BasicLinkedList {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    public void PrintList() {
        Node n = head;

        while(n != null){
            System.out.print(n.data+"->");
            n = n.next;
        }
    }

        public static void main(String[] args) {
            
            
    BasicLinkedList llist = new BasicLinkedList();

    llist.head = llist.new Node(1);
    Node second = llist.new Node(2);
    Node third  = llist.new Node(3);
    Node fourth = llist.new Node(4);
     
    llist.head.next = second;
    second.next = third;
    third.next = fourth;


    llist.PrintList();
        }

}
