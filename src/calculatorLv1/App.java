package calculatorLv1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while(true) {
            System.out.println("0 이상의 정수를 2개 입력해주세요");
            System.out.print("첫 번째 정수 : ");
            int firNum = sc.nextInt();
            sc.nextLine();
            System.out.print("두 번째 정수 : ");
            int secNum = sc.nextInt();
            sc.nextLine();
            if (firNum < 0 || secNum < 0){
                System.out.println("[[error]]잘못된 값을 입력하셨습니다. 0 이상의 정수를 입력해주세요");
                System.out.println();
                continue;
            }

            System.out.print("연산기호를 입력해주세요( +, -, *, / ) : ");
            char sign = sc.next().charAt(0);
            sc.nextLine();
            System.out.println();

            switch (sign) {
                case ('+'):
                    System.out.println("결과 : " + (firNum+secNum));
                    System.out.println();
                    break;
                case ('-'):
                    System.out.println("결과 : " + (firNum-secNum));
                    System.out.println();
                    break;
                case ('*'):
                    System.out.println("결과 : " + (firNum*secNum));
                    System.out.println();
                    break;
                case ('/'):
                    if (secNum == 0){
                        System.out.println("[[error]]숫자를 0으로 나누는 것은 불가능합니다. 다시 입력해주세요");
                        System.out.println();
                        continue;
                    } else {
                        System.out.println("결과 : " + ((double) firNum/secNum));
                    }
                default:
                    System.out.println("[[error]]잘못 입력하셨습니다. 다시 확인해주세요");
                    System.out.println();
                    break;
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료, 이외의 응답 입력 시 계속 진행) : ");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("exit")){
                break;
            }
            System.out.println();
        }
    }
}
