package Day2;

public class Day2 {
    public static void main(String[] args){
        //relational operators
        // <,>,<=,>=,==,!=
        /*int a = 10;
        int b = 27;
        int c = 27;
        boolean d = c <= a;
        System.out.println(d);
         */
        //logical operators
        //&&, ||, !
        /*int a = 10;
        int b = 28;
        double x = 23.56;
        double u = 67.79;
        boolean d = b!=a;
        System.out.println(d);
         */
        //ifelse
        /*
        int a = 19;
        double c = 324;
        int d = 12;
        if(a<c && a<d)
            System.out.println(a);
        else if(c<a && c<d)
            System.out.println(c);
        else
            System.out.println(d);
         */
        /*int a = 10;
        double c = 324;
        int d = 12;
        if(a<c && a<d)
            System.out.println(a);
        else if(c<d)
            System.out.println(c);
        else
            System.out.println(d);
         */
        //iternary operator
        int c = 12;
        String res = c%2==0?"even":"odd";
        System.out.println(res);
        //switch statement
        /*int n = 3;
        switch(n){
            case 1 : System.out.println("hi 1");
            break;
            case 2 : System.out.println("hi 2");
            break;
            case 3 : System.out.println("hi 3");
            break;
            default : System.out.println("no valid number");
        }
         */
        /*String n = "sat";
        switch(n) {
            case "mon":
                System.out.println("hi mon");
                break;
            case "tue":
                System.out.println("hi tue");
                break;
            case "wed":
                System.out.println("hi wed");
                break;
            default:
                System.out.println("no valid day");
        }
         */
        /*String n = "tue";
        String result;
        result = switch(n) {
            case "mon" -> "hi mon";
            case "tue" -> "hi tue";
            case "wed" -> "hi wed";
            default -> "no valid day";
        };
        System.out.println(result);
         */
        String n = "tue";
        String result;
        result = switch(n) {
            case "mon" : yield "hi mon";
            case "tue" : yield "hi tue";
            case "wed" : yield "hi wed";
            default : yield "no valid day";
        };
        System.out.println(result);
    }
}
