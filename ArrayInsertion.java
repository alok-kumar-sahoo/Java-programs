//Java Program to do insertion operation in an Array
//Author - Alok kumar Sahoo
import java.util.Scanner;
public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size+1];
        System.out.println("enter elements : ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("array elements are : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int pos,newElement;
        System.out.println("\nenter the element you want to insert : ");
        newElement = sc.nextInt();
        System.out.println("enter the position where you want insert an element : ");
        pos = sc.nextInt();
    
        try
        {
            for(int i = size-1;i >= pos-1;i--)
            {
                arr[i+1] = arr[i];
            }
            arr[pos-1] = newElement;
            size++;
            
            System.out.println("after insertion final array is : ");
            for(int i=0;i<size;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index "+pos+" out of bounds for length "+arr.length);
            System.out.println("Please enter the valid position !!");
        }


        sc.close();
    }
}
