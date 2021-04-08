package com.codegym1;

public class TestStaticMethod {
    public static void main(String args[]) {
        Student1.change(); //calling change method

        //creating objects
        Student1 s1 = new Student1(111, "Hoang");
        Student1 s2 = new Student1(222, "Khanh");
        Student1 s3 = new Student1(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}