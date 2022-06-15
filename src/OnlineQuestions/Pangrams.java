package OnlineQuestions;

import java.util.*;

public class Pangrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char temp='a';
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        List<Character> list=new ArrayList<>();
        for(int i=1;i<=26;i++)
        {
            int r=sc.nextInt();
            map.put(temp,r);
            map2.put(temp,1);
            temp= (char) (temp+1);

        }
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(map2.containsKey(c))
            {
                map2.put(c,map2.get(c)+1);
            }
        }
        int sum=0;
        for(Map.Entry<Character,Integer> m: map2.entrySet())
        {
            if(m.getValue()==1)
            {
                sum=sum+map.get(m.getKey());
            }
        }
        System.out.println(sum);
    }
}
