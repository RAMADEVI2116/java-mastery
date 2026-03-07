package Day6;
import java.util.Scanner;
public class SumOfDigitsInANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0, d = 0;
        while(num>0){
            d = num % 10;
            sum = sum + d;
            num = num / 10;
        }
        System.out.println("Sum of digits in a number : "+sum);
    }
}
