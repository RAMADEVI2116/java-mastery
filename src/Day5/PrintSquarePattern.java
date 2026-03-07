package Day5;

public class PrintSquarePattern {
    public static void main(String[] args){
        int i = 1;
        int n = 5;
        for(i = 0; i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
