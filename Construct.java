package com.company;

public class Construct {
    public static void main(String[] args) {

        Construct obj1=new Construct();
        System.out.println(obj1.roll+ "and "+obj1.name);
        Construct obj2=new Construct(11,"def");
        System.out.println(obj2.name+ "and" +obj2.roll);

    }

    int roll;
    String name;

    public  Construct()
    {
        this.roll=1;
        this.name="abc";
    }
    public Construct(int r,String n)
    {
        this.roll=r;
        this.name=n;
    }

    public int get()
    {
        return roll;
    }
    public String get1()
    {
        return name;
    }

}
