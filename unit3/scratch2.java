/*
 * A Program Code to calculate an area of rectangle.
 * Developer Name : Waruna Saowapark
 * Written Date : 13 August 2022
 */
import java.util.Scanner;

class Lab1{
    public static void main(String args[] ){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Base : ");
        int base = input.nextInt();
        System.out.print("Enter Height : ");
        int height = input.nextInt();

        System.out.println(base * height);
    }
}
