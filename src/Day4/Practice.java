package Day4;

public class Practice {
    public static void main(String[] args){
        //while loop
        /*int i = 1;
        while(i<=7){
           System.out.println("day "+i);
           i++;
        }
         */
        //do while loop
        /*int i = 9;
        do{
            System.out.println("welcome");
            i++;
        }while(i<=7);
         */
        //for loop
        for(int i=1;i<=7;i++){
            System.out.println("day - "+i);
            for(int j=1;j<=3;j++){
                System.out.println("task - "+j);
            }
        }
    }
}
