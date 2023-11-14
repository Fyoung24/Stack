public class StackTest {// Test driver to demonstrate the usage of Stack and StackNode
        public static void main(String[] args) {
            // Creating a new stack
            Stack<Integer> stack = new Stack<>();

            // Pushing elements onto the stack
            stack.push(1);
            stack.push(2);
            stack.push(3);

            // Displaying the size of the stack
            System.out.println("Stack Size: " + stack.size());

            // Peeking at the top element
            System.out.println("Top Element: " + stack.peek());

            // Popping elements from the stack
            System.out.println("Popped Element: " + stack.pop());
            System.out.println("Popped Element: " + stack.pop());

            // Displaying the size of the stack after pops
            System.out.println("Stack Size: " + stack.size());
        }
    }

