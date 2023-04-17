import java.util.*;
public class Remove {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<String>();
        pila.push("sapo");
        pila.push("perro");
        pila.push("gato");
        pila.push("obeja ");

        pila.remove("perro");
        for (String valor :pila){
            if(valor=="perro"){
                pila.remove(valor);
            }

        }
        for (String val:pila){
            System.out.println(val);
        }
        }
    }
