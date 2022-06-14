package filesInputOutput;

import java.io.*;

public class pathApi {
    public static void main(String[] args) throws IOException {
        File file=new File("input");
        String s=file.getAbsolutePath();//this gives whole path from root directory.
        System.out.println(s);
        BufferedWriter writer=new BufferedWriter(new FileWriter("input.txt"));
        writer.write("Hello world");
        writer.write("\nHow are you");
        s=file.getPath();//just give the file name path.
        System.out.println(s);
    }
}
