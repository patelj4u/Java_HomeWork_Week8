/*1. Read 10 numbers from the console entered by the user and print the sum of
thosenumbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returnsfalse, print the message Invalid Number. Continue reading until you have read
10 numbers.
-Use the nextInt() method to get the number and add itto the sum.
-Before the user enters each number, print the message Enter number #x: where x representsthe
count, i.e. 1, 2, 3, 4, etc.
-For example,the first message printed to the user would be Enter number #1:,the next Enter number
#2:, and so on.
Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don't need it anymore.
-Create a class with the name ReadingUserInputChallenge.*/
import java.util.Scanner;

public class Prog1_ReadingUserInputChallenge {

    public static void main(String[] args) {
        int num = 0;
        float sum = 0;

        int count = 0;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number: ");
        while (count < 10) {
            int order = count+1;
            System.out.println("Enter number"+ order +": ");
            //num = sc.nextInt();
            boolean a = sc.hasNextInt();
            if (a) {
                int b= sc.nextInt();
                sum+=b;
                count++;
            }
            else {
                System.out.println("Enter number:");
            }
            sc.nextLine();

        }
        System.out.println("Sum of those number is: " + sum + "\n");
        sc.close();
            }

        }


