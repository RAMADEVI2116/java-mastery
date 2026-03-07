package Day6;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int d = 0, sum = 0;
        int realnum = num;
        while (num > 0) {
            d = num % 10;
            sum = sum * 10 + d;
            num = num / 10;
        }
        if(sum==realnum)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome number");
    }
}
