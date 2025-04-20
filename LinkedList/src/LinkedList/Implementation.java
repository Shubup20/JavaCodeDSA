package LinkedList;

public class Implementation {
    public static class Node {
        int data;
        Node next;


        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlistt {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;

            } else {
                tail.next = temp;

            }
            tail = temp;
            size++;
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {  //empty list
                head = tail = temp;
            } else {   //non-empty list
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertInd(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;

            if (idx == size) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtHead(val);
                return;
            } else if (idx < 0 || idx > size) {
                System.out.println("wrong index");
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getAt(int idx) {
            if (idx < 0 || idx > size) {
                System.out.println("wrong index");
                return -1;
            }
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx) {
            if (idx == 0) {
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (idx == size - 1) {
                tail = temp;
            }
            size--;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        //       int size() {  //o(n)
//            Node temp = head;
//            int count = 0;
//            while (temp != null) {
//                count++;
//                temp = temp.next;
//            }
//            return count;
        //     }
    }

    public static void main(String[] args) {
        linkedlistt ll = new linkedlistt();
        ll.insertAtHead(10);
        ll.insertAtEnd(4);
//        ll.display();
        ll.insertAtEnd(5);
//        ll.display();
//        System.out.println(ll.size);
        ll.insertAtEnd(15);
//        ll.display();
        ll.insertAtEnd(18);
//        ll.display();
        ll.insertInd(5, 21);
//        ll.display();
//        System.out.println(ll.tail.data);
        ll.insertInd(0, 100);
        ll.display();
        ll.deleteAt(0);
        ll.display();
        System.out.println(ll.tail.data);

//        System.out.println(ll.getAt(3));
    }
}
