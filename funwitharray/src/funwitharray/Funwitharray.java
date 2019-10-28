/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwitharray;


import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author John
 */
public class Funwitharray {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args){
       Scanner user_input = new Scanner(System.in);
       
       double[] myArray = new double[10];
       
       System.out.println("Please enter a number: ");
       double answer1 = user_input.nextDouble();
       
       System.out.println("Please enter a number: ");
       double answer2 = user_input.nextDouble();
       
       System.out.println("Please enter a number: ");
       double answer3 = user_input.nextDouble();
       
       System.out.println("Please enter a number: ");
       double answer4 = user_input.nextDouble();
       
       System.out.println("Please enter a number: ");
       double answer5 = user_input.nextDouble();
       
       System.out.println("Please enter a number: ");
       double answer6 = user_input.nextDouble();
       
       System.out.println("Please enter a number: ");
       double answer7 = user_input.nextDouble();
       
       System.out.println("Please enter a number: ");
       double answer8 = user_input.nextDouble();
       
       System.out.println("Please enter a number: ");
       double answer9 = user_input.nextDouble();
       
       System.out.println("Please enter a number: ");
       double answer10 = user_input.nextDouble();
       
       System.out.println("");
       
       myArray[0]= answer1; 
       myArray[1]= answer2; 
       myArray[2]= answer3; 
       myArray[3]= answer4; 
       myArray[4]= answer5; 
       myArray[5]= answer6; 
       myArray[6]= answer7; 
       myArray[7]= answer8; 
       myArray[8]= answer9; 
       myArray[9]= answer10; 
       
      DecimalFormat format = new DecimalFormat("0.###");

       System.out.printf("Elements at an even index: %s %s %s %s %s ",format.format(myArray[0]),format.format(myArray[2]),format.format(myArray[4]),format.format(myArray[6]),format.format(myArray[8]));
       System.out.println("");
       System.out.print("Even elements: ");
       if(myArray[0]%2 == 0){
           System.out.printf("%s ",format.format(myArray[0]));
       }
       if(myArray[1]%2 == 0){
           System.out.printf("%s ",format.format(myArray[1]));
       }
       if(myArray[2]%2 == 0){
           System.out.printf("%s ",format.format(myArray[2]));
       }
       if(myArray[3]%2 == 0){
           System.out.printf("%s ",format.format(myArray[3]));
       }
       if(myArray[4]%2 == 0){
           System.out.printf("%s ",format.format(myArray[4]));   
       }
       if(myArray[5]%2 == 0){
           System.out.printf("%s ",format.format(myArray[5]));
       }
       if(myArray[6]%2 == 0){
           System.out.printf("%s ",format.format(myArray[6]));
       }
       if(myArray[7]%2 == 0){
           System.out.printf("%s ",format.format(myArray[7]));
       }
       if(myArray[8]%2 == 0){
           System.out.printf("%s ",format.format(myArray[8]));
       }
       if(myArray[9]%2 == 0){
           System.out.printf("%s ",format.format(myArray[9]));
       }
       System.out.println("");
       System.out.print("Elements in reverse order: ");
       for(int counter=myArray.length - 1; counter >= 0;counter--){
            System.out.printf("%s ",format.format(myArray[counter]));

       }
       System.out.println("");
       
       double average = (answer1+answer2+answer3+answer4+answer5+answer6+answer7+answer8+answer9+answer10)/10;
       System.out.println("Average of all elements: "+format.format(average));
       
       System.out.printf("The first element is %s. The last element is %s.",format.format(myArray[0]),format.format(myArray[9]));
       System.out.println("");
    } 
       
       }
    
       
       
  
