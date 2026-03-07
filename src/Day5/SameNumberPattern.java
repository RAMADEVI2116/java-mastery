package Day5;

public class SameNumberPattern {
    public static void main(String[] args){
        int n=0;
        for(int i=1;i<=5;i++){
            n++;
            for(int j =1;j<=n;j++){
                System.out.print(n);
                //n++;
            }
            System.out.println();
        }
    }
}
