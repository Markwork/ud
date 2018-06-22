package com.mark.ud.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
/**
 * @Desc: 字节流工具类
 * @author lcy
 * @date 2018/6/22 11:31
 * @version V1.0
*/

public class ByteUtil {
    /**
     * 不需要编码格式的上传文件，以字节方式上传，比较适用于图片等不需要转码的文件。因为字节流不能对unicode编码进行操作。
     * @param inputStream
     * @param fileName
     * @param fileUrl
     */
    public static void InputNoCodeType(InputStream inputStream,String fileName,String fileUrl){
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileUrl+fileName));
            byte[] buffer = new byte[10240];
            int flag = 0;
            while((flag = bufferedInputStream.read(buffer)) != -1){
                bufferedOutputStream.write(buffer,0,flag);
            }
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            bufferedInputStream.close();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
