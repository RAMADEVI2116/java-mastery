package Day2;
import java.util.Scanner;
public class GreatestOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int n2 = sc.nextInt();
        if(n1>n2) {
            System.out.println("1st number is greater than 2nd number");
            System.out.println(n1 + " is greater than " + n2);
        }
        else {
            System.out.println("2nd number is greater than 1st number");
            System.out.println(n2 + " is greater than " + n1);
        }
    }
}
