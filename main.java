

public class main {
    public static void main(String[] args) {
        
       Empleado empleado1 = new Empleado("Kevin","Añazco",50000);
        empleado1.imprimir();
        System.out.println("");
        Empleado empleado2 = new Empleado("Johiner","Tamayo",10000);
        empleado2.imprimir();
        System.out.println("");
        Empleado empleado3 = new Empleado("Cristiano","Ronaldo",80000);
        empleado3.imprimir();
        
        System.out.println("\nEl total de la nomina de los empleados es de: "+Empleado.getSalariototal());

        
       Temperatura.celcius_a_fahrenheit();
       Temperatura.fahrenheit_a_celcius();
        
       
    }
    
}
