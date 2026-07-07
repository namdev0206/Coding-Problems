import java.util.Scanner;

public class AddTwoNumbers
{
    public static void main(String args[])
    {
        //Add Two numbers Input by User
        int num1, num2;
        System.out.print("Enter the first Number : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        System.out.print("Enter the second Number : ");
        num2 = sc.nextInt();

        int result = num1 + num2;
        System.out.println("Addition of these numbers is " + result);
    }
}