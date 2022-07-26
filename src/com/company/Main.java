package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(in);
        System.out.println("ismni kiriting");
        String str = scanner.nextLine();
        System.out.println("yoshni kiriting");
        int num= scanner.nextInt();
        System.out.println("yilni kiriting");
        int num1=scanner.nextInt();
        System.out.println("buyni kiriting");
        int num3= scanner.nextInt();
        System.out.println("******************");
        System.out.println("malumotlar");
        Student student = new Student(str,num,num1,num3);
        student.print();
        System.out.println("******************");
        System.out.println("function");
        System.out.println("******************");
        student.wakeUp();
        student.eat1();
        student.worked();
        student.eat2();
        student.playGame();
        student.eat3();
        student.sleep();
        System.out.println("******************");



    }
}
