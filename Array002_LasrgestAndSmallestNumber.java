import java.util.Arrays;

public class Array002_LasrgestAndSmallestNumber 
{
    public static void main(String args[])
    {
        int arr[] = {22, 33, 55, 33, 56, -1, 99, 100, 60};

        int len = arr.length;
        int largestNum = arr[0];
        int smallestNum = arr[0];

        for(int i = 1; i <= len-1; i++)
        {
                if(arr[i] > largestNum)
                {
                    largestNum = arr[i];
                }

                else if(arr[i] < smallestNum)
                {
                    smallestNum = arr[i];
                }

        }

        System.out.println("Given Array is :: " + Arrays.toString(arr));
        System.out.println("Largest Element in the Array is :: " + largestNum);
        System.out.println("Smallest Element in the Array is :: " + smallestNum);
    }
}