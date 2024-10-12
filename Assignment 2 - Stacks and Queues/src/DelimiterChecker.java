public class DelimiterChecker {
    public static boolean check(String input) {
        // Create a stack using our implemented Stack class to keep track of the opening delimiters
        Stack<Character> stack = new Stack<>(input.length());

        // Loop through the input string and push opening delimiters
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);

                // Check for closing delimiters
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the last opened delimiter
                char lastOpened = stack.pop();

                // Check if the pairs match
                if (!isMatchingPair(lastOpened, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();  // Check if all opened delimiters were closed
    }

    // Helper method to check if the opening and closing delimiters match
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}