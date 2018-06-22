package com.mark.ud.byteUtil;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

/**
 * @Desc: 回退流
 * @author lcy
 * @date 2018/6/21 14:45
 * @version V1.0
*/

public class PushbackStreamUtil {
    public static void Input(String input){
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
            PushbackInputStream pushbackInputStream = new PushbackInputStream(byteArrayInputStream);
            int flag = 0;
            while((flag = pushbackInputStream.read()) != -1){
                String test = String.valueOf((char)flag);
                if("-".equals(test)){
                    pushbackInputStream.unread(flag);
                    //flag = pushbackInputStream.read();
                    System.out.println("退回："+(char)flag);
                    pushbackInputStream.skip(1);
                }else{
                    System.out.print((char) flag);
                }
            }
            byteArrayInputStream.close();
            pushbackInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Input("qweqwe-qweqwe-123");
    }
}
