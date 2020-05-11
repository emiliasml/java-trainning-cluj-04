package number_to_lcd;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
//the following program works just for int numbers
public class NumberToLCD {
    public static void main(String[] args) {
        int number = readANumberFromFile("src\\number_to_lcd\\input.txt");
        try{writeToFileLCDNumber(number, "src\\number_to_lcd\\output.txt");}
        catch(IOException ex){
            System.out.println("Something went wrong!");
        }
        System.out.println("Check the output file!");
    }

    public static int readANumberFromFile(String fileName) {
        int number = 0;
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileName)))) {
            number = scanner.nextInt();
        } catch (FileNotFoundException | InputMismatchException ex) {
            System.out.println("Exception occurred!");
            //ex.printStackTrace();
        }
        return number;
    }

    public static void writeToFileLCDNumber(int number, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        int nrZeros=numberOfZerosFromTheEndOfTheNumber(number);
        int reverseNumber = inverseNumber(number);
        int co = reverseNumber, digit;
        //writes the first line
        while (co > 0) {
            digit = co % 10;
            if (digit == 1) writer.write("  ");
            else if(digit == 4) writer.write("   ");
            else if(digit==7)writer.write(" _ ");
            else writer.write(" _ ");
            co = co / 10;
        }
        //writes the zeros from the end
        for(int i = 1;i<=nrZeros;i++) writer.write(" _ ");
        writer.write("\n");
        co = reverseNumber;
        //writes the second line
        while (co > 0) {
            digit=co%10;
            if(digit==1) writer.write(" |");
            else if(digit==7) writer.write("  |");
            else if(digit == 2|| digit == 3) writer.write(" _|");
            else if(digit == 4) writer.write("|_|");
            else if(digit==5 || digit==6) writer.write("|_ ");
            else if(digit==8 || digit==9) writer.write("|_|");
            else writer.write("| |");
            co = co / 10;
        }
        //writes the zeros from the end
        for(int i = 1;i<=nrZeros;i++) writer.write("| |");
        co=reverseNumber;
        writer.write("\n");
        //writes the third line
        while (co>0){
            digit = co%10;
            if(digit == 1) writer.write(" |");
            else if(digit==7) writer.write("  |");
            else if(digit==2) writer.write("|_ ");
            else if(digit==3 || digit==5 || digit==9)writer.write(" _|");
            else if(digit==4) writer.write("  |");
            else writer.write("|_|");
            co = co/10;
        }
        //writes the zeros from the end
        for(int i = 1;i<=nrZeros;i++) writer.write("|_|");
        writer.close();

    }
    public static int inverseNumber(int number) {
        int op = 0;
        int nrZeros =0;
        while (number > 0) {
            op = (op * 10) + (number % 10);
            number /= 10;
        }
        return op;
    }
    public static int numberOfZerosFromTheEndOfTheNumber(int number){
        int nrZeros=0;
        while(number>0&& number%10==0){
            nrZeros++;
            number/=10;
        }
        return nrZeros;
    }
}