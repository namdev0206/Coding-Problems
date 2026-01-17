public class Array001_MissingNumber
{
    public static void main(String args[])
    {
        int arr[] = {1,3,4,5};

        int len = arr.length;
        int sum = 0;

        for(int i = 0; i <= len-1; i++)
        {
            sum = sum + arr[i];
        }


        int firstElement = arr[0];
        int lastElement = arr[len-1];
        int arrSum = 0;

        for(int j = firstElement; j <= lastElement; j++)
        {
            arrSum = arrSum + j;
        }

        int missing = arrSum - sum;
        System.out.println(missing);
    }
}