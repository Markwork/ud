package com.mark.ud.charUtil;

import java.io.*;

/**
 * @Desc: LineNumberReader 是继承BufferedReader缓冲流的方法，比缓冲流多了两个方法，获取行号与设置行号。
 * @author lcy
 * @date 2018/6/21 16:31
 * @version V1.0
*/

public class LineNumberUtil {
    public static void read(){
        try {
            InputStream inputStream = new FileInputStream("D:/test1.txt");
            //FileReader reader = new FileReader("D:/test1.txt");
            LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(inputStream));
            //LineNumberReader lineNumberReader = new LineNumberReader(reader);
            String line;
            while((line = lineNumberReader.readLine()) != null){
                System.out.println(lineNumberReader.getLineNumber()+"==="+line);
            }
            inputStream.close();
            lineNumberReader.close();
            //reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        read();
    }
}
