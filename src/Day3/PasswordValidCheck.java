package Day3;
import java.util.Scanner;
public class PasswordValidCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password : ");
        String password = sc.nextLine();
        if(password.length()>=8)
            System.out.println("password is valid");
        else
            System.out.println("password is invalid");
    }
}
