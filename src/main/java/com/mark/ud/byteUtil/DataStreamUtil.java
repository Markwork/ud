package com.mark.ud.byteUtil;

import java.io.*;

/**
 * @Desc: 数据流操作类
 * @author lcy
 * @date 2018/6/21 10:59
 * @version V1.0
*/

public class DataStreamUtil {
    public static void Input(){
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("D:/test1.txt"));
            byte[] bytes = new byte[1024];
            int flag = 0;
            while((flag = dataInputStream.read(bytes)) != -1){
                System.out.println(new String(bytes,0,flag));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void Output(){
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("D:/test2.txt"));
            String content = "DataStream是吗？sdfasdf";
//            dataOutputStream.writeBytes(content);
//            dataOutputStream.writeChars("\n");
            dataOutputStream.writeChars(content);
            dataOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Input();
        Output();
    }
}
