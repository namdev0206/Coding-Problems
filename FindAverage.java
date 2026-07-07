import java.util.*;

public class FindAverage 
{
    public static void main(String[] args) 
    {
        //Find the average of Numbers-Input by user
        Scanner sc = new Scanner(System.in);

        int count;
        float sum = 0;

        System.out.print("Enter count of Numbers : ");
        count = sc.nextInt();

        for(int i = 1; i <= count; i++)
        {
            System.out.print("Enter " +i+ " Number : ");
            int num = sc.nextInt();

            sum = num + sum;
        }

        System.out.println("Average of these numbers are : " + sum/count);
    }
}