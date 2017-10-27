// 두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class AplusB {
    public static void main(String[] args) {
        // create a new scanner object
        Scanner scanner = new Scanner(System.in);
        // prompt for user input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
