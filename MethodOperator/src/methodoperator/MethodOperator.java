/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoperator;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class MethodOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
      
     char run = 'Y';
        String input;
        
        
       
        while (run != 'N'){    
        
      System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Power");
        System.out.println("6. Root");
        System.out.println("7. Modulus");
        
        System.out.println("");
        
        double selection1;
        System.out.println("Please enter the number of the menu option that corresponds to the operation you'd like to perform: ");
        selection1 = user_input.nextDouble();
        
        double selection2;
        System.out.println("Please enter first value: ");
        selection2 = user_input.nextDouble();
        
        double selection3;
        System.out.println("Please enter second value: ");
        selection3 = user_input.nextDouble();
        
        double sum = addition (selection2, selection3);
        double difference = subtract (selection2, selection3);
        double multiply = mult (selection2, selection3);
        double divide = div (selection2, selection3);
        double power = powe (selection2, selection3);
        double root = roo (selection2, selection3);
        double modulus = mod (selection2, selection3);
        
        if(selection1 == 1){
           System.out.printf("%s + %s = %s \n",selection2,selection3,sum);
        }else if(selection1 == 2){
           System.out.printf("%s - %s = %s \n",selection2, selection3,difference);
        }else if(selection1 == 3){
            System.out.printf("%s x %s = %s \n",selection2,selection3,multiply);
        }else if(selection1 == 4){
            System.out.printf("%s/%s = %s \n",selection2, selection3,divide);
        }else if(selection1 == 5){
            System.out.printf("%s^%s = %s \n",selection2, selection3,power);
        }else if(selection1 == 6){
            System.out.printf("%s^1/%s = %s \n",selection2, selection3,root);
        }else if(selection1 == 7){
            System.out.printf("%s %% %s = %s \n",selection2,selection3,modulus);
        }else{
            System.out.println("Option not found, input number that corresponds to menu.");
        }
        System.out.print("Would you like to perform another calculation? Y/N: ");
        input = user_input.next().toUpperCase();
        run = input.charAt(0);
        
        if(run == 'N'){
            System.out.println("Thank you! Goodbye!");
        }    
    }
    }
    public static double addition (double selection2, double selection3){
            return selection2 + selection3;
        }
    public static double subtract (double selection2, double selection3){
        return selection2 - selection3;
    }
    public static double mult (double selection2, double selection3){
        return selection2 * selection3;
    }
    public static double div (double selection2, double selection3){
        return selection2/selection3;
    }
    public static double powe (double selection2, double selection3){
        return Math.pow(selection2, selection3);
    }
    public static double roo (double selection2, double selection3){
        return Math.pow(selection2, 1/selection3);
    }
    public static double mod (double selection2, double selection3){
        return selection2 % selection3;
    }
}



    
    

