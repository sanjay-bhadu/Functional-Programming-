package OnlineQuestions;

import java.util.*;

//find duplicate elements in list
//for any type of duplicate elements.. we use the sets as sets remove duplication.
public class ques2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of items in list");
        int n=scanner.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int temp=scanner.nextInt();
            list.add(temp);
        }
        Set<Integer> set=new HashSet<>();
        list.stream()
                .filter(s->!set.add(s))
                .forEach(System.out::println);
    }
}
