/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Practice1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
       Scanner console; 
        console = new Scanner(System.in);
        System.out.print("Read from file name: "); 
        String filenameRead = console.next(); 
        console.close(); 
 
        int charactersCount = countCharacters(filenameRead); 
        int wordsCount = countWords(filenameRead); 
        int linesCount = countLines(filenameRead); 
 
        System.out.println("Number of characters: " + charactersCount); 
        System.out.println("Number of words: " + wordsCount); 
        System.out.println("Number of lines: " + linesCount); 
    } 

     public static int countCharacters(String filenameRead) throws FileNotFoundException { 
        Scanner fileRead; 
        fileRead = new Scanner(new File(filenameRead));
        int charactersCount = 0; 
        while (fileRead.hasNextLine()) { 
            String line = fileRead.nextLine(); 
            charactersCount += line.trim().length(); 
        } 
        fileRead.close(); 
        return charactersCount; 
    } 
 
    public static int countLines(String filenameRead) throws FileNotFoundException { 
        Scanner fileRead; 
        fileRead = new Scanner(new File(filenameRead));
        int linesCount = 0; 
        while (fileRead.hasNextLine()) { 
            String line = fileRead.nextLine(); 
            linesCount += 1; 
        } 
        fileRead.close(); 
        return linesCount; 
    } 
 
    public static int countWords(String filenameRead) throws FileNotFoundException { 
        Scanner fileRead; 
        fileRead = new Scanner(new File(filenameRead));
        int wordsCount = 0; 
        while (fileRead.hasNext()) { 
            String word = fileRead.next(); 
            wordsCount += 1; 
        } 
        fileRead.close(); 
        return wordsCount; 
    } 

}
