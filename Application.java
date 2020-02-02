package shaffer_p1;

import java.util.Scanner;

public class Application
{
	
	
	public static void main(String[] args) 
	{
		int num;
//user input
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter 4  numbers for encryption:");
		num = in.nextInt();

		System.out.print("the  4  numbers for encryption:");
	//able to have a leading 0	
		String numberAsString = String.format ("%04d", num);
		System.out.println(numberAsString);
		
//transfers string back to int
		int ch1 = numberAsString.charAt(0)-48;
		int ch2 = numberAsString.charAt(1)-48;
		int ch3 = numberAsString.charAt(2)-48;
		int ch4 = numberAsString.charAt(3)-48;
		
		//sends to encrypter
		ch1 = Encrypter.encrypt(ch1);
		ch2 = Encrypter.encrypt(ch2);
		ch3 = Encrypter.encrypt(ch3);
		ch4 = Encrypter.encrypt(ch4);
		
		
		System.out.print(" the encrypted numbers:");
		
		System.out.print(ch3);
		System.out.print(ch4);
		System.out.print(ch1);
		System.out.println(ch2);
		//sends to decrypter
		ch1 = Decrypter.decrypt(ch1);
		ch2 = Decrypter.decrypt(ch2);
		ch3 = Decrypter.decrypt(ch3);
		ch4 = Decrypter.decrypt(ch4);
		
		
		System.out.print(" the decrypted numbers:");
		System.out.print(ch1);
		System.out.print(ch2);
		System.out.print(ch3);
		System.out.println(ch4);
	
		
	in.close();
	
	
	}
}
