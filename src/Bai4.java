import java.util.Scanner;

public class Bai4 {
	
	
	public static void primeFactorization(int n) {
		for (int i = 2 ; i <= n; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}
		  System.out.println();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập một số nguyên n ( n >= 2 ) : ");
		
		int n = input.nextInt();
		
		if ( n < 2 ) {
			System.out.print("Số n phải  lớn hơn hoặc bằng 2. ");
		} else {
			System.out.print("Phân tích " + n + " thành tích  thùa số nguyên tô ");
			primeFactorization(n);
		}
		
	}
	
}
