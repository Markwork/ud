package com.mark.ud.byteUtil;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @Desc: ByteArrayInputStream 与 ByteArrayOutputStream
 * 该类型属于操作内存数据
 * @author lcy
 * @date 2018/6/20 14:57
 * @version V1.0
*/

public class ByteArrayStreamUtil {
    /**
     * ByteArrayInputStream
     * 可以将字节数组转化为输入流 。
     * @return
     */
    public String Input(String inputString){
        //传入字节数组
        byte[] buf = inputString.getBytes();
        //创建字节数组输入流
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buf);
        //将输入的字节流读出
        while (byteArrayInputStream.available() > 0){
            System.out.println((char)byteArrayInputStream.read());
        }
        try{
            //关闭字节流
            byteArrayInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * ByteArrayOutputStream
     * 可以捕获内存缓冲区的数据，转换成字节数组。
     * @return
     */
    public String Output(String msg){
        //新建字节输出流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            //将需要写入的信息放入字节输出流中
            byteArrayOutputStream.write(msg.getBytes());
            //新建文件输出流
            OutputStream outputStream = new FileOutputStream("D:/test1.txt");
            //将字节输出流写入到文件中
            byteArrayOutputStream.writeTo(outputStream);
            outputStream.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                byteArrayOutputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        //测试输入
        ByteArrayStreamUtil byteArrayStreamUtil = new ByteArrayStreamUtil();
        byteArrayStreamUtil.Input("hello");

        //测试输出
        byteArrayStreamUtil.Output("hello out");
    }
}
