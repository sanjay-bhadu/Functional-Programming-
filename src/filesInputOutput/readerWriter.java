package filesInputOutput;

import java.io.*;
import java.util.Scanner;

public class readerWriter {
    public static void main(String[] args) throws IOException {
        //we called BufferedWriter for the writing
        BufferedWriter writer =new BufferedWriter(new FileWriter("output.txt"));
        writer.write("Hello world");
        writer.write("\n Hello world new line");
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            String temp=scan.nextLine();
            writer.write("\n"+temp);
        }
        writer.flush();
        writer.close();
        //remember everytime we run this program the context in output.txt is overwritten.
        BufferedReader reader=new BufferedReader(new FileReader("output.txt"));
        String s;
        while((s=reader.readLine())!=null){
            //readline reads whole line in a go.. and returns null if line is empty or it is end of line.
            System.out.println(s);
        }
        reader.close();
    }
}
