package Assignment2;
class QueueLinkedList {
    Node front, rear;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Deleted: " + front.data);
            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
    }
    void display() {
        Node temp = front;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Queue:");
        q.display();

        q.dequeue();

        System.out.println("After Dequeue:");
        q.display();
    }
}