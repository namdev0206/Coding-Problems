public class String002_RegularExpression 
{
    public static void main(String[] args) 
    {
        String s = "$%%^& Nikhil Panchal 0987654321 HELLO&%^$$#%^";

        s = s.replaceAll("[^a-z-A-Z0-9]", "");

        System.out.println(s);
    }   
}