package Day8;
import java.util.Scanner;
class Calculator{
    public int add(int n1, int n2){
        int r;
        return r=n1+n2;
    }
}
public class MethodToAddTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();
        Calculator cal = new Calculator();
        int result = cal.add(num1,num2);
        System.out.println("Addition of given two numbers is "+result);
    }
}
