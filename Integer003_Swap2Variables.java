public class Integer003_Swap2Variables
{
    public static void main(String args[])
    {
        int x = 10;
        int y = 15;

        //1. With Using third Variable
        // int t;
        // t = x;
        // x = y;
        // y = t;


        //2. Without using third Variable : using + operator
        // x = x + y; //35
        // y = x - y; //20
        // x = x - y; //15 


        //3. Without using third Variable : using * operator
        x = x*y; //150
        y = x/y; //10
        x = x/y;

        System.out.println(x);
        System.out.println(y);
    }
}