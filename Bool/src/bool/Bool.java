/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bool;
import java.util.Scanner;
/**
 *
 * @author John
 */
public class Bool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        
        int x;
        System.out.println("Type a number: ");
        x = user_input.nextInt();
        
        if(x<100 && x>20 || x == 19){
            System.out.println("You are in range");
        }else{
            System.out.println("You are not in range");
        }
    }
    
}
