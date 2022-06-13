package OnlineQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ques4 {
    public static void main(String[] args) {
        //here we find the maximum element in the list

        List<Integer> list= Arrays.asList(1,2,3,4,67,87,98,100,234,343,44,55);
        int max=list.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);
        System.out.println("Sorted in Regular Order");
        list.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("Sorted in reversed order");
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
