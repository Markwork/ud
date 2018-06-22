package com.mark.ud.util;

import java.io.*;
/**
 * @Desc: 字符流工具类
 * @author lcy
 * @date 2018/6/22 16:15
 * @version V1.0
*/

public class CharUtil {
    /**
     * 字符流上传，带编码格式规定，适用于上传带中文的文件
     * @param inputStream
     * @param codeType
     * @param fileName
     * @param fileUrl
     */
    public static void Read(InputStream inputStream,String codeType,String fileName,String fileUrl){
        try {
            InputStreamReader isr = new InputStreamReader(inputStream, codeType);
            BufferedReader readerBuffer = new LineNumberReader(isr);
            String line = "";
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileUrl + fileName));
            while((line = readerBuffer.readLine()) != null){
                bufferedWriter.write(line,0,line.length());
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            readerBuffer.close();
            isr.close();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
