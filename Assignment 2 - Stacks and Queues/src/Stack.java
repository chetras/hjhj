import java.util.Arrays;
import java.util.NoSuchElementException;

public class Stack<T> {
    private T[] stackArray;  // Array for stack
    private int top; // Index of the top element
    private int capacity; // Current stack capacity


    // Constructor to initialize the stack with arraySize
    @SuppressWarnings("unchecked")
    public Stack(int arraySize) {
        capacity = arraySize;
        stackArray = (T[]) new Object[capacity];
        top = -1;
    }

    // Push Method to add new element on top of the stack
    public void push(T newItem) {
        if (top == capacity - 1) {
            resize(); // Resize if the stack is full
        }
        stackArray[++top] = newItem; // Increment top and add new item
    }


    // Pop Method to remove the top element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty!");
        }
        T item = stackArray[top];
        stackArray[top--] = null; // Clear the popped item
        return item; // Return the popped item
    }


    // Peek Method to view the top element of the stack (no removal)
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty!");
        }
        return stackArray[top];
    }


    // Check if it's empty
    public boolean isEmpty() {
        return top == -1;
    }


    public String toString() {
        return Arrays.toString(Arrays.copyOf(stackArray, top + 1));
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }


    // Resize Method to handle overflow condition
    private void resize() {
        capacity *= 2; // Double the capacity
        T[] newArray = (T[]) new Object[capacity];
        System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
        stackArray = newArray;
    }
}