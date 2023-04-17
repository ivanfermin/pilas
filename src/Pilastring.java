import java.util.*;
public class Pilastring {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<String>();
        pila.push("a");
        pila.push("b");
        pila.push("c");
        pila.push("d");
        System.out.println("Elementos de la ila enm el orden inverso ");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());

        }
        System.out.println(pila.isEmpty()?"esta vacia" :"esta llena");
    }
}