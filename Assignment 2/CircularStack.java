package Assignment2;
class CircularStack {

    int[] stack = new int[5];
    int top = -1;

    void push(int data) {

        if (top == 4) {
            top = -1;
        }

        top++;
        stack[top] = data;
    }

    void pop() {

        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Deleted: " + stack[top]);
            top--;
        }
    }

    void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {

        CircularStack s = new CircularStack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Circular Stack:");
        s.display();

        s.pop();

        System.out.println("After Pop:");
        s.display();
    }
}