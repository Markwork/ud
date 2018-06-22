package com.mark.ud.charUtil;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;

public class CharArrayUtil {
    public static void read(String content){
        try {
            CharArrayReader charArrayReader = new CharArrayReader(content.toCharArray());
            char[] chars = new char[2];
            int flag = 0;
            while((flag = charArrayReader.read()) != -1){
                System.out.println(String.valueOf((char)flag));
            }
            charArrayReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * CharArrayWriter类实现一个可用作 Writer 的字符缓冲区。缓冲区会随向流中写入数据而自动增长
     */
    public static void write(){
        try {
            CharArrayWriter charArrayWriter = new CharArrayWriter();
            String msg = "hello world！！！22121";
            charArrayWriter.write(msg.toCharArray());
            System.out.println(charArrayWriter.toString());
            charArrayWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {
        read("adsfasdfadsfasdfasdf撒旦发射点发");
        write();
    }
}
