import java.util.Stack;

public class MinMaxFinder {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();


        stack.push(5);
        stack.push(10);
        stack.push(3);
        stack.push(8);
        stack.push(1);


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("El número mínimo es: " + min);
        System.out.println("El número máximo es: " + max);
    }
}
