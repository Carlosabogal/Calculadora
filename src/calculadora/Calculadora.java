/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Dame un numero entero");
        int x;
        x=scanner.nextInt();
        System.out.println("Dame otro numero entero");
        int y;
        y=scanner.nextInt();
        System.out.println("Dame otro numero entero");
        int z;
        z=scanner.nextInt();
        int resultado;
        resultado=(x-y)*z;
        System.out.println("El resultado es: "+ resultado);
        
        
        
    }
    
}
