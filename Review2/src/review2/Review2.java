package review2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Review2 {
    
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
       
   ArrayList<Double> amount;
    amount = new ArrayList<>();
    
   ArrayList<String> names;
    names = new ArrayList<>();
   
       System.out.println("Please enter all prices: ");
       String values = input.nextLine();
       String[] prices = values.split(" ");
       for(String num : prices){
           amount.add(Double.parseDouble(num));
       }
       System.out.println("Please enter all of the customers first names: ");
       String first_names = input.nextLine();
       String[] first = first_names.split(" ");
       names.addAll(Arrays.asList(first));

      // System.out.println(amount);
     //  System.out.println(names);
   
   String winner = names.get(FindLargest(amount));
   System.out.println(winner);
}
public static int FindLargest(ArrayList<Double> a){
    double max = a.get(0);
    int position = 0;
    for(int i=1; i<a.size(); i++){
        if(a.get(i) > max){
            max = a.get(i);
            position = i;
        }
    }
    return position;
}

}

    
