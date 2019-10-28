/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author John
 */
public class InFile {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        File inFile = new File("Shape of You Lyrics.txt");   
        Scanner input;
        input = new Scanner(inFile);
         
        String[] original = new String[200];
        
        int i=0;
        while(input.hasNextLine()){
          original[i] = input.nextLine();
          original[i] = original[i].toUpperCase();
            i++;
        }
        original = Arrays.copyOf(original,i);
        input.close();
        PrintWriter write;
        write = new PrintWriter("Shape of You Lyrics.txt");
        
        for(String data : original){
            write.println(data);
        }
        write.close();
    }
    
}
