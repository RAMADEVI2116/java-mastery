package Day8;
import java.util.Scanner;
class root{
    public int square(int n){
        return  n * n;
    }
}
public class MethodToFindSquareOfANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        root r = new root();
        int squ = r.square(num);
        System.out.println("square of the number is "+squ);
    }
}
