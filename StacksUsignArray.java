
class Stack {

    private int[] stack;
    private int top;
    private int size;

    // Constructor to initialize the stack
    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // Method to add an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    // Method to remove an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            int value = stack[top--];
            System.out.println(value + " popped from stack.");
            return value;
        }
    }

    // Method to check the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stack[top];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == size - 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);  // This will show stack overflow

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();  // This will show stack underflow
    }
}
