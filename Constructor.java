package com.company;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Constructor {

    private static final Logger logger=Logger.getLogger(Constructor.class.getName());
    public static void main(String[] args) {

        Constructor ob=new Constructor(2,3);
        int r=ob.sum();
        logger.log(Level.INFO,"result is {0}",r);

    }
    int a;
    int b;
    public Constructor(int a,int b)
    {
        this.a=a;
        this.b=b;
    }


    public int sum()
    {

        return a+b;
    }
    }


