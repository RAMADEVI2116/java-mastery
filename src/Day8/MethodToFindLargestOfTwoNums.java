package Day8;
import java.util.Scanner;
class Largest{
    public int LargestOfTwo(int n1, int n2){
        if(n1>n2){
            return n1;
        }else{
            return n2;
        }
    }
}
public class MethodToFindLargestOfTwoNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();
        Largest lar = new Largest();
        int result = lar.LargestOfTwo(num1,num2);
        System.out.println("Largest of two numbers is "+result);
    }
}
