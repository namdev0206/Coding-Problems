public class SumOfArrayElements 
{
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5};

        int len = arr.length;
        int sum = 0;
        
        for(int i = 0; i <= len-1; i++)
        {
            sum = arr[i] + sum;
        }

        System.out.println("Sum of the Array is " + sum);
    }
}