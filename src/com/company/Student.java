package com.company;

public class Student implements Person{
    String name;
    int age;
    int year;
    int poct;

    public Student(String name, int age, int year, int poct) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.poct = poct;
    }

    @Override
    public void wakeUp() {
        System.out.println("wake up");
    }

    @Override
    public void eat1() {
        System.out.println("eat1");
    }

    @Override
    public void worked() {
        System.out.println("worked");
    }

    @Override
    public void eat2() {
        System.out.println("eat2");
    }

    @Override
    public void playGame() {
        System.out.println("play game");
    }

    @Override
    public void eat3() {
        System.out.println("eat3");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }
    public void print(){

        System.out.println("ismi "+name);
        System.out.println("yoshi "+age);
        System.out.println("yili "+year);
        System.out.println("buyi "+poct);
    }

}
