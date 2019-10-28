package helloworld;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class HelloWorld{
    
public static void main(String[] args) throws FileNotFoundException{
    PrintWriter write = new PrintWriter("hello.txt");
    
    write.println("Hello, World!");
    write.close();
    File name = new File("hello.txt");
    Scanner read = new Scanner(name);
    
    while(read.hasNextLine()){
        
        String letter = read.nextLine();
        System.out.println(letter);
        
    }
   read.close();
}
}