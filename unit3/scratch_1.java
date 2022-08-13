/*
 * A Program Code needs to accept a value from the user
 * to determine a positive, negative, or zero value and display a result.
 * Developer Name : Waruna Saowapark
 * Written Date : 13 August 2022
 */
import java.util.Scanner;

class Lab1{
    public static void main(String args[] ){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if(n == 0){
            System.out.println("Zero");
        }
        else if(n > 0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}
