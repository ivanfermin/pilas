import java.util.*;
public class Abecedario {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<String>();
        pila.push("f");
        pila.push("s");
        pila.push("g");
        pila.push("y");
        Collections.sort(pila);
        for(String val:pila){
            System.out.println(val);
        }




    }
}