package xyz;

class Nodes {
    int data;
    Nodes next;
    Nodes(int data) {
        this.data = data;
    }
}

public class ReverseLinkedList {
    public static Nodes reverse(Nodes head) {
        Nodes prev = null;
        Nodes current = head;
        while (current != null) {
            Nodes next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void print(Nodes head) {
        Nodes temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Nodes head = new Nodes(1);
        head.next = new Nodes(2);
        head.next.next = new Nodes(3);

        head = reverse(head);
        print(head);
    }
}
