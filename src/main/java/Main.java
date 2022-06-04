import java.rmi.UnexpectedException;
import java.util.Scanner;
import java.util.Random;
public class Main
{
    /**
     * runs my progrma
     *
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println(fibbonacci(6));
    }

    public static int add(int a, int b)
    {
        return a + b;
    }

    public static int exponent(int base, int power)
    {
        int n = 0;
        int number = 1;
        while (n < power)
        {
            number = base * number;
            n++;
        }
        return number;
    }

    //save for later if u cant figure it out
    public static int getUserinput()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int object = myObj.nextInt();
        return object;
    }

    //fibbonacci of 1 should return 1
    //fibbonacci of 2 should return 1
    //fibbonacci of 3 should return 2
    public static int fibbonacci(int index)
    {

        if ((index == 1) && (index == 2))
        {
            return 1;
        }
        int n = 0;
        int a = 1;
        int fib = 1;
        while (n < index-2)
        {
            int temp = fib;
            fib = a + fib;
            a = temp;
            n++;
        }
        return fib;
    }

    public static String allCaps(String a)
    {
        throw new UnsupportedOperationException("not yet implemented");
    }

    public static String allLowerCase(String a)
    {
        throw new UnsupportedOperationException("not yet implemented");
    }

    public static int getMaxElement(int[] a)
    {
        throw new UnsupportedOperationException("not yet implemented");
    }

    public static int getArrayLength(int[] a)
    {
        throw new UnsupportedOperationException("not yet implemented");
    }

    public static String getAlphabeticallyFirst()
    {
        throw new UnsupportedOperationException("not yet implemented");
    }

    public static int convertStringToInt(String a)
    {
        throw new UnsupportedOperationException("not yet implemented");
    }

    public static int factorial(int a)
    {
        throw new UnsupportedOperationException("not yet implemented");
    }

    public static boolean hasDuplicates(int[] a)
    {
        throw new UnsupportedOperationException("not yet implemented");
    }

    //should return a number between a and b (could return a or b also)
    public static boolean getRandomIntBetween(int a, int b)
    {
        Random rand = new Random();
        Math.random();
        throw new UnsupportedOperationException("not yet implemented");
    }

    //if 2 elements are the same and next to eachother remove it and return an array
    public static int[] removeDuplicates(int[] a)
    {
        throw new UnsupportedOperationException("not yet implemented");
    }


}