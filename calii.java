import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int ans=0;
        while(true) {
            System.out.println("enter the oprator");
            char op=in.next().trim().charAt(0);
            if (op == '+' || op == '*' || op == '-' || op == '%' || op = '/') {
                System.out.println("Ebter two no:");
                int a = in.nextInt();
                int b = in.nextInt();
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '*') {
                    ans = a * b;
                }

                if (op == '%') {
                    ans = a % b;
                }


                if (op == '-') {
                    ans = a - b;
                }

                if (op == '/') {
                    if (b!=0){
                        ans = a / b;

                    }

                    }
                else if (op='x'||op='X') {
                    break;

                }
                else{
                    System.out.println("not vali d input");

                }
                System.out.println(ans);


            }

        }

    }
}