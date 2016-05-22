import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Please enter integer a:");
		int a = input.nextInt();

		System.out.println("Please enter integer b:");
		int b = input.nextInt();

		System.out.println("Please enter integer c:");
		int c = input.nextInt();
		double d = -(b * b) - (4 * a * c);

		if (a == 0) {
			System.out.println("The equation is not square");
			return;
		}
		double x = -b / (2 * a);
		double SqRt = Math.sqrt(d);
		double x1 = ((-b + SqRt) / 2 * a);
		double x2 = ((-b - SqRt) / 2 * a);
		{

			System.out.println("d = - (b*b) - (4*a*c) = " + d);
			if (d < 0) {
				System.out.println("The equation has no real roots");

			} else if (d == 0) {
				System.out.println("x = -b/2a = " + x);

			} else {
				System.out.println("x = -b/2a = " + x1);
				System.out.println("x = -b/2a = " + x2);
			}
		}
		input.close();

	}
}
