package soluciones;

/*
 Problema 3
Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. Por cada empleado se debe solicitar el nombre,
numero de días trabajados y costo del día trabajo. Calcular el valor a cancelar por la empresa para cada empleado.
Presentar un reporte como el siguiente:
 */
import java.util.Scanner;
public class Problema_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre[]= new String [5];
        int i=1, dTrabajo=0;
        double costoDias=0, valorT=0;
        while(i < 5){
            System.out.println("DATOS DEL EMPLEADO:" + i);
            System.out.println("Ingrese nombre del empleado:");
            nombre[5] = teclado.next();
            System.out.println("Ingrese los dias que ha trabajado:");
            dTrabajo = teclado.nextInt();
            System.out.println("Ingrese el costo por dias:");
            costoDias = teclado.nextDouble();
            valorT = dTrabajo * costoDias;
           i++; 
        }
        i=0;
        while(i < 5){
            System.out.println("-------------------");
            System.out.println(nombre[i] + " / " + dTrabajo + " / $" + costoDias + " / $" + valorT);
            System.out.println("-------------------");
        }
    }   
}
