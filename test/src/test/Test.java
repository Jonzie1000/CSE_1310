package test;

import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author John
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        
        System.out.println("Please enter first set of numbers (separated by spaces): ");
    
        String input = user_input.nextLine();
        String[] numbers;
        numbers = input.split(" ");
        
        ArrayList<Integer> input1;
        input1 = new ArrayList<>(numbers.length);
        ArrayList<Integer> input2;
        input2 = new ArrayList<>();
        ArrayList<Integer> merged;
        merged = new ArrayList<>(); 
      
        for (int i=0; i<numbers.length; i++) {
            input1.set(i, Integer.parseInt(numbers[i]));
        }
        
       System.out.println(input1);
        
        
            
            
                
            
            
        }
        
       // System.out.println(input1);
       // System.out.println("Please enter second set of numbers (separated by spaces): ");
        
       // while(input.hasNextInt()){
        //    input2.add(input.nextInt());      
        }
         //System.out.println(input1);
         //System.out.println(input2);
       

   
    

