public class Queue<T> {
    private T[] queueArray;     // Array for queue
    private int front;      // Index of the front element
    private int rear;       // Index of the rear element
    private int size;       // Current number of elements
    private int capacity;   // Maximum queue capacity


    // Constructor to initialize the queue with  arraySize
    @SuppressWarnings("unchecked")
    public Queue(int arraySize){
        this.capacity = arraySize;
        this.queueArray = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }


    // Insert Method to add new element at the back of the queue
    public void insert(T newItem){
        if ( size == capacity ){
            System.out.println("Queue is full. Cannot insert new element.");
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = newItem;
        size++;
    }


    // Remove Method to remove the element in front of the queue
    public T remove() {
        if ( size == 0 ){
            System.out.println("Queue is empty. Nothing to remove.");
            return null;
        }
        T item = queueArray[front];
        queueArray[front] = null;      // Clear the removed item
        front = ( front + 1 ) % capacity;
        size--;
        return item;
    }


    // PeekFront Method to view the front element
    public T peekFront(){
        if ( size == 0 ){
            System.out.println("Queue is empty. Nothing's at the front.");
            return null;
        }
        return queueArray[front];
    }


    // PeekRear Method to view the rear element
    public T peekRear(){
        if ( size == 0 ){
            System.out.println("Queue is empty. Nothing's at the rear.");
            return null;
        }
        return queueArray[rear];
    }


    @Override
    public String toString() {
        if (size == 0) {
            return "Queue is empty.";
        }
        StringBuilder sb = new StringBuilder();
        int current = front;
        for (int i = 0; i < size; i++) {
            sb.append(queueArray[current]).append(" ");
            current = (current + 1) % capacity;  // Circular increment
        }
        return sb.toString().trim();
    }


    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        // Start from the front and go to the rear
        int current = front;
        for (int i = 0; i < size; i++) {
            System.out.print(queueArray[current] + " ");
            current = (current + 1) % capacity;  // Circular increment
        }
        System.out.println();
    }

}