
package inputtoarray;

import java.util.Scanner;
import java.util.Arrays;

public class InputToArray {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Please enter names of 12 animals (separated by spaces): ");
       String answer = input.nextLine();
       String[] answer1 = answer.split(" ");
       
       
       System.out.print(Arrays.toString(answer1));
       
    }
    
}

