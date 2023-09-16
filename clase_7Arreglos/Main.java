package clase_7Arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Ingrese 5 números");
        for (int i=0; i<numeros.length; i++){
            System.out.println("Ingrese numero "+i);
            numeros[i]=sc.nextInt();
        }
        System.out.println("Los numeros ingresados son: "+ Arrays.toString(numeros));

        //Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.
        int max = 0;
        int min = 0;
        for (int i=0; i<numeros.length; i++){
            if (numeros[i] > max){
                max = numeros[i];
            }else {
                min = numeros[i];
            }
        }
        System.out.println("El numero mayor es: "+max);
        System.out.println("El numero menor es: "+min);

        //Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5,
        //ya que el usuario agregó 5 números.

        double promedio;
        double suma=0;
        for (int i=0; i<numeros.length;i++){
            suma = suma + numeros[i];
        }
        promedio=suma/numeros.length;
        System.out.println("La suma de todos los numeros de la lista es: "+suma);
        System.out.println("El promdio es: "+suma+"/"+numeros.length+" = "+promedio);
    }
}
