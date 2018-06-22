package com.mark.ud.byteUtil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Desc: BufferedInputStream 与 BufferedOutputStream实例
 * 属于缓冲流
 * @author lcy   
 * @date 2018/6/20 23:27
 * @version V1.0   
*/

public class BufferedStreamUtil {
    public String Input(){
        try {
            FileInputStream fileInputStream = new FileInputStream("D:/test1.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            String context = "";

            byte[] buffer = new byte[10240];
            int flag = 0;
            while((flag = bufferedInputStream.read(buffer)) != -1){
                context += new String(buffer,0,flag);
            }
            System.out.println(context);
            fileInputStream.close();
            bufferedInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public String Ouput(){
        try {
            FileOutputStream fos=new FileOutputStream("D:/test2.txt");
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            String content="我是缓冲输出流测试数据！";
            bos.write(content.getBytes(),0,content.getBytes().length);
            bos.flush();
            bos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        BufferedStreamUtil bufferedStreamUtil = new BufferedStreamUtil();
        bufferedStreamUtil.Input();
        bufferedStreamUtil.Ouput();
    }
}
