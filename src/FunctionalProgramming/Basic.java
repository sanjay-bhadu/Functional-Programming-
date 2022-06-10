package FunctionalProgramming;


import java.util.*;

public class Basic {
    //This is generalised method for printing list.
    /*public static void printlist(List<Integer> list)
    {
        for(Integer n: list)
            System.out.println(n);
    }*/
    public static void printusingfunctional(List<Integer> list)
    {
        //stream is used for taking element from list,collection etc.
        //.forEach() is used for performing action on each of the element from stream.
        list.stream().forEach(System.out::println);//this is also method referencing.. we are calling println method from System.out
        System.out.println("");
        System.out.println("Even Numbers");
        System.out.println();
        // Method referencing is calling method in functional programming.
        //for example.
         //we have a method which determines whether a number is even or odd.
        // so to apply this method in functional programming we use method referencing.
        //ex.

        //list.stream()
                //.filter(Basic::isEven)
                //.forEach(System.out::println);


        //we can even modify the filter
        // we will use the process called lambda expression.
        //It is used to simplify codes.
        list.stream()
                .filter(number->number%2==0)
                .forEach(System.out::println);
        //above code works exactly same as the Basic::isEven.. we have seen lambda is use.
    }
    public static void printAllOddNumbers(List<Integer> list)
    {
        System.out.println("Printing all odd numbers");
        list.stream()
                .filter(num->num%2!=0)
                .forEach(System.out::println);
    }
    public static void printParticularCourses(List<String> list)
    {

        list.stream()
                .filter(name->name.equalsIgnoreCase("maths"))
                .map(count->count+1)
                .forEach(System.out::println);
    }

    public static void courseLengthGreaterThan4(List<String> list)
    {
        list.stream()
                .filter(course->course.length()>=4)
                .forEach(System.out::println);
    }


    /*public static boolean isEven(int n)
    {
        if(n%2==0)
            return true;
        else
            return false;
    }*/


    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Random rand=new Random();
        for(int i=0;i<10;i++)
        {
            int temp=rand.nextInt(0,100);
            list.add(temp);
        }
        //this will print all element using imperative code.
        //printlist(list);
        //this will print using functional programming.
        printusingfunctional(list);
        printAllOddNumbers(list);
        List<String> courses=new ArrayList<>();
        courses.add("Maths");
        courses.add("Science");
        courses.add("Maths");
        courses.add("English");
        courses.add("Sanskrit");
        printParticularCourses(courses);
        System.out.println();
        courseLengthGreaterThan4(courses);
    }

}
