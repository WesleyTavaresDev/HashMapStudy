package PhoneBook;
import  java.util.HashMap;
import java.util.Scanner;

public class PhoneBook
{
    public  static  void main(String[] args)
    {
        HashMap<String, Long> phoneBook = new HashMap<>();

        phoneBook.put("Bob", 2025550171L);
        phoneBook.put("Martin", 2025550131L);
        phoneBook.put("Aditya", 2025550163L);
        phoneBook.put("Kent Beck", 2025550184L);
        phoneBook.put("George Orwell", 6135550164L);

        for(String i : phoneBook.keySet())
            System.out.println(i);

        System.out.print("Choose one of the names above -> ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        if(phoneBook.containsKey(name))
            System.out.printf("Name: %s %nPhone: %s %n", name, phoneBook.get(name));
        else
            System.out.println("Name not found");
    }
}
