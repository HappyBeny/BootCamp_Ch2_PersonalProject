package calculatorLv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;

        // calculate 메서드에 정수 2개, 연산기호 삽입
        Calculator cal1 = new Calculator();


        // 2번째 시도부터는 결과/값 지우기 확인
        for (int i = 0; ; i++) {
            if (i>0){
                cal1.getArrList();
                cal1.removeFirstArr();
            }

            cal1.start();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료. 이외의 입력은 계산을 계속합니다.)");
            String yesOrNo = sc.nextLine();
            if (yesOrNo.equals("exit")){
                break;
            }
            System.out.println();
        }
    }
}
