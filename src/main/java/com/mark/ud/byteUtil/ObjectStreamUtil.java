package com.mark.ud.byteUtil;

import com.mark.ud.entity.Car;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Desc: 对象流，对象必须序列化
 * @author lcy
 * @date 2018/6/21 15:07
 * @version V1.0
*/

public class ObjectStreamUtil {
    public static void Input(){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:/test3.txt"));
            List<Car> cars = (List<Car>)objectInputStream.readObject();
            for(Car c:cars){
                System.out.println(c.getNo()+"---"+c.getName()+"---"+c.getCount());
            }
            objectInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void Output(){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:/test3.txt"));
            List<Car> cars = new ArrayList<Car>();
            cars.add(new Car(1,"BMW",3));
            cars.add(new Car(2,"AUDI",4));
            cars.add(new Car(3,"BENZE",5));
            objectOutputStream.writeObject(cars);
            objectOutputStream.flush();
            objectOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Output();
        Input();
    }
}
