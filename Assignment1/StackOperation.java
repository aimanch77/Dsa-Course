package Assignment1;
import java.util.Scanner;
public class StackOperation {
    static int[] stack = new int[10];
    static int top = -1;
    // Push
    public static void push(Scanner sc) {
        if (top == 9) {
            System.out.println("Stack is full!");
            return;
        }
        System.out.print("Enter value: ");
        int value = sc.nextInt();
        top++;
        stack[top] = value;
        System.out.println("Value pushed successfully.");
    }
    // Pop
    public static void pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Removed value: " + stack[top]);

        top--;
    }
    // Display
    public static void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack values:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
    // Size
    public static void size() {

        System.out.println("Stack size = " + (top + 1));
    }
    // isEmpty
    public static void isEmpty() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }
    // isFull
    public static void isFull() {
        if (top == 9) {
            System.out.println("Stack is full.");
        } else {
            System.out.println("Stack is not full.");
        }
    }
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n----- STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    push(sc);
                    break;

                case 2:
                    pop();
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
