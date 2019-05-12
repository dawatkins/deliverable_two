import java.util.Scanner;

public class UnicodeCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str1;
		String str2;
		int str1Total = 0;
		int str2Total = 0;
		
		System.out.println("This program will take 2 strings and compare their Unicode absolute values.");
		System.out.println("Enter your first string: ");
		str1 = scan.nextLine();
		System.out.println("Enter your second string: ");
		str2 = scan.nextLine();
		
		
		for(int i = 0; i <= str1.length() - 1; i++) {
			char temp = str1.charAt(i);
			System.out.println(str1.charAt(i) + ": " + (int)temp);
			str1Total += (int)temp;
		}
		
		for(int i = 0; i <= str2.length() - 1; i++) {
			char temp = str2.charAt(i);
			System.out.println(str2.charAt(i) + ": " + (int)temp);
			str2Total += (int)temp;
		}
		
		System.out.println("Difference (as absolute value): " + Math.abs(str1Total - str2Total));
		
		scan.close();
	}
}
