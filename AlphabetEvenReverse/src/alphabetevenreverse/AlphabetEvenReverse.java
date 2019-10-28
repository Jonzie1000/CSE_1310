
package alphabetevenreverse;

import java.util.Arrays;


public class AlphabetEvenReverse {


    
    public static void main(String[] args) {
        
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String other = " ";
        String result = " ";
        
        
        for(int i=0; i<alphabet.length(); i++){
            other += alphabet.substring(i,i+1);
                 i++;   
                }
        System.out.print(other);
        
        for(int i=other.length()-1; i>=0; i--){
            result = result + other.charAt(i);
        }
                
        
        System.out.print(result);
    //  for(int i=0; i<other.length(); i++){
          
    //  }
            }
        }
           
        
    
    

