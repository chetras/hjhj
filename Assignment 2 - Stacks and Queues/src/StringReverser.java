public class StringReverser {
    public static String reverse(String input) {
        // Create a stack using our implemented Stack class with the size of the input string
        Stack<Character> stack = new Stack<>(input.length());

        // Push each character of the input string to the stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Pop characters from the stack and append them to result
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }
}
