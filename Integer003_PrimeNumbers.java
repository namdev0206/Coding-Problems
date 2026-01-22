public class Integer003_PrimeNumbers 
{   
        //Find Prime Number
        public static boolean isPrime(int num)
        {
            if(num <= 1)
            {
                return false;
            }

            for(int i = 2; i < num; i++)
            {
                if(num % i == 0)
                {
                    return false;
                }
            }
            return true;
        }


        public static void primeNumberRange(int pnum)
        {
            for(int i = 2; i <= pnum; i++)
            {
                if(isPrime(i))
                {
                    System.out.print(i + " ");
                }
            }
        }

    public static void main(String args[]) 
    {
        System.out.println(isPrime(8));

        primeNumberRange(500);
    }
}