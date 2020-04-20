package myFirstClass;

public class firstChallenge {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (multipleRizz(i)) System.out.print("Rizz, ");
            else if (multipleJazz(i)) System.out.print("Jazz, ");
            else if (multipleFizzBuzz(i)) System.out.print("FizzBuzz, ");
            else if (multiplesFuzz(i)) System.out.print("Fizz, ");
            else if (multipleBuzz(i)) System.out.print("Buzz, ");
            else System.out.print(i + ", ");
        }
    }
    public static boolean multiplesFuzz(int nr){
        return nr % 3 == 0;
    }
    public static boolean multipleBuzz(int nr){
        return nr % 5 == 0;
    }
    public static boolean multipleFizzBuzz(int nr){
        return nr % 15 ==0;
    }
    public static boolean multipleRizz(int nr){
        return nr % 7 == 0;
    }
    public static boolean multipleJazz(int nr){
        return nr % 11 == 0;
    }
}
