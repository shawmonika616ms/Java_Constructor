package com.company;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CubeRoot {
    private static final Logger logger=Logger.getLogger(CubeRoot.class.getName());
    public static void main(String[] args) {
        int n=21;
        int cube=0;
        for(int i=1;i<n;i++)
        {
            if(i*i*i==n)
            {
                cube=1;
            }
        }
        if(cube==1)
           logger.log(Level.INFO,"Perfect {0}",n);
        else
            logger.log(Level.INFO,"Perfect {0}",n);

    }
}
