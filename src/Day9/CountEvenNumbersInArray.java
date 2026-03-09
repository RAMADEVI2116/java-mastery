package Day9;
import java.util.Scanner;
public class CountEvenNumbersInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Total no.of elements : ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        int count = 0;
        System.out.print("Enter "+n+" Elements : ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
            if(nums[i]%2==0)
                count = count + 1;
        }
        System.out.println("Count of even numbers : "+count);
    }
}
