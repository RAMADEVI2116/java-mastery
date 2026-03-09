package Day9;
import java.util.Scanner;
public class PrintArrayInReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("total no.of elements : ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter "+n+" elements : ");
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println("Elements in array : ");
        System.out.print("{");
        for(int i=0;i<n;i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.print("}");
        System.out.println();
        System.out.println("Array elements in reverse : ");
        for(int i=n;i>0;i--){
            System.out.print(nums[i-1]+" ");
        }
    }
}
