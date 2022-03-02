package com.company;

public class Chaining {
    public static void main(String[] args) {
        Chaining obj=new Chaining();
        obj.show();

    }

    String name;
    int b;
    public Chaining()
    {
        this("nojash");
    }
    public Chaining(String nm)
    {
        this(nm,600);
    }
    public Chaining(String nm,int b)
    {
        this.name=nm;
        this.b=b;
    }
    public void show()
    {
        System.out.println(name+""+b);
    }





}
