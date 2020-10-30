import java.util.Scanner;

public class Application
{
 public static void main( String[] args )
 {
        try { 
         if (args.length == 1) {
          String str = args[0];
          String compressed = "";
 
       char ch=0;
       int count=1;
       
       for (int x = 0; x < str.length(); x++) { 
           if (ch == str.charAt(x)){
               count = count + 1;
           } else {
            compressed = compressed + ch;
               if(count != 1){
                if(count <= 9) compressed = compressed + count;
                else {
                 compressed = compressed + 9;
                                count-=9;
                 while(count >= 9){
                  compressed = compressed + ch+ 9;
                                    count-=9;
                 }
                 if(count != 0)compressed = compressed + ch + count;
                }
               }
               ch = str.charAt(x);
               count = 1;
           }
       }
       
       compressed = compressed + ch;
       if(count != 1){
            compressed = compressed + count;
       }
       
       System.out.println(compressed);
          
         }else { System.out.println("");}

     }catch (NullPointerException e){}
 }
}
