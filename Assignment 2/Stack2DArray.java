package Assignment2;
class Stack2DArray {
    int[][] stack = new int[2][5];
    int[] top = {-1, -1};

    void push(int stackNo, int data) {
        if (top[stackNo] == 4) {
            System.out.println("Stack is Full");
        } else {
            top[stackNo]++;
            stack[stackNo][top[stackNo]] = data;
        }
    }

    void pop(int stackNo) {
        if (top[stackNo] == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Deleted: " +
                    stack[stackNo][top[stackNo]]);
            top[stackNo]--;
        }
    }

    void display(int stackNo) {
        for (int i = top[stackNo]; i >= 0; i--) {
            System.out.println(stack[stackNo][i]);
        }
    }

    public static void main(String[] args) {
        Stack2DArray s = new Stack2DArray();

        s.push(0, 10);
        s.push(0, 20);
        s.push(0, 30);

        System.out.println("Stack:");
        s.display(0);

        s.pop(0);
    }
}