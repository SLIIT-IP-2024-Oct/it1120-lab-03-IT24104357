import java.util.Scanner;
public class IT241043573Q3
{
	public static void main(String[] args)
	{
		int Balance,NoOfNotes,Rupee_amount;
		

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Rupee_amount:");
		Rupee_amount=input.nextInt(); 

		NoOfNotes = Rupee_amount / 5000;
		Balance = Rupee_amount % 5000;
		System.out.println("5000 Notes-"+NoOfNotes);

		NoOfNotes= Balance / 1000;		
		Balance %= 1000;
		System.out.println("1000 Notes-"+NoOfNotes);

		NoOfNotes= Balance / 500;
		Balance %=  500;
		System.out.println("500 Notes-"+NoOfNotes);

		NoOfNotes= Balance / 100;
		Balance %=  100;
		System.out.println("100 Notes-"+NoOfNotes);

		NoOfNotes= Balance / 50;
		Balance %= 50;
		System.out.println("50 Notes-"+NoOfNotes);
		
		NoOfNotes= Balance / 20;
		Balance%=20;
 		System.out.println("20 Notes-"+NoOfNotes);

		NoOfNotes= Balance / 10;
		Balance%=10;
		System.out.println("10 Notes-"+NoOfNotes);

		NoOfNotes= Balance / 5;
		Balance%=5;
		System.out.println("5 Notes-"+NoOfNotes);

		NoOfNotes= Balance / 2;
		Balance%=2;
		System.out.println("2 Notes-"+NoOfNotes);

		NoOfNotes= Balance / 1;
		Balance%=1;
		System.out.println("1 Notes-"+NoOfNotes);


				
	}
}