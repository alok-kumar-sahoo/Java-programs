//Java program to access the private attributes using accessor and mutator method
//Programmer - Alok kumar Sahoo
import java.util.Scanner;
public class AccessorMutator
{
    private String name;
    private int rollNo;

    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return name;
    }
    void setRoll(int rollNo)
    {
        this.rollNo = rollNo;
    }
    int getRoll()
    {
        return rollNo;
    }
    public static void main(String[] args) {
        AccessorMutator a1 = new AccessorMutator();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name : ");
        String name = sc.nextLine();

        System.out.println("enter roll no : ");
        int rollNo = sc.nextInt();

        a1.setName(name);
        System.out.println("name = "+a1.getName());
   
        a1.setRoll(rollNo);
        System.out.println("roll no = "+a1.getRoll());

        sc.close();
    }
}