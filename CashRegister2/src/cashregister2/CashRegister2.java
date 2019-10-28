package cashregister2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CashRegister2{
    
public static void main(String[] args) throws FileNotFoundException {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter starting register amount: ");
            double start = input.nextDouble();
    System.out.println("Please enter ending register amount: ");
            double end = input.nextDouble();
            
            Scanner input2 = new Scanner(System.in);
    System.out.println("Please enter name of file: ");
    String name=input2.nextLine();
    File userChoice = new File(name);
    Scanner read =null;
    try{
        read = new Scanner(userChoice);
       
        }
    catch(FileNotFoundException e){
    System.out.println("This file does not exist.");
}

        ArrayList<Integer> invoice = new ArrayList<>();
        ArrayList<Double> amount = new ArrayList<>();
        ArrayList<String> PorR = new ArrayList<>();    

    while(read.hasNextLine()){
        String input1 = read.nextLine();
        String[] info;
        info = input1.split("\t");
           invoice.add(Integer.parseInt(info[0]));
           amount.add(Double.parseDouble(info[1]));
           PorR.add(info[2]);
                
            }
    System.out.println(invoice);
    System.out.println(amount);
    System.out.println(PorR);
    }
    
   
}    
