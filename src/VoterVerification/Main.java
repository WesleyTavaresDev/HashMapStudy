package VoterVerification;

import java.util.HashMap;
import java.lang.Boolean;

public class Main
{
    HashMap<String, Boolean> voted = new HashMap<String, Boolean>();

    public static void main(String[] args)
    {
        Main mainClass = new Main();

        mainClass.VoterCheck("Bob");
        mainClass.VoterCheck("Pam");
        mainClass.VoterCheck("Bob");
    }

    public void VoterCheck(String name)
    {

        if(voted.containsKey(name))
            System.out.printf("%s has already voted%n", name);
        else
        {
            voted.put(name, true);
            System.out.printf("%s can vote %n", name);
        }
    }
}
