import java.util.Scanner;

public class patternn
{
   /* public static void main(String args[])
    {
//i for rows and j for columns
//row denotes the number of rows you want to print
     /*   int i, j, row=6;
//outer loop for rows
        for(i=0; i<row; i++)
        {
//inner loop for columns
            for(j=0; j<=i; j++)
            {
//prints stars
                System.out.print("*");
            }
//throws the cursor in a new line after printing each line
            System.out.println(' ');
        }*/


   /*public static void main (String args[])
    {

//i for rows and j for columns
//row denotes the number of rows you want to print
        int i, j, row = 6;
//Outer loop work for rows
        for (i=0; i<row; i++)
        {
//inner loop work for space
            for (j=2*(row-i); j>=0; j--)
            {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j=0; j<=i; j++ )
            {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }*/


   /* public static void main(String[] args)
    {
        int n=7;
//inner loop
        for (int i= 0; i<= n; i++)
        {
//outer loop
            for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
*/

    public static void main(String[] args)
    {
        int rows=8;
        for (int i= 0; i<= rows-1; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=rows-1-i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}