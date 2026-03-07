package Day6;
import java.util.Scanner;
public class LargestDigitInNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int d = 0;
        int lar = 0;
        while(num>0){
            d = num % 10;
            if(d>lar){
                lar = d;
            }else{
                lar = lar;
            }
            num = num / 10;
        }
        System.out.println("Largest digit in number : "+lar);
    }
}
