import java.util.Stack;

// Clase Persona
class Persona {
    String nombre;
    int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener la información de la Persona
    public String getInfo() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}

public class PilaPersonas {

    public static void main(String[] args) {
        // Crear una pila de Personas
        Stack<Persona> pilaPersonas = new Stack<>();

        // Agregar objetos Persona a la pila
        pilaPersonas.push(new Persona("Juan", 30));
        pilaPersonas.push(new Persona("María", 25));
        pilaPersonas.push(new Persona("Pedro", 35));

        // Mostrar la información de cada objeto Persona en la pila
        System.out.println("Información de las Personas en la Pila:");
        while (!pilaPersonas.isEmpty()) {
            Persona persona = pilaPersonas.pop();
            System.out.println(persona.getInfo());
        }
    }
}