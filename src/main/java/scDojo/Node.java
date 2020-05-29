package scDojo;

public class Node {

    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
    }

    static int countNodes(Node head){
        int count = 1;
        while(head.next != null){
            System.out.println(head.next.data);
            head = head.next;
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {

        Node head = new Node(4);
        Node nodeB = new Node(2);
        Node nodeC = new Node(10);
        Node nodeD = new Node(3);
        Node nodeE = new Node(2);

        head.next = nodeB;
        head.next.next = nodeC;
        head.next.next.next = nodeD;
        head.next.next.next.next = nodeE;

        System.out.println(countNodes(head));
//        System.out.println(head);
//        System.out.println(head.next.data);
//        System.out.println(head.next.next.data);

    }
}
