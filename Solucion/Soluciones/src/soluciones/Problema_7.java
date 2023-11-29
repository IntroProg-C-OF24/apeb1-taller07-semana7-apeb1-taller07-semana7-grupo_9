package soluciones;

/*
 Problema 7
Generar e imprimir la siguiente serie:
 */
public class Problema_7 {
    public static void main(String[] args) {
        int num=-1,den=1;
        do{
            System.out.println(num + " / " + den);
            num= num *(-1);
            den++;
        }while(den<=10);       
    }    
}
