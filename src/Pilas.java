import java.util.*;
public class Pilas {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        System.out.println("Elementos de la ila enm el orden inverso ");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());

        }
    }
}