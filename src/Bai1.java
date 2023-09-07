import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		long n = sc.nextLong();
		for (int i = 1; i<= n; i++) {
			ans += i;
		}
		
		System.out.print(ans);
	}
}
