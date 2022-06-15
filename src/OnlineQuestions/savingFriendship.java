package OnlineQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class savingFriendship {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testcase=scanner.nextInt();
        while(testcase!=0)
        {
            int n=scanner.nextInt();
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++)
            {
                int temp=scanner.nextInt();
                set.add(temp);
            }
            System.out.println(set.size());
            testcase--;
        }
    }
}
