import java.util.Scanner;
public class ganjilgenap
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int nilai;
		
		System.out.print("Masukkan nilai = ");
		nilai = input.nextInt();
		
	if (nilai % 2 == 0) {
		System.out.println("angka yang dimasukkan adalah genap");
		}
		else
			System.out.println("angka yang dimasukkan adalah ganjil");
	}
}