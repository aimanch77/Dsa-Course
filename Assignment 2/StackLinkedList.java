package Assignment2;
class StackLinkedList {
    Node top;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    void pop() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Deleted: " + top.data);
            top = top.next;
        }
    }
    void display() {
        Node temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack:");
        s.display();

        s.pop();

        System.out.println("After Pop:");
        s.display();
    }
}