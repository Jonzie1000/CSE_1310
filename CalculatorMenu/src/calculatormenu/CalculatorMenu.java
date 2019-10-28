/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatormenu;

import java.util.Scanner;
/**
 *
 * @author John
 */
public class CalculatorMenu {

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
        
        if(selection1 == 1){
            double answer1 = selection2+selection3;
            System.out.printf("%s + %s = %s \n", selection2, selection3, answer1);
        }    
        else if(selection1 == 2){
            double answer2 = selection2-selection3;
            System.out.printf("%s - %s = %s \n", selection2, selection3, answer2);
        }   
        else if(selection1 == 3){
            double answer3 = selection2*selection3;
            System.out.printf("%s x %s = %s \n", selection2, selection3, answer3);
        }    
        else if(selection1 == 4){
            double answer4 = selection2/selection3;
            System.out.printf("%s / %s = %s \n", selection2, selection3, answer4);
        }    
        else if(selection1 == 5){
            double answer5 = Math.pow(selection2,selection3);
            System.out.printf("%s ^ %s = %s \n",selection2, selection3, answer5);
        } 
        else if(selection1 == 6){
            double answer6 = Math.pow(selection2,1/selection3);
            System.out.printf("%s ^ 1/%s = %s \n", selection2, selection3, answer6);
        }    
        else if(selection1 == 7){
            double answer7 = selection2%selection3;
            System.out.printf("%s %% %s = %s \n", selection2, selection3, answer7);
        }
        else{
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
    }
    

