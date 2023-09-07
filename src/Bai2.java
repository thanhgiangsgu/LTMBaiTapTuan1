import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Nhập số nguyên n
        System.out.print("Nhập số nguyên n (n >= 3): ");
        int n = input.nextInt();
        
        if (n < 3) {
            System.out.println("Số n phải lớn hơn hoặc bằng 3.");
        } else {
            int sum = 1; // Bắt đầu với sum = 1 vì 1 là ước số của mọi số nguyên.

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    sum += i;
                    if (i != (n / i)) { // Tránh trường hợp i và n/i giống nhau (ví dụ: n = 25, i = 5).
                        sum += (n / i);
                    }
                }
            }
            
            System.out.println("Tổng các ước số của " + n + " là: " + sum);
        }
        
        input.close();
    }
}
