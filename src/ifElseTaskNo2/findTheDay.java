package ifElseTaskNo2;

import java.util.Scanner;

public class findTheDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the number of the day..");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("Today is Monday, Have a lovely day..");
                break;

            case 2:
                System.out.println("Today is Tuesday, Do not forget to take your umbrella with you..");
                break;
            case 3:
                System.out.println("It is Wednesday, Day will be full of lightnings and heavy rain..");
                break;
            case 4:
                System.out.println("It is Thursday, in the morning roads will be full of fog. Drive safe..");
                break;
            case 5:
                System.out.println("It is Friday, It will be partly cloudy..");
                break;
            case 6:
                System.out.println("It is Saturday,  Have a good weekend..");
                break;

            case 7:
                System.out.println("It is Sunday, Do not drink that much, tomorrow is workday..");
                break;
            default:
                System.out.println("Insert correct number of day!!");
        }


    }
}
