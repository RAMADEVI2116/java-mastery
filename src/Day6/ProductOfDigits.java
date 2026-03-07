package Day6;
import java.util.Scanner;
public class ProductOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int d = 0, sum = 1;
        while(num>0){
            d = num % 10;
            sum = sum * d;
            num = num / 10;
        }
        System.out.println("Product of digits in number : "+sum);
    }
}
