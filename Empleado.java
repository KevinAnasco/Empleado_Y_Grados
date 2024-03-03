

import java.util.*;


public class Empleado {

    Scanner sc = new Scanner(System.in);
    static double Salariototal;
    static int contador;
    String Nombre;
    String Apellido;
    private double SalarioMensual;
    
    
    public Empleado(String Nombre, String Apellido,double SalarioMensual) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.SalarioMensual=SalarioMensual;
        Empleado.contador++;
        Empleado.Salariototal+=SalarioMensual;
    }

    public static double getSalariototal() {
        return Salariototal;
    }

    public static void setSalariototal(double Salariototal) {
        Empleado.Salariototal = Salariototal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getSalarioMensual() {
        return SalarioMensual;
    }

    public void setSalarioMensual(double SalarioMensual) {
        this.SalarioMensual = SalarioMensual;
    }


    void imprimir() {
        System.out.println("Identificador empleado: " + Empleado.contador);
        System.out.println("Nombre del empleado: " + Nombre+" "+Apellido);
        System.out.println("Salario del empleado: " + SalarioMensual);

    }

}