import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner  = new Scanner(System.in);
        System.out.println("This is a calculator program.. \nBefore choosing the operator: ");
        System.out.println("Please input the number A that you want to make the operation: ");
        int a = scanner.nextInt();
        System.out.println("Please input the number B that you want to make the operation: ");
        int b = scanner.nextInt();
        System.out.println("1-addition\n2-subtraction\n3-division\n4-multiplication\n5-remainder");
        int operation = scanner.nextInt();

        if(operation==1){
            Math.addition(a,b);
        } else if (operation==2) {
            Math.subtraction(a,b);
        } else if (operation==3) {
            Math.division(a,b);
        } else if (operation==4) {
            Math.multiplication(a,b);
        }else if (operation==5){
            Math.remainder(a,b);
        }else{
            System.out.println("Wrong operation number please make sure that you're choosing the right one..");
        }


    }
}

