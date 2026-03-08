package Day8;
import java.util.Scanner;
class palindromeNum{
    public String palindrome(int n){
        int d,rev=0;
        int number = n;
        while(n>0){
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        if(number==rev)
            return "palindrome";
        else
            return "Not a palindrome";
    }
}
public class MethodToFindPalindromeNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        palindromeNum p = new palindromeNum();
        String result = p.palindrome(num);
        System.out.println(result);
    }
}
