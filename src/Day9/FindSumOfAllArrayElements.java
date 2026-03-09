package Day9;
import java.util.Scanner;
public class FindSumOfAllArrayElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];
        int sum = 0;
        for(int i=0;i<5;i++) {
            System.out.print("element "+i+" is : ");
            nums[i] = sc.nextInt();
            sum = sum + nums[i];
        }
        System.out.println("Sum of all elements in array : "+sum);
    }
}
