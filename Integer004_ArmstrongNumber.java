public class Integer004_ArmstrongNumber 
{
    public static boolean isArmstrongNumber(int num)
    {
        int temp;
        int org = temp = num;
        int rem = 0, value = 0, digits = 0;

        while(temp != 0)
        {
            digits++;
            temp = temp / 10;
        }

        while(num != 0)
        {
            rem = num % 10;
            
            value += Math.pow(rem, digits);

            num = num / 10;
        }

        return org == value;
    }

    public static void main(String[] args)
    {
        System.out.println(isArmstrongNumber(1634)); 
    }
}