package hangman;

import java.util.Scanner;
import java.util.ArrayList;

public class Hangman{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

ArrayList<String> list = new ArrayList<>();
list.add("hammer");
//list.add("neptune");
//list.add("unicorn");

ArrayList<String> list2 = new ArrayList<>();
list2.add("_ _ _ _ _ _");
ArrayList<String> list3 = new ArrayList<>();
list3.add("_");
ArrayList<String> list4 = new ArrayList<>();
list4.add("_");

System.out.println("_ _ _ _ _ _\n\nHint: a tool\n");
System.out.println("Guess a letter (you have 5 lives): ");
String answer = input.nextLine();

if("a".equals(answer)){
   // for(int i=0; i<list.size(); i++){
      //  for(int j =0; j<list.size(); j++){
        //   if(j == 'a'){
                list2.set(2,"a");
                
           // }
      //  }
  //  }
    
    
    System.out.println("\nCorrect! Guess again: ");
}else{
    System.out.println("Sorry, guess again! ");
}
System.out.println(list2.get(0));
}
}