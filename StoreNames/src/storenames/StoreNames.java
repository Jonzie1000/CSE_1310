
package storenames;

import java.util.Arrays;
import java.util.Scanner;

public class StoreNames {

    public static void main(String[] args) {
        char repeat = 'C';
        
        
        do{            
     Scanner input = new Scanner(System.in);
        System.out.println("Please enter last name, first name, and age of customer (separated by spaces): ");
        String answer = input.nextLine();
        String[] split = answer.split(" ");
        for(int i=0; i<split.length; i++){
        String last = split[0];
        String first = split[1];
        int age = Integer.parseInt(split[2]);
        }
        System.out.println("Would you like to enter another name? (Y/N): ");
        String answer2 = input.nextLine().toUpperCase();
        if(answer2.equals("Y")){
            repeat = 'Y';
        }else if(answer2.equals("N")){
            repeat = 'N';
             System.out.println(last);
             System.out.println(first);
             System.out.println(age);
        }else{
            System.out.println("Something went wrong with your input.");
        }
        
        }
       
        while(repeat == 'Y');
        
    }
    
}
