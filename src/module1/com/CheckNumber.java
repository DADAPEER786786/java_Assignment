package module1.com;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(num+" is Positive number");
        } else if (num < 0) {
            System.out.println(num+" is Negative number");
        } else {
            System.out.println(num+" is Zero");
        }
    }
}