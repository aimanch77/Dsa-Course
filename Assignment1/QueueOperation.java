package Assignment1;
import java.util.Scanner;
public class QueueOperation {
    static int[] queue = new int[10];
    static int front = 0;
    static int rear = -1;
    // Enqueue
    public static void enqueue(Scanner sc) {
        if (rear == 9) {
            System.out.println("Queue is full!");
            return;
        }
        System.out.print("Enter value: ");
        int value = sc.nextInt();

        rear++;
        queue[rear] = value;
        System.out.println("Value added successfully.");
    }
    // Dequeue
    public static void dequeue() {
        if (rear < front) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Removed value: " + queue[front]);

        // Shift values to left
        for (int i = front; i < rear; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
        System.out.println("Value removed successfully.");
    }
    // Display
    public static void display() {

        if (rear < front) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Queue values:");

        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

    // Size
    public static void size() {

        if (rear < front) {
            System.out.println("Queue size = 0");
        } else {
            System.out.println("Queue size = " + (rear - front + 1));
        }
    }

    // isEmpty
    public static void isEmpty() {

        if (rear < front) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue is not empty.");
        }
    }

    // isFull
    public static void isFull() {

        if (rear == 9) {
            System.out.println("Queue is full.");
        } else {
            System.out.println("Queue is not full.");
        }
    }

    // Main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    enqueue(sc);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    size();
                    break;

                case 5:
                    isEmpty();
                    break;

                case 6:
                    isFull();
                    break;

                case 7:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}