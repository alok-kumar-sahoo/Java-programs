/*Palindrome in string in Java
 * Author - Alok kumar Sahoo
 */
public class Palindrome {
    public static void main(String[] args) {
        String str = "Hello world i am java";
        String arr[]=str.split(" ");
        System.out.println("no. of words = "+arr.length);
    
        String rev = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);
        System.out.println(str);
        if(str.equals(rev))
        {
            System.out.println(str+" is palindrome");
        }
        else
        {
            System.out.println(str+" is not palindrome");
        }
    }
    
}
