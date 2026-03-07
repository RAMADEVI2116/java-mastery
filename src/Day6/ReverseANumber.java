package Day6;
import java.util.Scanner;
public class ReverseANumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int d = 0, sum = 0;
        while(num>0){
            d = num % 10;
            sum = sum * 10 + d;
            num = num / 10;
        }
        System.out.println("Reverse number is  : "+sum);
    }
}
