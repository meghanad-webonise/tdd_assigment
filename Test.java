package calculator;
import java.util.Scanner;
public class Test {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Select loan type");
		System.out.println("1: Home , 2: Car 3:Personal");
		int ch=sc.nextInt();
		int t,p;
		Loan loan=new Loan();
		System.out.print("Enter principle & year");
		int principle=sc.nextInt();
		int time=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.print(loan.homeLoan(principle, time));
			break;
		case 2:
			System.out.println(loan.carLoan(principle, time));
			break;
		case 3:
			System.out.println(loan.personalLoan(principle, time));
			break;
		}
	}

}
