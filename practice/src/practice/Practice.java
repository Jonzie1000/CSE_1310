package practice;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice{
    
public static void main(String[] args){

 Scanner input = new Scanner(System.in);

ArrayList<String> list = new ArrayList<>();
list.add("hammer");

ArrayList<String> list2 = new ArrayList<>();
list2.add("_");
list2.add("_");
list2.add("_");
list2.add("_");
list2.add("_");
list2.add("_");
ArrayList<String> list3 = new ArrayList<>();
list3.add("_");
ArrayList<String> list4 = new ArrayList<>();
list4.add("_");

System.out.println("_ _ _ _ _ _\n\nHint: a tool\n");
System.out.println("Guess a letter (you have 5 lives): ");
int livesLeft =5;
String answer = null;
do{
answer = input.nextLine();




//while(livesLeft > 0){
if("a".equals(answer)){
        list2.set(1,"a"); 
        
    System.out.println("\nCorrect! Guess again: ");
  
}else if("h".equals(answer)){
        list2.set(0,"h");
        
        System.out.println("\nCorrect! Guess again: ");
}else if("m".equals(answer)){
        list2.set(2, "m");
        
        list2.set(3, answer);
        System.out.println("\nCorrect! Guess again: ");
}else if("e".equals(answer)){
        list2.set(4,answer);
        
        System.out.println("\nCorrect! Guess again: ");
}else if("r".equals(answer)){
        list2.set(5, answer);
        
        System.out.println("\nCorrect! Guess again: ");

}else if(list2.contains("hammer")){
    System.out.println("You've won!");
}
else{
    System.out.println("Sorry, guess again! ");
    livesLeft--;
}

 System.out.println(list2);
//}while(livesLeft > 0);
//}
}while(livesLeft >0);
if(livesLeft < 1){
    System.out.println("You've been hanged! Game over!");
}
}
}