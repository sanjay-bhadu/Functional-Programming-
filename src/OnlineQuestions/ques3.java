package OnlineQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ques3 {

    @FunctionalInterface
    interface elementAtParticularIndex{
        public int element(List<Integer> s,int n);
    }

    public static void main(String[] args) {
        elementAtParticularIndex atParticularIndex=(a,b)->a.get(b);

        System.out.println("Enter the number of element you want to add in list");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int temp= scan.nextInt();
            list.add(temp);
        }
        System.out.println("Enter the value of the Index ");
        int index=scan.nextInt();
        while(index>=n)
        {
            System.out.println("please Enter appropriate value");
            index=scan.nextInt();
        }
        System.out.println("The required Element is :" + atParticularIndex.element(list,index));//here .element function is used to take arguments.
    }
}
