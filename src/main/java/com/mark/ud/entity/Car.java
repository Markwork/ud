package com.mark.ud.entity;

import java.io.Serializable;

/**
 * @Desc: 测试实体类
 * @author lcy
 * @date 2018/6/21 15:15
 * @version V1.0
*/

public class Car implements Serializable{
    private int no;
    private String name;
    private int count;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Car(int no, String name, int count) {
        this.no = no;
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Car{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
