public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);

        // Push elements onto the stack
        System.out.println("Example Stack: ");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Original stack: ");
        stack.display();

        System.out.println("Top element (peek): " + stack.peek());

        // Pop an element from the stack
        System.out.println("Popped element: " + stack.pop());

        // Display the stack again
        System.out.println("Stack after popping an element:");
        stack.display();


        // Queue Class
        System.out.println("Example Queue - Integer Data Type: ");
        Queue<Integer> queue = new Queue<>(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        System.out.println("The Queue after adding new elements: ");
        queue.display();  // Output: 1 2 3

        System.out.println("The Queue after removing the front element: ");
        queue.remove();
        queue.display();  // Output: 2 3

        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        System.out.println("The Queue after inserting new elements (reuse the slots): ");
        queue.display();  // Output: 2 3 4 5 6

        System.out.println("Front item: " + queue.peekFront());  // Output: 2
        System.out.println("Rear item: " + queue.peekRear());    // Output: 6

        // Remove all 5 elements
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();

        queue.display();
        queue.remove();
        queue.peekFront();
        queue.peekRear();

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.display();


        System.out.println("Example Queue - String Data Type: ");
        Queue<String> stringQueue = new Queue<>(3);

        stringQueue.insert("Hello");
        stringQueue.insert("World");
        stringQueue.insert("Queue");

        System.out.println("String Queue after insertion:");
        stringQueue.display();  // Output: Hello World Queue

        System.out.println("Front element: " + stringQueue.peekFront());  // Output: Hello
        System.out.println("Rear element: " + stringQueue.peekRear());    // Output: Queue

        System.out.println("Removed element: " + stringQueue.remove());   // Output: Hello

        System.out.println("String Queue after removal:");
        stringQueue.display();  // Output: World Queue


        System.out.println("Example PriorityQueue: ");
        PriorityQueue<String> pq = new PriorityQueue<>(5);

        pq.insert("Task A", 2);
        pq.insert("Task B", 5);
        pq.insert("Task C", 1);
        pq.display();  // Output: Task B (Priority: 5) Task A (Priority: 2) Task C (Priority: 1)

        System.out.println("Removed: " + pq.remove());  // Removes Task B
        pq.display();  // Output: Task A(Priority: 2) Task C(Priority: 1)

        pq.insert("Task D", 3);
        pq.display();  // Output: Task D (Priority: 3) Task A (Priority: 2) Task C (Priority: 1)

        System.out.println("Front item: " + pq.peekFront());  // Output: Task A (highest priority)
        System.out.println("Rear item: " + pq.peekRear());    // Output: Task C (lowest priority)



        System.out.println("Example StringReverser: ");
        String input = "Hello, World!";
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + StringReverser.reverse(input));



        System.out.println("Example Delimiter: ");
        String[] testInputs = {
                "{[()]}",    // Should return true
                "{[(])}",    // Should return false
                "{[()]}{}",  // Should return true
                "((()))",    // Should return true
                "(()",       // Should return false
                "{[}]"       // Should return false
        };

        for (String inputDelimiter: testInputs) {
            System.out.println("Input: " + inputDelimiter + " -> Balanced: " + DelimiterChecker.check(inputDelimiter));
        }
    }
}
