
import java.util.Scanner;

class sumofnumbers{
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();
        int sum = 0;
        while(n!=0){
        int digit = n % 10;
        sum = sum+digit;
        n = n/10;
        }
        System.out.println(sum);
    }
}