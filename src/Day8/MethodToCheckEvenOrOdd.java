package Day8;
import java.util.Scanner;
class CheckOddOrEven{
    public String OddOrEven(int num){
        if(num%2==0){
            return "even number";
        }
        else{
            return "odd number";
        }
    }
}
public class MethodToCheckEvenOrOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check even or odd : ");
        int num = sc.nextInt();
        CheckOddOrEven oe = new CheckOddOrEven();
        String result = oe.OddOrEven(num);
        System.out.println(result);
    }
}
