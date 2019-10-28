package animalsreversed;

import java.util.Scanner;
import java.util.Arrays;

public class AnimalsReversed{
    
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.println("Enter animal names (separated by a space): ");
String input1 = input.nextLine();
String[] animals = input1.split(" ");

for(int i=0; i<animals.length; i++){

for(int j=animals[i].length()-1; j>=0; j--){   
    System.out.print(animals[i].charAt(j));
    
}

System.out.print(" ");
}

}
}