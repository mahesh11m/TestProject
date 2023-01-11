
package com.company1;
import com.company.*;
 class c1 extends cwh_65_packages{
    public int x=1;
    protected int y=2;
    int z=3;
    private int a=4;
     void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

        }
public class cwh_66_access_modifiers  {
    public static void main(String[] args) {
      //  cwh_65_packages obj=new cwh_65_packages();
      //  obj.methodofclass65();
        c1 c=new c1();
        c.meth1();
        c.methodofclass65();
       System.out.println(c.x);
      //  System.out.println(c.y);
       // System.out.println(c.z);
     //   System.out.println(c.a);

    }
}
