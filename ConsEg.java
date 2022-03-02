package com.company;

public class ConsEg {

    public static void main(String[] args) {

        ConsEg obj=new ConsEg("ankit",90);
        obj.show();
        ConsEg obj1=new ConsEg("abc");
        obj1.show();

    }
    String name;
    int a;
    public ConsEg(String name,int a)
    {
       this.name=name;
       this.a=a;
    }

    public ConsEg(String name)
    {
        this.name=name;

    }
    public void show()
    {
        System.out.println(name+" and"+a);
    }



}