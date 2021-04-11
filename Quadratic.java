import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		float a, b, c;
		double disc, root1, root2;

		Scanner cin = new Scanner(System.in);

		System.out.print("Input the coefficient of x^2: ");
		a = cin.nextFloat();

		System.out.print("Input the coefficient of x: ");
		b = cin.nextFloat();

		System.out.print("Input the constant: ");
		c = cin.nextFloat();

		disc = Math.pow(b, 2) - (4 * a * c);

		root1 = ( (-1 * b) + Math.sqrt(disc)  ) / (2 * a);
		root2 = ( (-1 * b) - Math.sqrt(disc)  ) / (2 * a);

		System.out.println("Root 1: " + root1);
		System.out.println("Root 2: " + root2);
	}
}
