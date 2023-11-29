package soluciones;

/*
 Problema 5
Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de ellos 
ingresar el nombre del estudiante, el promedio de ciclo. Presentar el siguiente reporte
 */
import java.util.Scanner;
public class Problema_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre[] = new String[5];
        double nota[] = new double [5];
        for (int i = 0; i < 4; i++){           
            System.out.println("Ingrese el nombre del estudiante:");
            nombre[i] = teclado.nextLine();
            System.out.println("Ingrese la nota:");
            nota[i] = teclado.nextDouble();
            teclado.nextLine();
        }
        System.out.println("-----------------");
        for(int i=0;i<4;i++){
            if (nota[i]>=7) 
                System.out.println(nombre[i] + " - " + nota[i] + "- APROBADO");
            else
                System.out.println(nombre[i] + " - " + nota[i] + "- REPROBADO");
        }
    }   
}
