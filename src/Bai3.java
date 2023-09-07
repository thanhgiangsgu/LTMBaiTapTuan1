import java.util.Scanner;

public class Bai3 {
	//Hàm kiểm tra xem một số có phải là số nguyên tố hay không
	
	public static boolean isPrime(int num) {
		if (num < 2) return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num %  i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Nhập số nguyên n
        System.out.print("Nhập số nguyên n (n >= 3): ");
        int n = input.nextInt();
        
        if (n < 3) {
            System.out.println("Số n phải lớn hơn hoặc bằng 3.");
        } else {
            int sum = 0;

            // Tính tổng các số nguyên tố nhỏ hơn hoặc bằng n
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    sum += i;
                }	
            }
            
            System.out.println("Tổng các số nguyên tố nhỏ hơn hoặc bằng " + n + " là: " + sum);
        }
        
        input.close();
    }
}
