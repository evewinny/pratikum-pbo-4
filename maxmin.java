import java.util.Scanner;
public class maxmin {
 public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
   int max, min, j, z, n;
   
	j = 5;
   min = j;
   max = j;
   for (z=1; z<=j; z++)
   	{
    	System.out.print("Masukkan bilangan ke-" +z+ "= ");
    	n = input.nextInt();
    
    	if ( n < min )
    	{
     		min = n;
   	 	}
    	 if (n > max)
    	{
     		max = n;
    	}
    
   }
    System.out.println("Nilai Min = " +min);
    System.out.println("Nilai Max = " +max);
    }
 
}