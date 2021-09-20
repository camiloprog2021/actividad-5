/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author Juan Jose Pirateque
 */
public class SumaDeNumeros {

    
    public static void main(String[] args) {
        int num1,  num2 = 0, suma, resta, multiplicacion, division;
         Scanner constructor=new Scanner(System.in);
         Scanner entrada = new Scanner (System.in);
         System.out.println("Dame el primer numero");
         num1= entrada.nextInt();
         System.out.println("Dame el segundo numero");
         num2= entrada.nextInt();
         
         suma = num1+ num2;
         resta = num1-num2;
         multiplicacion = num1*num2;
         division = num1/num2;
         
         System.out.println("El resultado de la suma es: "+suma);
         System.out.println("El resultado de la resta es: "+resta);
         System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
         System.out.println("El resultado de la division es: "+division);
         
         
         
         

        
    }
    
}
