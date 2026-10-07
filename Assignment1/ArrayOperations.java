package Assignment1;
import java.util.Scanner;
public class ArrayOperations {
    static int[] array = new int[20];
    static int size = 0;
    // 1. Add value at end
    public static void add(Scanner sc) {

        if (size == 20) {
            System.out.println("Array is full!");
            return;
        }
        System.out.print("Enter value: ");
        int value = sc.nextInt();
        array[size] = value;
        size++;
        System.out.println("Value added successfully.");
    }
    // 2. Insert at index
    public static void insert(Scanner sc) {
        if (size == 20) {
            System.out.println("Array is full!");
            return;
        }
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        if (index < 0 || index > size) {
            System.out.println("Invalid index!");
            return;
        }
        System.out.print("Enter value: ");
        int value = sc.nextInt();
        // Shift values to right
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        } 
        array[index] = value;
        size++;
        System.out.println("Value inserted successfully.");
    }
    // 3. Fill array
    public static void fill(Scanner sc) {
        System.out.print("How many values do you want to enter? ");
        int n = sc.nextInt();
        if (n > 20 - size) {
            System.out.println("Not enough space in array.");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            array[size] = sc.nextInt();
            size++;
        }
        System.out.println("Array filled successfully.");
    }
    // 4. Delete last element
    public static void deleteLast() {
        if (size == 0) {
            System.out.println("Array is empty!");
            return;
        }
        size--;
        System.out.println("Last value deleted.");
    }
    // 5. Delete by index
    public static void deleteByIndex(Scanner sc) {
        if (size == 0) {
            System.out.println("Array is empty!");
            return;
        }
        System.out.print("Enter index to delete: ");
        int index = sc.nextInt();
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }
        // Shift values to left
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        System.out.println("Value deleted successfully.");
    }
    // 6. Display
    public static void display() {
        if (size == 0) {
            System.out.println("Array is empty!");
            return;
        }
        System.out.println("Array values:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + " = " + array[i]);
        }
    }
    // 7. Search
    public static void search(Scanner sc) {
        System.out.print("Enter value to search: ");
        int value = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                System.out.println("Value found at index " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Value not found.");
        }
    }
    // 8. Get value at index
    public static void getValue(Scanner sc) {
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }

        System.out.println("Value = " + array[index]);
    }
    // 9. Update value
    public static void update(Scanner sc) {

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }
        System.out.print("Enter new value: ");
        int value = sc.nextInt();

        array[index] = value;

        System.out.println("Value updated successfully.");
    }
    // Main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n----- ARRAY MENU -----");
            System.out.println("1. Add value");
            System.out.println("2. Insert at index");
            System.out.println("3. Fill array");
            System.out.println("4. Delete last element");
            System.out.println("5. Delete by index");
            System.out.println("6. Display");
            System.out.println("7. Search value");
            System.out.println("8. Get value at index");
            System.out.println("9. Update value");
            System.out.println("10. Size");
            System.out.println("11. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    add(sc);
                    break;

                case 2:
                    insert(sc);
                    break;

                case 3:
                    fill(sc);
                    break;

                case 4:
                    deleteLast();
                    break;

                case 5:
                    deleteByIndex(sc);
                    break;

                case 6:
                    display();
                    break;

                case 7:
                    search(sc);
                    break;

                case 8:
                    getValue(sc);
                    break;

                case 9:
                    update(sc);
                    break;

                case 10:
                    System.out.println("Size = " + size);
                    break;

                case 11:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 11);

        sc.close();
    }
}
