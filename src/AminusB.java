import java.util.Scanner;

// 첫째 줄에 A와 B가 주어진다. (0< A,B < 10)
// 첫째 줄에 A-B를 출력한다.
public class AminusB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a - b);
    }
}
