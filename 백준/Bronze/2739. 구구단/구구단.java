import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			for (int j = n; j <= n; j++) {
				System.out.println(n + " " + "*" + " " + i + " " + "=" + " " + i * n);
			}
		}
	}

}