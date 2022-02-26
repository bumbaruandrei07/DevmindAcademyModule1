package Course14;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[]args){

        String s = "one two three";

        Scanner sc = new Scanner(s);
        sc.next();
        System.out.println(sc.next());

        System.out.println(s.substring(s.indexOf(" ")+1, s.lastIndexOf(" ")));

        String[] ss = s.split(" ");
        System.out.println(ss[1]);

        System.out.println(s.replace("one ", "").replace(" three",""));

        System.out.println(s.substring(4, 6));


        /* 1 */ class Finals{
            /* 2 */   	final StringBuffer s;
            /* 3 */   	Finals(){
                /* 4 */   		s =  new StringBuffer("test");
                /* 5 */   		s.append("ing");
                /* 6 */   	 }
            /* 7 */   }
    }
    }


