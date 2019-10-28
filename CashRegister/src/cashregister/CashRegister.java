package cashregister;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CashRegister{
    
public static void main(System[] args) throws FileNotFoundException{
    
    Scanner input = new Scanner(System.in);

System.out.println("Please enter starting register amount: ");
            int start = input.nextInt();
System.out.println("Please enter ending register amount: ");
            int end = input.nextInt();
System.out.println("Please enter name of file: ");
            Scanner read = null;
try{
            read = new Scanner(input.nextLine());
}

catch(FileNotFoundException e){
    System.out.println("This file does not exist.");
}

        ArrayList<Integer> invoice = new ArrayList<>();
        ArrayList<Integer> amount = new ArrayList<>();
        ArrayList<String> PorR = new ArrayList<>();    

    while(read.hasNextLine()){
        String input1 = read.nextLine();
        String[] info = input1.split("  ");
    }
    
    System.out.println(invoice);
    System.out.println(amount);
    System.out.println(PorR);
}    
}