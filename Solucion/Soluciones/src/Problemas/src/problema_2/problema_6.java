//Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuentopor tipo de cliente:
//Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20% 
//En caso que sea otro tipo de cliente, no hay descuento. Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
package problema_2;

import java.util.Scanner;

public class problema_6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double costCompu;
        int cliente, venta = 1;
        while (venta <= 7) {
            System.out.println("Ingrese nombre del cliente: ");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese costo computadora");
            double cost = teclado.nextDouble();
            System.out.println("Ingrese tipo de cliente: ");
            cliente = teclado.nextInt();
            System.out.println("Nombre: " + nombre);
            System.out.println("Costo computadora: " + cost);
            if (cliente == 1) {
                cost = (cost - (cost * 10) / 100);
                System.out.println("Cliente tipo " + cliente + ", compra computadora con un precio de " + cost + "$");
            } else {
                cost = (cost - (cost * 20) / 100);
                System.out.println("Cliente tipo "+cliente+", compra computadora con un precio de "+cost+"$");
            }
            venta++;
            teclado.nextLine();
            teclado.nextLine();
        }
    }
}
