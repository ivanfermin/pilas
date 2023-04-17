import java.util.Stack;

public class PilaDeEnteros {
    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();


        pila.push(5);
        pila.push(10);
        pila.push(15);
        pila.push(20);
        int numeroBuscado = 15;
        if (pila.contains(numeroBuscado)) {
            System.out.println("El número " + numeroBuscado + " está en la pila.");
        } else {
            System.out.println("El número " + numeroBuscado + " no está en la pila.");
        }
        System.out.println(pila.search(20)==-1?"no hay el elemento":"  hay el elemento");
    }
}