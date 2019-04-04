public class Main
{
    public static void main(String[] args)
    {
        LogMessage test = new LogMessage("server2:error on disk");

        if (test.conainsWord("disk"))
        {System.out.println("true");}

        else
        {System.out.println("false");}

    }
}
