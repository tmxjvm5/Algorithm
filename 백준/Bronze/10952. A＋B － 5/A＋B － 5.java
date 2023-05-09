import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;

		while ((str = br.readLine()) != null) {

			int a = str.charAt(0) - 48;
			int b = str.charAt(2) - 48;
			if(a==0 && b==0) {
				break;
			}
				sb.append(a + b).append("\n");

		}
		System.out.print(sb);
	}

}
