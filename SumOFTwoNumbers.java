import java.util.Scanner;

class SumOfTwoNumbers{
    public static void sumOfTwoNumbers(){          //Sub method
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter #1 : ");
        int num1 = scan.nextInt();

        System.out.print("Enter #2 :");
        int num2 = scan.nextInt();

        int total = num1 + num2;
        System.out.println("Total = " + total);
    }    

    public static void main(String [] args){        //main method
        sumOfTwoNumbers()    ;    //calling to sub method
    }
}