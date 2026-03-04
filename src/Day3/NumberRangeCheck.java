package Day3;
import java.util.Scanner;
public class NumberRangeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        if((number>10) && (number<100))
            System.out.println("number is in between 10 and 100");
        else
            System.out.println("number is not in between 10 and 100");
    }
}
