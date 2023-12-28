//java program to count how many number of vowels in a String.(treating the both lowercase and uppercase vowels are same)
//Programmer - Alok kumar Sahoo
import java.util.Scanner;
public class CountVowels
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int countA=0,countE=0,countI=0,countO=0,countU = 0,totalVowelsUsed=0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' )
            {
                countA++;
                if (countA<1)
                    System.out.println(totalVowelsUsed++);
                
            }
            else if(ch=='e'){
                countE++;
                if (countE<1)
                    totalVowelsUsed++;
                }
            else if(ch=='i'){
                countI++;
                if (countI<1)
                    totalVowelsUsed++;
            }
            else if(ch=='o'){
                countO++;
                if (countO<1)
                    totalVowelsUsed++;
            }
            else if(ch=='u'){
                countU++;
                if (countU<1)
                    totalVowelsUsed++;
            }
        }
        System.out.println("no.of a  : "+" in "+str+" "+countA);
        System.out.println("no.of e  : "+" in "+str+" "+countE);
        System.out.println("no.of i  : "+" in "+str+" "+countI);
        System.out.println("no.of o  : "+" in "+str+" "+countO);
        System.out.println("no.of u  : "+" in "+str+" "+countU);

        if(countA>0){
            totalVowelsUsed++;
        }

        sc.close();
    } 
}

