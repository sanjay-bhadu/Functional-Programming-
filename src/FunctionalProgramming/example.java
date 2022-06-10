package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//question
// taking a list of string which contains number in string format
// print all even number
public class example {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Integers ");
        for(int i=0;i<6;i++)
        {
            String temp=scan.nextLine();
            list.add(temp);
        }
        List<Integer> output= (List<Integer>) list.stream()
                .map(s->Integer.valueOf(s))
                .filter(num->num%2==0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers entered are :" +output);
    }
}
