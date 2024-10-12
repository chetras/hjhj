public class PriorityQueue <T>{
    private T[] items;
    private int[] priorities;
    private int size;
    private int capacity;


    @SuppressWarnings("unchecked")
    public PriorityQueue(int arraySize){
        this.capacity = arraySize;
        this.items = (T[]) new Object[arraySize];
        this.priorities = new int[arraySize];
        this.size = 0;
    }


    // Insert Method to add new element based on their priority value
    public void insert(T newItem, int priorityValue) {
        if (size == capacity) {
            System.out.println("PriorityQueue is full. Cannot insert new element.");
            return;
        }

        int i;
        for (i = size - 1; i >= 0; i--) {
            // Compare the priority values between the new item & current item
            if (priorityValue > priorities[i]) {
                items[i + 1] = items[i];        // Shift to the right
                priorities[i + 1] = priorities[i];
            } else {
                break;
            }
        }
        // Insert the new item and increment the queue size
        items[i + 1] = newItem;
        priorities[i + 1] = priorityValue;
        size++;
    }


    // Remove Method to remove the first/highestPriority element
    public T remove() {
        if (size == 0) {
            System.out.println("PriorityQueue is empty. Nothing to remove.");
            return null;
        }
        T highestPriorityItem = items[0];
        for (int i = 0; i < size - 1; i++) {
            items[i] = items[i + 1];
            priorities[i] = priorities[i + 1];
        }
        size--;
        return highestPriorityItem;
    }


    // PeekFront Method to view the front/highestPriority element
    public T peekFront() {
        if (size == 0) {
            System.out.println("PriorityQueue is empty. Nothing at the front.");
            return null;
        }
        return items[0];    // Highest Priority Item
    }


    // PeekRear Method to view the rear/lowestPriority element
    public T peekRear() {
        if (size == 0) {
            System.out.println("PriorityQueue is empty. Nothing at the rear.");
            return null;
        }
        return items[size - 1];     // Lowest Priority Item
    }


    @Override
    public String toString() {
        if (size == 0) {
            return "PriorityQueue is empty.";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(items[i]).append(" (Priority: ").append(priorities[i]).append(") ");
        }
        return sb.toString().trim();
    }


    public void display() {
        System.out.println(this.toString());
    }

}