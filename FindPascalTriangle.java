import java.util.Scanner;

public class FindPascalTriangle {

	//Recursion implemented here
	public static int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

	public static int pascalTriangle(int n, int r) {
		return factorial(n) / (factorial(n - r) * factorial(r));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//row
		for (int i = 0; i < n; i++) {
			//space
			for (int j = 1; j <= n - (i + 1); j++)
				System.out.print(" ");
			//value
			for (int j = 0; j <= i; j++)

				System.out.print(pascalTriangle(i, j) + " ");
			System.out.println();

		}
	}
}
