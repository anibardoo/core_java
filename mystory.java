import java.util.Scanner;

public class mystory {
    public static int rev(int n) {
        int r, rev = 0;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        return rev ;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, count = 0;
        for (i = 1; i <= n; i++) {
            int r = rev(i);
            if (i + r == n && i== rev(r)) {  
                    System.out.println(n + " is a mystory number " + i + " and " + r);
                count++;
            }
        }
        if (count == 0)
            System.out.println("This is not a mystory number");
    }
}
