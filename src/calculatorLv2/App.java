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
                while (true) {
                    System.out.println("가장 오래된 결과값을 삭제하시겠습니까? Y / N : ");
                    char delete = sc.next().charAt(0);
                    sc.nextLine();
                    if (delete == 'Y'){
                        cal1.deleteFirstArr();
                        break;
                    } else if (delete == 'N') {
                        break;
                    } else {
                        System.out.println("잘봇된 값을 입력하셨습니다. 다시 시도해주세요.");
                        continue;
                    }
                }
                System.out.println();

                while (true) {
                    System.out.print("현재까지 저장된 결과를 확인하시겠습니까? Y / N : ");
                    char get = sc.next().charAt(0);
                    sc.nextLine();

                    if (get == 'Y') {
                        System.out.println(cal1.getArrList());
                        break;
                    } else if (get == 'N') {
                        break;
                    } else {
                        System.out.println("잘못된 값을 입력하셨습니다. 다시 시도해주세요.");
                        break;
                    }
                }
                System.out.println();
            }


            System.out.println("<<<<< 계산을 시작합니다 >>>>>");
            System.out.println("0 이상의 정수를 입력해주세요");
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int finNum = sc.nextInt();
            sc.nextLine();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int secNum = sc.nextInt();
            sc.nextLine();

            //숫자 검증
            if (finNum < 0 || secNum < 0) {
                System.out.println("[[error]] 잘못된 숫자를 입력하셨습니다. 0 이상의 정수를 입력해주세요");
                System.out.println();
                continue;
            }

            //기호 받기
            System.out.print("사칙연산 기호를 입력하세요( +, -, *, / ) : ");
            char sign = sc.next().charAt(0);
            sc.nextLine();
            System.out.println();

            //기호 검증 및 계산
            if (sign == '+' || sign == '-' || sign == '*' || sign == '/'){
                result = cal1.calculate(finNum,secNum,sign);
                System.out.println("결과 : " + result);
                System.out.println();
            } else  {
                System.out.println("[[error]] 잘못된 기호를 입력하셨습니다. +, -, *, / 중에 입력해주세요.");
                continue;
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료. 이외의 입력은 계산을 계속합니다.)");
            String yesOrNo = sc.nextLine();
            if (yesOrNo.equals("exit")){
                break;
            }
            System.out.println();
        }
    }
}
