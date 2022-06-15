package OnlineQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maxScore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test!=0)
        {
            Map<Integer,Integer> map =new HashMap<>();
            int n=sc.nextInt();
            for(int i=0;i<n;i++) {
                int s=sc.nextInt();
                int score= sc.nextInt();
                if(s<9 && s>0)
                {
                    if(map.containsKey(s))
                    {
                        if(score>map.get(s))
                        {
                            map.put(s,score);
                        }
                    }
                    else{
                        map.put(s,score);
                    }
                }
            }
            int sum=0;
            for(Map.Entry<Integer,Integer> m: map.entrySet())
            {
                sum=sum+m.getValue();
            }
            System.out.println(sum);
                 test--;
        }
    }
}
