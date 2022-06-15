package OnlineQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ques5 {
//pretty number
    //number ending with 2,3,9;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int l=scan.nextInt();
        int r=scan.nextInt();
        List<String> list=new ArrayList<>();
        for(int i=l;i<=r;i++)
        {
            list.add(""+i);
        }
        int count=0;
        for(String s:list)
        {
            if(s.endsWith("2") || s.endsWith("3") || s.endsWith("9"))
                count++;
        }
        System.out.println(count);

    }
}
