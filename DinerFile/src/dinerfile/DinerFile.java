package dinerfile;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;



public class DinerFile{
    
public static void main (String[] args) throws FileNotFoundException{
    Scanner input = new Scanner(System.in);
    try{
    System.out.println("Please enter name of file: ");
    String answer = input.nextLine();
    File open = new File(answer);
    Scanner read = new Scanner(open);
    
    int dinnerAmount = 0;
    int conferenceAmount = 0;
    int lodgingAmount = 0;
    
    while(read.hasNextLine()){
        String input1 = read.nextLine();
        String[] info = input1.split(";");
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> place = new ArrayList<>();
        ArrayList<String> amount = new ArrayList<>();
        ArrayList<String> date = new ArrayList<>();
        names.add(info[0]);
        place.add(info[1]);
        amount.add(info[2]);
        date.add(info[3]);
        
      //  System.out.println(names);
      //  System.out.println(place);
      //  System.out.println(amount);
      //  System.out.println(date);
        
        for(int i=0; i<place.size(); i++){
            if("dinner".equals(place.get(i).toLowerCase())){
                dinnerAmount =  dinnerAmount + Integer.parseInt(amount.get(i));
            }else if("conference".equals(place.get(i).toLowerCase())){
                conferenceAmount = conferenceAmount + Integer.parseInt(amount.get(i));
            }else if("lodging".equals(place.get(i).toLowerCase())){
                lodgingAmount = lodgingAmount + Integer.parseInt(amount.get(i));
            }
        
    }
            
        }
        System.out.printf("$%s total spent at Dinner. \n",dinnerAmount);
        System.out.printf("$%s total spent at Conference. \n",conferenceAmount);
        System.out.printf("$%s total spent at Lodging. \n",lodgingAmount);
    }
     catch(FileNotFoundException c){
            System.out.println("There is no file by this name.");
            }
    }
    
    
    
}
