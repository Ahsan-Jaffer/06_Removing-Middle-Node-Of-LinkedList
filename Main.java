public class Main{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void print(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void findMiddleNode(Node head){
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        if (head.next == null) {
            return;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                prev = slow;   
                slow = slow.next;
            }
        }
        System.out.println("\nMiddle Node : "+slow.data);
        prev.next = slow.next;
        slow.next = null;

    } 
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        
        Node head = first;
        
        print(head);
        findMiddleNode(head);
        print(head);

        
    }
}