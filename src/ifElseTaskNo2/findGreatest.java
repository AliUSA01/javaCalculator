package ifElseTaskNo2;

import java.util.Scanner;

public class findGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int a = sc.nextInt();

        System.out.println("Input the second one: ");
        int b = sc.nextInt();

        System.out.println("Input the third one: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is the greatest number among the numbers");

        } else if (b > c) {
            System.out.println(b + " is the greatest number among the numbers");

        }else{
            System.out.println(c + " is the greatest number among the numbers");
        }

    }
}
