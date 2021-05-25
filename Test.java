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
		Loan l=new Loan();
		System.out.print("Enter principle & year");
		p=sc.nextInt();
		t=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.print(l.homeLoan(p, t));
			break;
		case 2:
			System.out.println(l.carLoan(p, t));
			break;
		case 3:
			System.out.println(l.personalLoan(p, t));
			break;
		}
	}

}
