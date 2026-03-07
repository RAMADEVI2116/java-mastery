package Day5;

public class RowNumberPattern {
    public static void main(String[] args){
        int n=0;
        for(int i=0;i<=3;i++){
            n++;
            for(int j=0;j<=3;j++){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
