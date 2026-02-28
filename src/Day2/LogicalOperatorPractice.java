package Day2;
import java.util.Scanner;
public class LogicalOperatorPractice {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number : ");
       int num = sc.nextInt();
       if(num>10 && num<50)
           System.out.println("number is between 10 and 50");
       else
           System.out.println("not in between 10 and 50");
    }
}
