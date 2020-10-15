public class contohIfElse{
public static void main(String args[]) {
	char hurufAwal ='a';
	System.out.print("Masukkan huruf awal nama anda : ");
	try{
		hurufAwal = (char)System.in.read();
	} catch(Exception e){
		System.out.println("Salah input kamu ya");
	}
	if (hurufAwal == 'a')
		System.out.println("apa namamu amin?");
	else if (hurufAwal == 'b')
		System.out.println("apa namamu bambang?");
	else if (hurufAwal == 'c')
		System.out.println("apa namamu cecep?");
	else if (hurufAwal == 'd')
		System.out.println("apa namamu dio?");
	else if (hurufAwal == 'e')
		System.out.println("apa namamu endang?");
	else
		System.out.println("aku tak dapat menebak");
	}
}