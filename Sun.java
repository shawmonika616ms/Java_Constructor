package com.company;

public class Sun {

    public static void main(String[] args) {
        Sun obj=new Sun();
        Sun obj1=new Sun(80);
        obj.get();
        obj1.get();

    }

  int a=10;
   public Sun()
   {
       this.a=a;
   }
   public Sun(int a)
   {
       this.a=a;
   }

   public void get()
   {
       System.out.println(a);
   }






}
