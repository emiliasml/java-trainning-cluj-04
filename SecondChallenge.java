package myFirstClass;

import java.util.Scanner;

public class SecondChallenge {
    public static void main(String[] args) {
        String op = "yes";
        while (op.equals("yes")) {
            System.out.println("Give a number:");
            Scanner nr = new Scanner(System.in);
            int num = nr.nextInt();
            String s = compute(num);
            if (s.equals(""))
                System.out.print(num + " => " + num);
            else System.out.print(num + " => " + s);
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n"+"Do you want to give another number?");
            op = scanner.next();
        }
    }

    //stage 1
    public static String compute(int nr){
        String str="";
        if(nr % 3 == 0) str= str+ "Foo";
        if(nr % 5 == 0) str = str+ "Bar";
        if(nr % 7 == 0) str = str+ "Qix";
        int rn = reverse(nr);
        while(rn!=0) {
            str = str + compute2(rn);
            if(rn% 10 == 3 ) str = str + "Foo";
            if( rn % 10 == 5) str = str+ "Bar";
            if (rn % 10 == 7) str = str+ "Qix";
            rn = rn /10;
        }
        return str;
    }

    public static int reverse( int nr){
        int rn=0;
        while( nr != 0) {
            rn = rn * 10 + nr % 10;
            nr = nr / 10;
        }
        return rn;
    }

    //stage 2
    public static String compute2(int nr){
        if(nr % 10 == 0) return "*";
        return "";
    }

}
