package Day9;
import java.util.Scanner;
public class SecondLargestNumberInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Total no.of elements : ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        int lar,slar;
        if(nums[0]<nums[1]){
            lar = nums[1];
            slar = nums[0];
        }else{
            lar = nums[0];
            slar = nums[1];
        }
        for(int i=1;i<n;i++){
            if(lar<nums[i]) {
                slar = lar;
                lar = nums[i];
            }else if(nums[i]>slar && nums[i]!=lar){
                slar = nums[i];
            }
        }
        System.out.println("Second Largest value is  : "+slar);
    }
}
