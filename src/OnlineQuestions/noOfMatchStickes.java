package OnlineQuestions;

import java.util.Scanner;

public class noOfMatchStickes {
    // no of match sticks requrired to print sum of two numbers
    static public int stickNumbers(char s)
    {
        if(s=='1')
            return 2;
        else if(s=='2')
            return 5;
        else if(s=='3')
            return 5;
        else if (s=='4')
            return 4;
        else if(s=='5')
            return 5;
        else if(s=='6')
            return 6;
        else if(s=='7')
            return 3;
        else if(s=='8')
            return 7;
        else if(s=='9')
            return 6;
        else{
            return 6;
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=a+b;
        String s=""+c;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            count=count+stickNumbers(s.charAt(i));
        }
        System.out.println(count);

    }

}
