package OnlineQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Question is to find the numbers starting with 1 in the list
public class ques1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        System.out.println("Enter the Number of items you want to add in the list ");
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        for(int i=0;i<n;i++)
        {
            int temp= scan.nextInt();
            list.add(temp);
        }
        //creating stream
        List<String> newlist=list.stream()
                .map(s->s+"")//this is to convert int to string
                .filter(s->s.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println("The required numbers are :" + newlist);
    }
}
