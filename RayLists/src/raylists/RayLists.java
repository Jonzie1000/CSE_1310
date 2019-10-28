/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raylists;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author John
 */
public class RayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter first set of numbers (separated by spaces): ");
        
        ArrayList<Integer> input1;
        input1 = new ArrayList<>();
        
        ArrayList<Integer> input2;
        input2 = new ArrayList<>();
        
        
        
        String values = input.nextLine();
        String[] num1 = values.split(" ");
        for(String num : num1){
            input1.add(Integer.parseInt(num));
        }
        System.out.println("Please enter second set of numbers (separated by spaces): ");
        
        String values1 = input.nextLine();
        String[] num2 = values1.split(" ");
        for(String numb : num2){
            input2.add(Integer.parseInt(numb));
        }
        
        
        System.out.printf("The first series of numbers were: %s \n", input1);
        System.out.printf("The second series of numbers were: %s \n",input2);
        
        Combine(input1,input2);
        Sort(input1,input2);
    }
    public static void Combine(ArrayList<Integer> a, ArrayList<Integer> b){
       ArrayList<Integer> merged;
        merged = new ArrayList<>();
        
        for(int i=0; i<a.size() && i<b.size(); i++){
            if(i < a.size()) merged.add(a.get(i));
            if(i < b.size()) merged.add(b.get(i));
          
        }
       System.out.printf("Both series of numbers combined are: %s \n",merged);
    }
       public static void Sort(ArrayList<Integer> a, ArrayList<Integer> b){
           ArrayList<Integer> merger;
           merger = new ArrayList<>();
           
           ArrayList<Integer> sorted;
           sorted = new ArrayList<>();
           
           for(int i=0; i<a.size() && i<b.size(); i++){
               if(i<a.size()) merger.add(a.get(i));
               if(i<b.size()) merger.add(b.get(i));
               
           }
        //  System.out.println(merger);
           
        for (int i =0; i<merger.size();) {
            int smallest_index =0;
            
            for(int j=1; j<merger.size(); j++){
                if(merger.get(smallest_index) > merger.get(j)){
                    smallest_index = j;
                }

            }
            sorted.add(merger.get(smallest_index));
            merger.remove((smallest_index));
            
        }
       
       System.out.printf("Both series combined and sorted are: %s \n",sorted);
       }
    }

    

