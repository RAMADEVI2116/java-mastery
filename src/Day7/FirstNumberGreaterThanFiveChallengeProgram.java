package Day7;
import java.util.Scanner;
public class FirstNumberGreaterThanFiveChallengeProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int d,rev = 0;
        while(num>0){
            d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }
        //check each digit in rev and then find >5 in number
        while(rev>0){
            d = rev % 10;
            rev = rev / 10;
            if(d>5){
                System.out.println(d);
                break;
            }
        }
    }
}
