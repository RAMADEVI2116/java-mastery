package Day7;

public class StopWhenSumExceedsFifty {
    public static void main(String[] args){
        int num = 50, i = 1, sum = 0;
        while(i<=50){
            sum = sum +i;
            if(sum>50)
                break;
            i++;
        }
        System.out.println("value of sum : " + sum);
    }
}
