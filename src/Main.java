/*
Question : Write a program to find the cube of given number.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,sum,temp,temp2 = 0;
        System.out.println("Enter the number for finding the cube :");
        a = sc.nextInt();
        System.out.println("Firstly, printing the cubes of given number :");
        for (int i = 1; i < a; i++){
            sum = i * i;
            temp = sum * i;
            System.out.print(temp + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Finally, printing the sum of cube of given number :");
        for (int i = 1; i <= a; i++){
            sum = i * i;
            temp = sum * i;
            temp2 += temp;
        }
        System.out.println(temp2);
    }
}