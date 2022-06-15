package OnlineQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class missingDollPair {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int temp=scan.nextInt();
            if(map.containsKey(temp))
            {
                map.put(temp,map.get(temp)+1);
            }
            else{
                map.put(temp,1);
            }
        }
        int count=0;
        for(Map.Entry<Integer,Integer> m: map.entrySet())
        {
            if(m.getValue()%2!=0)
                count++;
        }
        System.out.println(count);
    }
}
