/*write a java program to count the character occurrence (avoiding lowercase and uppercase i.e treating both are same)
// Programmer - Alok kumar Sahoo */
import java.util.Scanner;
public class CharacterOccurrence {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();

        System.out.println("enter a character to check how many times it occurred : ");
        String s = sc.nextLine();
        char chLower = s.toLowerCase().charAt(0);
        char chUpper = s.toUpperCase().charAt(0);
        int count = 0;
        int i=0;
        while(i<str.length())
        {
            if(str.charAt(i) == chLower  || str.charAt(i) == chUpper)
                count++;
                i++;
        }
        System.out.println("no of times character occured : "+count);

        sc.close();
    }
}
