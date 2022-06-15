package OnlineQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pointsVisited {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test!=0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            String temp=sc.nextLine();
            String s=sc.nextLine();
            Set<Integer> set=new HashSet<>();
            set.add(n);
            for(int i=0;i<x;i++)
            {
                char c=s.charAt(i);
                if(c=='R')
                    n++;
                else{
                    n--;
                }
                set.add(n);
            }
            System.out.println(set.size());
            test--;
        }
    }
}
