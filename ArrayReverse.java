//Java Program to reverse an Array
//Author - Alok kumar Sahoo
import java.util.Scanner;
public class ArrayReverse {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter elements : ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("array elements are : ");

        sc.close();
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

        //reverse an array
        int i = 0,j = size-1,temp;
        while(i <= j)
        {
            //swap of arr[i] and arr[j]
            temp = arr[i];
            arr[i] = arr[j];       
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("after reversing the array : ");
        for(i = 0;i < size;i++)
        {
            System.out.println(arr[i]);
        }
      
    }
}
