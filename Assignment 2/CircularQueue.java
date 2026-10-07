package Assignment2;
class CircularQueue {

    int[] queue = new int[5];
    int front = -1;
    int rear = -1;

    void enqueue(int data) {

        if ((rear + 1) % 5 == front) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % 5;
            queue[rear] = data;
        }
    }

    void dequeue() {

        if (front == -1) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Deleted: " + queue[front]);

            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % 5;
            }
        }
    }

    void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.println(queue[i]);

            if (i == rear) {
                break;
            }

            i = (i + 1) % 5;
        }
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Circular Queue:");
        q.display();

        q.dequeue();
        q.dequeue();

        q.enqueue(50);
        q.enqueue(60);

        System.out.println("After Operations:");
        q.display();
    }
}