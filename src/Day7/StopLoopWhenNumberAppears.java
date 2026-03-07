package Day7;

public class StopLoopWhenNumberAppears {
    public static void main(String[] args){
        int num = 10, i = 1;
        while(i<=10){
            if(i==7)
                break;
            System.out.println(i);
            i++;
        }
    }
}
