import java.util.*;

class Empleado {
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }

    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
}

public class Main {
    public static void main(String[] args) {

        Stack<Empleado> pilaEmpleados = new Stack<>();


        pilaEmpleados.push(new Empleado("Empleado 1", 1000));
        pilaEmpleados.push(new Empleado("Empleado 2", 1500));
        pilaEmpleados.push(new Empleado("Empleado 3", 2000));
        pilaEmpleados.push(new Empleado("Empleado 4", 2500));

int num;
Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el salario ");
        num =sc.nextInt();
        for(Empleado val: pilaEmpleados){
            if(val.getSalario()>num){
                System.out.println(val.toString());
            }
        }
            }
        }

