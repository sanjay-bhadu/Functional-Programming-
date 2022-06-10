package Example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryOperation add=(a,b)->a+b;//this is lambda reference
        BinaryOperation add2= Integer::sum;//this is method reference
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c= add.apply(a,b);
        System.out.println("The sum is  "+c);
    }
}
