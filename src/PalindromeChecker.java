import java.util.Stack;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {

        Stack<Character> stack = new Stack<>();


        String cleanInput = input.toLowerCase().replaceAll("\\s+", "");


        for (int i = 0; i < cleanInput.length() / 2; i++) {
            stack.push(cleanInput.charAt(i));
        }


        int startIndex = cleanInput.length() % 2 == 0 ? cleanInput.length() / 2 : cleanInput.length() / 2 + 1;
        for (int i = startIndex; i < cleanInput.length(); i++) {
            if (cleanInput.charAt(i) != stack.pop()) {
                return false; // No es un palíndromo
            }
        }

        return true; // Es un palíndromo
    }

    public static void main(String[] args) {
        String input1 = "anita lava la tina";
        String input2 = "Hola";
        String input3 = "A man a plan a canal Panama";

        System.out.println("La cadena '" + input1 + "' es un palíndromo: " + isPalindrome(input1));
        System.out.println("La cadena '" + input2 + "' es un palíndromo: " + isPalindrome(input2));
        System.out.println("La cadena '" + input3 + "' es un palíndromo: " + isPalindrome(input3));
    }
}
