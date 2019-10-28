
package everyotheralphabet;




public class EveryOtherAlphabet {

    public static void main(String[] args) {
       
     String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     String other = "";
     
     for(int i=0; i<alphabet.length(); i++){
         other += alphabet.substring(i,i+1);
         i++;
         
     }
     System.out.println(other);
    }
    
}
