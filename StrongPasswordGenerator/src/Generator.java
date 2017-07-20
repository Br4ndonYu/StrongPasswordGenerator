import java.util.Random;
import java.util.Scanner;

public class Generator {
	public static void main(String[] args) {
		System.out.println("Please input the type of characters that password includes:");
		System.out.println("1) Numbers");
		System.out.println("2) Lower case letters");
		System.out.println("3) Upper case letters");
		System.out.println("4) Symbols");
		System.out.print("Please input your choice:");
		Scanner sc = new Scanner(System.in);
		String pwd = sc.nextLine();
		System.out.println("Length?");
		int len = sc.nextInt();
		System.out.println("Here is your password:");
		System.out.println(Generate(pwd, len));
		System.out.print("~peace~");
	}

	private static String Generate(String pwd, int len) {
		final String num = "0123456789";
		final String lcc = "abcdefghijklmnopqrstuvwxyz";
		final String ucc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String sym = "~`!@#$%^&*()-=[];',./_+{}|:<>?";
		String pool = "";
		if(pwd.contains("1"))
			pool += num;
		if(pwd.contains("2"))
			pool += lcc;
		if(pwd.contains("3"))
			pool += ucc;
		if(pwd.contains("4"))
			pool += sym;
		int poolLen = pool.length();
		String result = "";
		Random r = new Random();
		
		for(int i = 0; i < len; i++) {
			result += pool.charAt(r.nextInt(poolLen));
		}
		return result;
	}
}
