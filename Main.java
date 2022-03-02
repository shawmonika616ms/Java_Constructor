package com.company;

public class Main {



    public static void main(String[] args) {

       Main obj=new Main();
       obj.sum(10,30);
       obj.display();


    }

    int s=0;
    public void sum(int a,int b)
    {
        s=a+b;
    }

    public void display()
    {
        System.out.println(s);
    }
}
