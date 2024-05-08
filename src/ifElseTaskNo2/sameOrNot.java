package ifElseTaskNo2;

import java.util.Scanner;

public class sameOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first integer number: ");
        int a = scanner.nextInt();

        System.out.println("Insert the second integer number: ");
        int b = scanner.nextInt();

        if (a == b){
            System.out.println("Numbers are the same ");
        }else {
            System.out.println("Numbers are NOT the same..");
        }
    }
}
