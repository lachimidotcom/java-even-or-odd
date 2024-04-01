import java.util.Scanner;

public class EvenOrOdd{
	public static String evenOrOddModulo(int a){
		if(a%2 == 0){
			return "Even";
		}else{
			return "Odd";
		}
	}
	
	public static String evenOrOddBitwise(int a){
		if((a&1) == 0)
			return "Even";
		else
			return "Odd";
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		scanner.close();
		
		System.out.println(num + " is (Modulo) " + evenOrOddModulo(num));
		System.out.println(num + " is (Bitwise) " + evenOrOddBitwise(num));
	}
}