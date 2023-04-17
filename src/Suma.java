import java.util.*;
public class Suma {
    public static void main(String[] args) {
        int sum=0;
        Stack<Integer> pila = new Stack<Integer>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        for (Integer val:pila
             ) {sum=sum+val;

        }
        System.out.println("la suma es "+sum);

        }
    }
