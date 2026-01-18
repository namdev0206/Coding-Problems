public class Array002_DuplicateElements 
{
    public static void main(String args[])
    {
        String names[] = {"Nikhil", "Vasu", "Namdev", "Deepak", "Jitender", "Vasu", "Nikhil"};

        int len = names.length;

        for(int i = 0; i <= len-1; i++)
        {
            for(int j = i+1; j <= len-1; j++)
            {
                if(names[i].equals(names[j]))
                {
                    System.out.println("Duplicate element is :: " + names[i]);
                }
            }
        }
    }
}
