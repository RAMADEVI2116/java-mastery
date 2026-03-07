package Day4;

public class SumOfFirstTenNumbers {
    public static void main(String[] args){
        int i = 1;
        int j = 0;
        while(i<=10){
            j= j + i;
            i++;
        }
        System.out.println("Sum of first ten numbers : "+j);
    }
}
