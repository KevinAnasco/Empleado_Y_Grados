

import java.util.*;


public class Temperatura {

    static Scanner sc = new Scanner(System.in);

    private static double celcius = 0;
    private static double Fahrenheit = 0;

    public static void celcius_a_fahrenheit() {

        System.out.println("*** Ingrese los grados en Celcius ***");
        Temperatura.celcius = sc.nextDouble();

        Fahrenheit = (Temperatura.celcius * 9 / 5) + 32;

        System.out.println("La conversion de " + Temperatura.celcius + "°C Es igual a " + Fahrenheit + "°F");

    }

    public static void fahrenheit_a_celcius() {

        System.out.println("*** Ingrese los grados en Celcius ***");
        Temperatura.Fahrenheit = sc.nextDouble();

        celcius = (Temperatura.Fahrenheit - 32) * 5 / 9;

        System.out.println("La conversion de " + Temperatura.Fahrenheit + "°F Es igual a " + celcius + " °C ");

    }

}
