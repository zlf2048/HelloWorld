package com.example.helloworld;

public class Meinv {
    private float height;
    private float weight;
    private int age;
    private double yanzhi; //数据成员

    public void Meinv() {
        height = 167;
        weight = 86;
        age = 21;
        yanzhi = 999999999;
    }                      //构造函数,对类进行初始化的作用

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public double getYanzhi() {
        return yanzhi;
    }

    public void eat() {
        System.out.println("美女吃饭");
    }

    public int drink(int water) {
        return water+2;
    }

    private void beauty(double bea) {
        yanzhi = yanzhi + bea;
    }                       //函数成员
}
