package problema_2;

import java.util.Scanner;

public class Problema_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      
        int num = 5 ,num1 = 10;
        while (num<30) {
            System.out.println(num + "/" + num1);
            num+=5;
            num1+=2;
        }
                
    }
    
}
