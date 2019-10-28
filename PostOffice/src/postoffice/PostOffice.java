package postoffice;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class PostOffice{
    
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter file name: ");
    
    try{
    String filename = input.nextLine();
    send(filename, "PersonC");
    }
    catch(FileNotFoundException c){
        System.out.println("There is something wrong with the file.");
    }
}
public static void send(String fname, String name) throws FileNotFoundException{
    routeToRecipient(fname);
}
public static void routeToRecipient(String sender) throws FileNotFoundException{
    File inFile = new File(sender);
    Scanner input = new Scanner(inFile);
    
    while(input.hasNextLine()){
    String letter = input.nextLine();
    System.out.println(letter);
    }
}
}