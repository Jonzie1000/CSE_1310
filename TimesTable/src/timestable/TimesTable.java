/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timestable;

/**
 *
 * @author John
 */
public class TimesTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i =0; i<13; i++){
            for(int j=1;j<13;j++){
                System.out.println(i+"x"+j+"="+i*j);
            }
        }
  
    }


}