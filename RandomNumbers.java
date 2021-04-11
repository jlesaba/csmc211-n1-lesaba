import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random gen = new Random();

		int num1;
		float num2;

		num1 = gen.nextInt();

		System.out.println("A random integer: " + num1);

		num1 = gen.nextInt(10);

		System.out.println("A random integer from 0 to 9: " + num1);

		num1 = gen.nextInt(66);

		System.out.println("A random integer from 10 to 75: " + (num1 + 10));		

		num2 = gen.nextFloat() * (float) 10.0;

		System.out.println("A random float: " + num2);
	}
}
