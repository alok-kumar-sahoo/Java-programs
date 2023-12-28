/*Deletion in Array from begining,ending and from specific position
 * here array index which starts from 0 and position starts from 1
 * Author - Alok kumar Sahoo
 */
import java.util.Scanner;
public class RemoveElementFromArray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter elements : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("array elements are : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        int pos;
        System.out.println("enter the position where you want remove the element : ");
        pos = sc.nextInt();
        if(pos == 1)
        {
            for(int i=0;i<arr.length-1;i++)
            {
                arr[i] = arr[i+1];
            }
           size--;
        }
        if(pos == arr.length)
        {
            size--;
        }
        if(pos > 0 && pos < arr.length)
        {
            for(int i=pos-1;i<arr.length-1;i++)
            {
                arr[i] =arr[i+1];
            }
            size--;
        }

        System.out.println("now array length is "+size);
        System.out.println("final elements are : ");

        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
