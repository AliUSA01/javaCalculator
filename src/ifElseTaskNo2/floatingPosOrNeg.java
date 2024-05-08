package ifElseTaskNo2;

import java.util.Scanner;



public class floatingPosOrNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number: ");
        float a = sc.nextFloat();

        if (a == 0) {
            System.out.println(a + (" is Zero.."));
        } else if (a > 0) {
            System.out.println(a + " is a positive number..");
        } else {
            System.out.println(a + " is a negative number.. ");
        }


    }
}
