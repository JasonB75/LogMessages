public class LogMessage
{

        public String machineId;
        public String description;

    public LogMessage(String message)
        {
            machineId = message.substring(0, message.indexOf(":"));
            description = message.substring(message.indexOf(":")+1);
            System.out.println(description);
        }

        public boolean conainsWord(String keyword)
        {
            if (description.equals(keyword))
            {return true;}

            if (description.length() > keyword.length())
            {System.out.println("in1");
                if (description.trim().equals(keyword))
                { return true; }

                if (description.substring(0,keyword.length()).equals( keyword+" "))
                {return true;}

                if (description.substring(description.length()-keyword.length()-1).equals(" "+keyword))
                {return true;}

                if (description.contains(" " + keyword+" "))
                {return true;}

                else
                {return false;}
            }
            else
            {return false;}


        }


    }

