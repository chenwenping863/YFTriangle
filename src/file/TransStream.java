package file;

import java.io.*;

/**
 * Created by chenwenping on 17/3/23.
 */
public class TransStream {

    public static void main(String[] args) throws IOException
    {
        //输入流1
        BufferedReader bufr =
                new BufferedReader(new InputStreamReader(new FileInputStream("input1.txt")));
        //输出流
        BufferedWriter bufw =
                new BufferedWriter(new OutputStreamWriter(new FileOutputStream("outpun.txt")));

        String line = null;
        //将输入流写进输出流
        while ((line=bufr.readLine())!=null)
        {
            bufw.write(line.toUpperCase());
            bufw.newLine();
            bufw.flush();
        }
//输入流2
        BufferedReader bufr1 =
                new BufferedReader(new InputStreamReader(new FileInputStream("input2.txt")));
        while ((line=bufr1.readLine())!=null)
        {
            bufw.write(line.toUpperCase());
            bufw.newLine();
            bufw.flush();
        }

        //关闭资源
        bufr.close();
        bufr1.close();
        bufw.close();
    }


}
