



import java.util.*;
import java.io.*;



 public class input{
    public static void main(String []args)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            long x=sc.nextLong();
            try
            {
      	
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
            } catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
        
            }
            
try
            {
           
                System.out.println(x+" can be fitted in:");
                if(x>=-32768  && x<=32768 )System.out.println("* short");
                //Complete the code\
            } catch(Exception e) {

                System.out.println(sc.next()+" can't be fitted anywhere.");
        
            }
            
            try
            {
             
                System.out.println(x+" can be fitted in:");
                if(x>=-2147483648  && x<=2147483648L )System.out.println("* Int");
                //Complete the code\
            } catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
        
            }
                try
                {
              
                    System.out.println(x+" can be fitted in:");
                    if(x>=-9223372036854775808L  && x<=922337203685477580l)System.out.println("* long");
                    //Complete the code\
                }    catch(Exception e)
                {
                    System.out.println(sc.next()+" can't be fitted anywhere.");
            
                }
        }
        
        
        
    }
}




