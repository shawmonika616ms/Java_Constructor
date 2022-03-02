package com.company;

public class StaticVar {
    static int s=9;
    public static void main(String[] args) {

        int r=sum(10,2);
        if(s>=10)
        System.out.println("sum is"+r);
        else
            System.out.println("invalid sum");
    }



    public static int sum(int a,int b)
    {
        return a+b+s;
    }
}
