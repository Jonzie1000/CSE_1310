package arrayoperator;


import java.util.Scanner;

public class ArrayOperator {

public static void main(String[] args) {

Scanner user_input = new Scanner(System.in);

double[] myArray = new double[9];

System.out.println("Please enter a number: ");

double answer1 = user_input.nextDouble();               

System.out.println("Please enter a number: ");        

double answer2 = user_input.nextDouble();               

System.out.println("Please enter a number: ");        

double answer3 = user_input.nextDouble();               

System.out.println("Please enter a number: ");        

double answer4 = user_input.nextDouble();               

System.out.println("Please enter a number: ");        

double answer5 = user_input.nextDouble();               

System.out.println("Please enter a number: ");        

double answer6 = user_input.nextDouble();               

System.out.println("Please enter a number: ");        

double answer7 = user_input.nextDouble();               

System.out.println("Please enter a number: ");        

double answer8 = user_input.nextDouble();               

System.out.println("Please enter a number: ");        

double answer9 = user_input.nextDouble();


double answer11 = answer1 - answer2 + answer3 - answer4 + answer5 - answer6 + answer7 - answer8 + answer9;


System.out.printf("%s - %s + %s - %s + %s - %s + %s - %s + %s = %s",answer1, answer2, answer3, answer4,answer5,answer6,answer7,answer8,answer9,answer11);

}
}

