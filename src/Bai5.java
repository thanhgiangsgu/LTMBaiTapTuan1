import java.util.Scanner;

public class Bai5 {
	
	public static boolean isPrime(int num) {
		if (num < 2) return false;
		for (int i = 2 ; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
			
		}
		return true;
	}
	
	public static int Sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static int SumGCD(int n) {
		int sum = 1;
		
		for (int i = 2 ; i <= Math.sqrt(n); i++) {
			if (n %i == 0) {
				sum += i;
				if (i != (n / i)) { 
                    sum += (n / i);
                }
			}
		}
		return sum;
	}
	
	public static int SumPrime(int n)
	{
		int sum = 0;
		for (int i = 2 ; i <= n ; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}
	
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
		
		// Nhập số nguyên n 
		System.out.print("Nhập số nguyên n ");
		int n = input.nextInt();
		
		System.out.println("Tổng từ 1 đến N là :  " + Sum(n));
		System.out.println("Tổng các ước số nhỏ hơn hoặc bằng N là   " + SumGCD(n));
		System.out.println("Tổng các số nguyên tố nhỏ hơn hoặc bằng N là  :  " + SumPrime(n));
		System.out.print("Phân tích n thành tích các thừa số nguyên tố là :  " );
		primeFactorization(n);
		
	}
	
}
