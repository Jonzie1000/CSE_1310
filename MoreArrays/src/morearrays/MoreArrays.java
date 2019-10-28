package morearrays;

import java.util.Scanner;
import java.util.Arrays;


public class MoreArrays {


    
     public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        
     System.out.println("Enter numbers (separated by spaces): ");

     String input = user_input.nextLine();	

     String[] numbers;   
        numbers = input.split(" ");
        
     int[] numArray;
        numArray = new int[numbers.length];
        
     for(int i=0; i<numbers.length; i++){
     numArray[i] = Integer.parseInt(numbers[i]);
        } 
        int[] num2 = Arrays.copyOf(numArray,numArray.length);
        int[] num3;
         num3 = Arrays.copyOf(numArray,numArray.length);
         int[] num4;
         num4 = Arrays.copyOf(numArray,numArray.length);
        int[] num5;
         num5 = Arrays.copyOf(numArray,numArray.length);
         int[] num6;
         num6 = Arrays.copyOf(numArray,numArray.length);
          int[] num7;
         num7 = Arrays.copyOf(numArray,numArray.length);
         int[] num8;
         num8 = Arrays.copyOf(numArray,numArray.length);
         int[] num9;
         num9 = Arrays.copyOf(numArray,numArray.length);
         int[] num10;
         num10 = Arrays.copyOf(numArray,numArray.length);
          int[] num11;
         num11 = Arrays.copyOf(numArray,numArray.length);
              
       swap(num2,0,num2.length-1);
       shiftRight(num3,0,num3.length-1);
       onlyEven(num4);
       GreaterThan(num5);
       removeMiddle(num6);
       moveEven(num7);
       ReturnSecondLargest(num8);
       SortedIncreasing(num9);
       if(SortedIncreasing(num9) == true){
         System.out.println("The array is currently sorted in increasing order.");
     }else{System.out.println("The array is currently NOT sorted in increasing order.");
       }
       AdjDup(num10);
       if(AdjDup(num10) == true){
         System.out.println("The array contains two adjacent duplicate elements.");
     }else{System.out.println("The array does NOT contain two adjacent duplicate elements.");
       }
        AdjAny(num11);
        if(AdjAny(num11) == true){
         System.out.println("The array contains duplicate elements.");
     }else{System.out.println("The array does NOT contain duplicate elements.");
       }
       
}
        public static void swap(int[]a,int i,int j)
{
    int temp;
    temp = a[0];
    a[0]=a[a.length-1];
    a[a.length-1]=temp;
    System.out.printf("First and last elements swapped: %s \n",Arrays.toString(a));
    
 }
        public static void shiftRight(int[]a,int h, int j){
             int swap;
             swap = a[a.length-1];
             
             for(int i = a.length-2; i>=0; i--){
                a[i+1]=a[i];     
            }
            a[0] = swap;
            System.out.printf("Elements shifted by one to the right: %s \n",Arrays.toString(a));
        }   
         public static void onlyEven(int[]a){
             for(int i=0;i<a.length-1;i++){
                 if(a[i] %2 == 0){
                     a[i] = 0;
                 }
             }
             System.out.printf("Even elements relaced with zero: %s \n",Arrays.toString(a));
         }
         public static void GreaterThan(int[]a){
             for(int i=1;i<a.length-1;i++){
                 if(a[i] < a[i+1]){
                     a[i] = a[i+1];
                 }else if(a[i] > a[i-1]){
                     a[i] = a[i-1];
                 }
                 
             }
             System.out.printf("Each element replaced by the largest neighbors: %s \n",Arrays.toString(a));
         }
           public static void removeMiddle(int[]a){
               int mid = a.length/2;   
               if(a.length %2 == 0){
                   for(int i = mid; i<a.length-1; i++){
                       a[i-1]=a[i+1];
                   }
                   int[] ab;
                   ab = Arrays.copyOf(a, a.length-2);
             System.out.printf("Middle element(s) removed: %s \n",Arrays.toString(ab));
            }               
               else if(a.length %2 == 1){
               for(int i = mid; i<a.length-1; i++){
                   a[i]=a[i+1];
               }
                   int[] ab;
                   ab = Arrays.copyOf(a, a.length-1);
                   System.out.printf("Middle element(s) removed: %s \n",Arrays.toString(ab));
               
           }
             
         }
            public static void moveEven(int[]a){
                int endofEvens = 0;
                int temp;
                for(int i=0; i <a.length; i++){
                    if(a[i] %2 == 0){
                        temp = a[i];
                        for(int j = i; j > endofEvens; j--){
                            a[j] = a[j-1];               
                        }
                       a[endofEvens] = temp;
                       endofEvens++;
                    }
                }
                System.out.printf("All even elements to the front: %s \n",Arrays.toString(a));
            }
            public static void ReturnSecondLargest(int[]a){
                int largest = Integer.MIN_VALUE;
                int seclargest = Integer.MIN_VALUE;
                for(int i = 0; i<a.length; i++){
                    if(a[i] > largest && a[i] != seclargest){
                        seclargest = largest;
                        largest = a[i];
                    }else if(a[i] > seclargest && a[i] != largest){
                        seclargest = a[i];
                    }
                }    
                    System.out.printf("The second largest element is: %s \n",seclargest);
                    }
  
        public static boolean SortedIncreasing(int[]a){
            for(int i=0; i<a.length-1; i++){
                if (a[i]> a[i+1]){          
                     return false;
                }
                }              
                return true;
                }
        
        public static boolean AdjDup(int[]a){
            for(int i=0; i<a.length-1; i++){
                if(a[i] == a[i+1]){
                    return true;
                }else if(a[a.length-1] == a[a.length-2]){
                    return true;
                }
               
            }    
            return false;
        }
       public static boolean AdjAny(int[]a){
           for(int i=0; i<a.length; i++){
               for(int j=0; j<a.length; j++){
                   if(i != j && a[i] == a[j]){
                       return true;
                   }
               }
           }
           return false;
       }
}

          

         

           
        
        
  
