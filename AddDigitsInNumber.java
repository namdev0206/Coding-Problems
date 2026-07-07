import java.util.*;

public class AddDigitsInNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number1, number2 = 0, sum = 0;

        System.out.print("Enter the Number : ");
        number1 = sc.nextInt();

        while(number1 > 0)
        {
            number2 = number1 % 10;
            number1 = number1/10;

            sum = sum + number2;
        }

        System.out.println("The sum will be : " + sum);
    }
}