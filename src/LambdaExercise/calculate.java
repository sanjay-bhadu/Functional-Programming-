package LambdaExercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        calulator calulator=new calulator();
        //here we are basically adding operator and there function in form of functionalInterface
        //we can use the lambda as we are using FunctionalINterface.
        calulator.reserveOperation("+",(a,b)->a+b);
        calulator.reserveOperation("-",(a,b)->a-b);
        calulator.reserveOperation("*",(a,b)->a*b);
        calulator.reserveOperation("/",(a,b)->a/b);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=scanner.nextInt();
        System.out.println("Enter the second number");
        int b=scanner.nextInt();
        System.out.println("Enter the operator");
        String temp=scanner.nextLine();
        String operator=scanner.nextLine();
        int c=calulator.calculate(a,operator,b);
        System.out.println(c);
    }
}
