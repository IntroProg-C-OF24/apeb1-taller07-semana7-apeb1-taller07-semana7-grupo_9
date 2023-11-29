//Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
package problema_2;

import java.util.Scanner;

public class Problema_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre[] = new String[100], posicion[] = new String[100], condicion;
        int edad[] = new int[100], i = 0;
        double estatura[] = new double[100], promestatura = 0, promedad = 0;
        do {
            System.out.print("Ingrese nombre del jugador: ");
            nombre[i] = teclado.nextLine();
            System.out.print("Ingrese posicion del jugador: ");
            posicion[i] = teclado.nextLine();
            System.out.print("Ingrese edad del jugador: ");
            edad[i] = teclado.nextInt();
            System.out.print("Ingrese estatura del jugador: ");
            estatura[i] = teclado.nextDouble();
            promestatura = promestatura + estatura[i];
            i++;
            teclado.nextLine();
            System.out.print("¿Desea ingresar mas informacion si / no? ");
            condicion = teclado.nextLine();
            
        }while("si".equals(condicion)||"y".equals(condicion));  
        for(int jug=0 ;jug<=i-1;jug++){
            System.out.print("nombre: " + nombre[jug] + "/ posicion: " + posicion[jug] + "/ edad: " + edad[jug] + "/ altura: " + estatura[jug]);            
        }
        promedad=promedad/(i);
        promestatura=promestatura/(i);
        System.out.print("Promedio edad: "+promedad);
        System.out.print("Promedio estatura: "+promestatura);
        
        }
    }


