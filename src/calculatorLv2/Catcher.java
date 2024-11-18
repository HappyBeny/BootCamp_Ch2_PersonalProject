package calculatorLv2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Catcher {
    Scanner sc = new Scanner(System.in);

    public void exCatch(Exception e) {
        if (e instanceof ArithmeticException){
            System.out.println("[[error]] 숫자를 0으로 나누는 것은 불가능합니다. 다시 시도해주세요.");
            System.out.println();
        } else if (e instanceof InputMismatchException) {
            System.out.println("[[error]] 올바른 숫자를 입력해주세요. '0 이상의 정수'입니다.");
            System.out.println();
        } else if (e instanceof NumberFormatException) {
            System.out.println("[[error]] 잘못 입력하셨습니다. 정수를 입력해주시기 바랍니다.");
            System.out.println();
        } else {
            System.out.println(e);
        }
    }
}
