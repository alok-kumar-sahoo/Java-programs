/*Java Program to use final keyword 
 * Author - Alok kumar Sahoo
 */
class Test
{
    void myNumber()
    {
        System.out.println("1234567890");
    }
   final void atmPin()      //without final ,the atmPin() must be overriden
    {
        System.out.println("1234");
    }
}
public class Final extends Test
{
    void myNumber()
    {
        System.out.println("Thief can access my nubmber - 1234567890");
    }
    /*void atmPin()
    {
        System.out.println("Thief can access the atm pin which is sensitive - 1234"); // this can't be overriden as the atmPin() is final
    }*/
    void show()
    {
        System.out.println("Hey you can't access the atm pin \nit can only be accessed by the owner");
    }

    public static void main(String[] args) {
        Final obj = new Final();
        obj.myNumber();
        obj.show();
    }
}

