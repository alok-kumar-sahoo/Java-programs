/*Java Program to remove the white spaces from a string
 * Author - Alok kumar Sahoo
 */
import java.util.Scanner;
public class WhiteSpaceRemoveString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        char space = ' ';
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == space)
              count++;
        }
        System.out.println("\nNumber of white spaces = "+count);

        String str2[] = str.split(" ",count+1);
        System.out.println("after removing all the white spaces string will be : ");
        for(String s : str2)
        {
            System.out.print(s);
        }

        sc.close();
    }
}
