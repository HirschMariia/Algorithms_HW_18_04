public class MyStack {

    private final int[] stackArray; private int top; private final int maxSize;

    public MyStack(int maxSize) { this.maxSize = maxSize; stackArray = new int[maxSize]; top = -1; }

    public void push(int v) { if (top == maxSize - 1) { System.out.println("Stack is full"); } else { top++; stackArray[top] = v; } }

    public int pop() { if (isEmpty()) { System.out.println("Stack is empty"); return -1; } else { int poppedValue = stackArray[top]; top--; return poppedValue; } }

    public boolean isEmpty() { return top == -1; }
}

