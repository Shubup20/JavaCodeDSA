
public class SplitList {
//3 5 4 1 2 8 10 13
    public static void oddEvenList(Node head){
    Node temp = head;
    Node oddDummy = new Node(-1);
    Node evenDummy = new Node(0);

    Node oddTail =oddDummy;
    Node evenTail = evenDummy;

    while (temp!=null){
        if(temp.val%2!=0){
            oddTail.next = new Node(temp.val);
            oddTail = oddTail.next;
        }else{
            evenTail.next = new Node(temp.val);
            evenTail = evenTail.next;
        }
        temp=temp.next;

    }

        // Display both lists
        System.out.print("Odd values: ");
        display(oddDummy.next);

        System.out.print("Even values: ");
        display(evenDummy.next);
    }

    public static void display(Node head){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
            this.next = null;
        }

    }
    public static void main(String[] args) {
        Node a= new Node(3);
        Node b= new Node(5);
        Node c= new Node(4);
        Node d= new Node(1);
        Node e= new Node(2);
        Node f= new Node(8);
        Node g= new Node(10);
        Node h= new Node(13);

        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;
        e.next =f;
        f.next =g;
        g.next =h;

        System.out.print("Original List: ");
        display(a);

        // Split and display
        oddEvenList(a);


    }
}

