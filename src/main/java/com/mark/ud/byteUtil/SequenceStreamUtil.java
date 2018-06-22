package com.mark.ud.byteUtil;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @Desc: 合并流，将多个流整合为一个流进行读取，统一汇合到第一个流中
 * @author lcy
 * @date 2018/6/21 16:11
 * @version V1.0
*/

public class SequenceStreamUtil {
    public static void Input(){
        try {
            /**
             * 该函数两个构造方法，一个是传入枚举对象，可以使用Vector的数组，里面是继承 InputStream的流；
             * 另一个是传入2个InputStream对象，
             */
            Vector<FileInputStream> vector = new Vector<FileInputStream>();
            vector.add(new FileInputStream("D:/test1.txt"));
            vector.add(new FileInputStream("D:/test2.txt"));
            vector.add(new FileInputStream("D:/test3.txt"));
            Enumeration<FileInputStream> en = vector.elements();
            SequenceInputStream sequenceInputStream = new SequenceInputStream(en);

            byte[] buffer = new byte[1024];
            int flag = 0;
            while((flag = sequenceInputStream.read(buffer)) != -1){
                System.out.print(new String(buffer,0,flag));
            }
            sequenceInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Input();
    }
}
