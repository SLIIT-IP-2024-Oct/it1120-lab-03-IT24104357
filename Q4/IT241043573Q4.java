import java.util.Scanner;

public class IT241043573Q4
{
	public static void main(String[] args)
{
		int tenthousands,thousands,hundreds,tens,ones,balance,a_five_digit_number;

		Scanner input=new Scanner(System.in);
		System.out.println("Enter a_five_digit_number:");
		a_five_digit_number=input.nextInt();

		tenthousands=a_five_digit_number/10000;
		balance= a_five_digit_number%10000;

		thousands=balance/1000;
		balance%=1000;

		hundreds=balance/100;
		balance%=100;

		tens=balance/10;
		balance%=10;

		ones=balance/1;

		System.out.println(tenthousands+" "+thousands+" "+hundreds+" "+tens+" "+ones);
		
		
}
}