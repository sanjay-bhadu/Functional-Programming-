package filesInputOutput;

import java.io.*;
import java.util.ArrayList;
//this program is almost same as other rather it uses shard method to divide large file into small ones and perform operation on it.
public class udacityQuestion2 {
    private static final int SHARD_SIZE = 1000;
    private static String getOutputFileName(int shardNum) {
        return "outputU" + shardNum;
    }
    public static void main(String[] args) throws IOException {

        int shard=0;
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("input.txt")))
        {
            String read=bufferedReader.readLine();
            while(read!=null) {
                ArrayList<String> list = new ArrayList<>(SHARD_SIZE);
                while(list.size()<SHARD_SIZE && read!=null )
                {
                    list.add(read);
                    read=bufferedReader.readLine();
                }
                list.sort(String::compareTo);
                try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(getOutputFileName(shard))))
                {
                    for(String s:list)
                        bufferedWriter.write(s+"\n");
                }
                shard++;
            }
        }
    }
}
