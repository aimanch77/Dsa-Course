package Assignment2;
class Queue2DArray {

    int[][] queue = new int[2][5];
    int[] front = {0, 0};
    int[] rear = {-1, -1};

    void enqueue(int queueNo, int data) {
        if (rear[queueNo] == 4) {
            System.out.println("Queue is Full");
        } else {
            rear[queueNo]++;
            queue[queueNo][rear[queueNo]] = data;
        }
    }

    void dequeue(int queueNo) {
        if (front[queueNo] > rear[queueNo]) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Deleted: " +
                    queue[queueNo][front[queueNo]]);
            front[queueNo]++;
        }
    }

    void display(int queueNo) {
        for (int i = front[queueNo]; i <= rear[queueNo]; i++) {
            System.out.println(queue[queueNo][i]);
        }
    }

    public static void main(String[] args) {
        Queue2DArray q = new Queue2DArray();

        q.enqueue(0, 10);
        q.enqueue(0, 20);
        q.enqueue(0, 30);

        System.out.println("Queue:");
        q.display(0);

        q.dequeue(0);
    }
}