/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author John
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        
        
        
        String name;
        System.out.println("Type a name: ");
        name = user_input.next();
        
      
        int char_count;
        char_count = name.length();
        
        System.out.printf("%s \n",char_count);
        
    }
    
}
