package Day8;
import java.util.Scanner;
class reverseNumber{
    public int revNum(int n){
        int d, rev = 0;
        while(n>0){
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        return rev;
    }
}
public class MethodToReverseANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        reverseNumber r = new reverseNumber();
        int rev = r.revNum(num);
        System.out.println("reverse number is "+rev);
    }
}
