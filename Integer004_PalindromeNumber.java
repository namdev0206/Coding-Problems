public class Integer004_PalindromeNumber
{
    public static boolean isPalindrome(int num)
    {
        int original = num;
        int rev = 0;

        while(num != 0)
        {
            rev = rev*10 + num%10 ;
            num = num/10;
        }

        if(original == rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) 
    {
        System.out.println(isPalindrome(12322));

        System.out.println();
    }
}