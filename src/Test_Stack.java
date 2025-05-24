package Day_16_DSA_Impact;

public class Test_Stack {
    public static void main(String[] args) {
        Stack_implementetion stack = new Stack_implementetion(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack.size());

    }
}
