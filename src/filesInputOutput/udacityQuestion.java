package filesInputOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class udacityQuestion {
    private static final int SHARD_SIZE = 10;

    private static String getOutputFileName(int shardNum) {
        return "output" + shardNum;
    }

    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String s;
            ArrayList<String> list=new ArrayList<>();
            while((s=reader.readLine())!=null)
            {
                list.add(s);
            }
            //sorting the list.
        list.sort(String::compareTo);
            BufferedWriter writer=new BufferedWriter(new FileWriter("output1.txt"));
            for(String a: list)
                writer.write(a+"\n");
            writer.close();
    }
}
