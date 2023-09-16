package clase_8Funsiones;
import java.util.Scanner;

import static java.lang.Math.random;

public class Funciones {
    public static void main(String[] args) {
        //Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado.
        System.out.println("El area del cuadrado es: "+areaCuadrado());
        // Crear una función que sea un generador de contraseñas. Al llamarla debe devolver una contraseña
        // (por ejemplo, puedes utilizar Math.random() para devolver un número aleatorio que podría ser una contraseña.
        System.out.println(generadorContrasenia());
    }
    public static double areaCuadrado(){
        System.out.println("Ingrese un lado para calcular el area de un cuadraro");
        Scanner sc = new Scanner(System.in);
        double lado=sc.nextDouble();
        double area = lado * lado;
        return area;
    }

    public static String generadorContrasenia(){
        System.out.println("Ingrese nombre: ");
        Scanner sc1 = new Scanner(System.in);
        String nombre = sc1.nextLine();

        double contrasenia= Math.random()*100000;
        long numeroAleatorio = Math.round(contrasenia);
        String password = numeroAleatorio+"5asdfas4";
        return "nombre: "+nombre+" Contraseña: "+password;
    }

}
