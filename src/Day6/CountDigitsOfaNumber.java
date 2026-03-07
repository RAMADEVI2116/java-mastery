package Day6;
import java.util.Scanner;
public class CountDigitsOfaNumber {
    public static void main(String[] args){
        //count digits of a number
        //for ex: 34687 = 5
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int num = sc.nextInt();
        int i = 1, sum = 0, d = 0;
        while(num>0){
            d = num % 10;
            sum = sum + 1 ;
            num = num / 10;
        }
        System.out.println("Count of digits of number : "+sum);
    }
}
