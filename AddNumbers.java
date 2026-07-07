import java.util.*;

public class AddNumbers 
{
    public static void main(String[] args)
    {
        //Addition of Numbers more than two
        Scanner sc = new Scanner(System.in);
        int count, num, result = 0;

        System.out.print("Enter the count of numbers you want to add : ");
        count = sc.nextInt();
        
        for(int i = 1; i <= count; i++)
        {
            System.out.println("Enter "+ i +" Number : ");
            num = sc.nextInt();

            result = result + num;
        }

        System.out.println("The total number is " + result);
    }
}