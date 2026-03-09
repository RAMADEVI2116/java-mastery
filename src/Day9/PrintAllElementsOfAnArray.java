package Day9;
import java.util.Scanner;
public class PrintAllElementsOfAnArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter "+i+" element : ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("Elements are : ");
        System.out.print("{");
        for(int i=0;i<5;i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.print("}");
    }
}
