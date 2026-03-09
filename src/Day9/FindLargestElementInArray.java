package Day9;
import java.util.Scanner;
public class FindLargestElementInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];
        int lar = 0;
        for(int i=0;i<5;i++){
            System.out.print("Element "+i+" is : ");
            nums[i] = sc.nextInt();
            if(lar<nums[i])
                lar = nums[i];
        }
        System.out.println("largest value is : "+lar);
    }
}
