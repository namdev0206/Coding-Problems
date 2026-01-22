public class String003_Swap2Strings 
{
    public static void main(String args[])
    {
        String a = "Hello";
        String b = "World";

        System.out.println("Strings before Swapping : a = " + a + " and b = " + b);

        //Swap Strings
        a = a + b; //HelloWorld

        b = a.substring(0, a.length()-b.length());

        a = a.substring(b.length());


        System.out.println("Strings before Swapping : a = " + a + " and b = " + b);
    }
}
