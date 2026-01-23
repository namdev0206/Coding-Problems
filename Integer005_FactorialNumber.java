public class Integer005_FactorialNumber 
{
    public static int findFactorial(int num)
    {
        if(num == 0)
        {
            return 0;
        }
        else if(num == 1)
        {
            return 1;
        }

        int fact = 1; 

        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) 
    {
        int res = findFactorial(4);

        System.out.println("Factorial is :: " + res);
    }   
}