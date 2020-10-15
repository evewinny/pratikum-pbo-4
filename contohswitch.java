public class contohswitch {
	public static void main(String args[]) {
		char hurufawal = 'a';
		System.out.print("Masukkan huruf awal nama anda = ");
		try
		{
			hurufawal = (char)System.in.read();
		} catch(Exception e) {
			System.out.println("Salah input");
		}
		switch(hurufawal) {
			case (char)-1 : System.out.println("Bukan huruf depan tuh");
			case 'a' : System.out.println("apa namamu amin?"); break;
			case 'b' : System.out.println("apa namamu bambang?"); break;
			case 'c' : System.out.println("apa namamu cecep?"); break;
			case 'd' : System.out.println("apa namamu daud?"); break;
			case 'e' : System.out.println("apa namamu endang?"); break;
			default : System.out.println("tak dapat menebak");
		}
	}
}