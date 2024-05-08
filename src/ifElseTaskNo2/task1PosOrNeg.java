package ifElseTaskNo2;

import java.util.Scanner;

public class task1PosOrNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number: ");
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println(a + " is a positive number..");
        } else if (a < 0) {
            System.out.println(a + " is a negative number.. ");

        } else {
            System.out.println(a + " is neither positive or negative..");
        }
    }
}
