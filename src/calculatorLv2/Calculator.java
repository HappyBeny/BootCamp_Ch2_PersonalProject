package calculatorLv2;

import java.util.Scanner;

public class Calculator {
    private OperationManager opManager;
    private Checker checker = new Checker();
    private final HistoryManager resultSavor = new HistoryManager();
    Scanner sc = new Scanner(System.in);

    public void start() {
        while (true){
            System.out.println("원하시는 작업의 숫자를 입력해주세요.");
            System.out.println("1. 계산하기   2. 계산 히스토리 확인   3. 계산 히스토리 삭제   4. 계산기 종료");
            System.out.print("입력 : ");
            char num = sc.next().charAt(0);
            System.out.println();

            if (num == '1') {
                operating();
            } else if (num == '2') {
                getList();
            } else if (num == '3') {
                delete();
            } else if (num == '4') {
                break;
            } else {
                System.out.println("[[error]] 잘못된 숫자를 입력하셨습니다. 다시 입력해주세요");
                System.out.println();
            }
        }
    }


    public void operating(){
        try {
            System.out.println("계산을 시작합니다. 정수 - 연산자 - 정수를 순서대로 입력해주세요");
            sc.nextLine();
            System.out.print("첫 번째 정수를 입력해주세요(0 이상의 정수를 입력해주세요) : ");
            String input = sc.nextLine();
            int num1 = Integer.parseInt(input);
            System.out.print("연산자를 입력해주세요( +, -, *, / ) : ");
            char sign = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("두 번째 정수를 입력해주세요(0 이상의 정수를 입력해주세요) : ");
            input = sc.nextLine();
            int num2 = Integer.parseInt(input);
            System.out.println();

            if (num1 < 0 || num2 < 0){
                System.out.println("[[error]] 음수를 받지 않습니다. 0 이상의 정수를 입력해주세요.");
                System.out.println();
                return;
            }

            switch (sign) {
                case ('+'):
                    opManager = new Add();
                    break;
                case ('-'):
                    opManager = new Sub();
                    break;
                case ('*'):
                    opManager = new Multiply();
                    break;
                case ('/'):
                    opManager = new Divide();
                    break;
                default:
                    System.out.println("[[error]] 유효하지 않은 연산자입니다.");
                    System.out.println();
                    return;
            }

            if (sign == '+' || sign == '-' || sign == '*' || sign == '/') {
                double result = opManager.calculate(num1, num2);
                if (result == Double.POSITIVE_INFINITY){
                    throw new ArithmeticException();
                }
                String resultStr = num1 + " " + sign + " " + num2 + " = " + result;
                save(resultStr);
                System.out.println("결과 : " + resultStr);
                System.out.println();
            }

        } catch (Exception e){
            check(e);
        }

    }

    public void check(Exception e){
        checker.check(e);
    }

    public void save(String a){
        resultSavor.setList(a);
    }

    private void delete() {
        resultSavor.delete();
        System.out.println("가장 오래된 기록이 1개 삭제되었습니다.");
        System.out.println();
    }

    private void getList() {
        resultSavor.getList();
        System.out.println();
    }
}
