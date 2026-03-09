package Day9;
import java.util.Scanner;
public class FindSmallestElementInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you need to store : ");
        int n = sc.nextInt();
        int sml =0;
        int nums[] = new int[n];
        System.out.print("Enter "+n+" elements :");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int i = 1;
        sml = nums[0];
        while(i<n){
            if (sml > nums[i])
                sml = nums[i];
            i++;
        }
        System.out.println("Smallest Element in array is : "+sml);
    }
}
