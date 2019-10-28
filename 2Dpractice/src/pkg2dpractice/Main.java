
package pkg2dpractice;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] seats = 
        {
        {10,10,10,10,10,10,10,10,10,10},
        {10,10,10,10,10,10,10,10,10,10},
        {10,10,10,10,10,10,10,10,10,10},
        {10,10,20,20,20,20,20,20,10,10},
        {10,10,20,20,20,20,20,20,10,10},
        {20,20,30,30,40,40,30,30,20,20},
        {20,30,30,40,50,50,40,30,30,20},
        {30,40,50,50,50,50,50,50,40,30}
        };
      
    System.out.println("Pick a row: ");
    int answer = input.nextInt();
    System.out.println("Pick a column: ");
    int answer1 = input.nextInt();
    
        for (int[] seat : seats) {
            for (int j = 0; j < seat.length; j++) {
                seats[answer][answer1] = 0;                   //need to convert int to string//
            }
        }
      
        System.out.println(Arrays.deepToString(seats));
    } 
    }
    
    
