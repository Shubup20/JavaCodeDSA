package LinkedList;

public class basicsll {

    public static void insertAtEnd(Node head, int val) {
        Node temp = new Node(val);
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = temp;
    }
    public static int length(Node a) {
        int count = 0;
        while (a != null) {
            count++;
            a = a.next;
        }
        return count;
    }

    public static void displayRecur2(Node head) {
        if (head == null) return;
        displayRecur2(head.next);
        System.out.println(head.data);

    }

    public static void displayRecur(Node head) {
        if (head == null) return;
        System.out.println(head.data);
        displayRecur(head.next);
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static class Node {
        int data;     //value
        Node next;    //address of next node

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] arg) {
        Node a = new Node(5);
//        System.out.println(a.next);//null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5->3->9->8->16
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        insertAtEnd(a, 87);
        display(a);


//        System.out.println("Length of linked list: " + length(a));
//
//        display(a);
//        displayRecur(a);
//        displayRecur2(a);

//        Node temp = a;

//        while (temp != null) { //printing the list
//            System.out.println(temp.data);
//            temp = temp.next;
//        }


//        for (int i = 1; i <= 5; i++) {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }


//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);


//        System.out.println(a);  //$Node@6acbcfc0
//        System.out.println(a.next);
//        System.out.println(b);  //$Node@5f184fc6
//
//        System.out.println(c);  //$Node@3feba861
//        System.out.println(d);  //$Node@5b480cf9
//        System.out.println(e);  //$Node@6f496d9f
    }
}
