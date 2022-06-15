package OnlineQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class greatRun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test!=0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int max;
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                int temp=sc.nextInt();
                if(i==0)
                {
                    arr[i]=temp;
                }
                else{
                    arr[i]=temp+arr[i-1];
                }
            }
            List<Integer> list=new ArrayList<>();
            for(int i=n-1;i>=k;i--)
            {
                int temp=arr[i]-arr[i-k];
                list.add(temp);
            }
            list.sort(Integer::compareTo);
            max=list.get((list.size()-1));
            System.out.println(max);
            test--;
        }
    }
}
