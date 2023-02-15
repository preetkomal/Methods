import java.util.Scanner;

public class MethodProject {


    public static void main(String[] args) {

        int value;




        System.out.println("press 1 for Addition");
        System.out.println("press 2 for sub");
        System.out.println("press 3 for mul");
        System.out.println("press 4 for div");
        System.out.println("press 5 for mod");
        System.out.println("press 6 for exit");


        Scanner scanner = new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR CHOICE");
        value = scanner.nextInt();

        Scanner num4 = new Scanner(System.in);
        System.out.println("enter the first value");
        int num1 = num4.nextInt();
        System.out.println("enter the second value");
        int num2 = num4.nextInt();


        switch (value) {
            case 1:
                sum(num1,num2);
                break;
            case 2:
                sub(num1,num2);
                break;
            case 3:
                mul(num1,num2);
                break;
            case 4:
                div(num1,num2);
                break;

            case 5:
                mod(num1,num2);
                break;


            default:
                System.out.println("EXIT");


        }
    }

    public static void sum(int num1,int num2) {




        int sum;
               sum = num1+num2;

        System.out.println("sum is" + sum);


    }public static void sub(int num1,int num2) {




        int sub;
        sub = num1-num2;
        System.out.println("sub is" + sub);
    }

    public static void mul(int num1,int num2) {



        int mul;
        mul = num1*num2;
        System.out.println("mul is" + mul);
    }

    public static void div(int num1,int num2) {




        int div;
        div = num1/num2;
        System.out.println("div is" + div);
    }

    public static void mod(int num1,int num2) {


        int mod;
        mod = num1%num2;
        System.out.println("mod is" + mod);
    }

    }





