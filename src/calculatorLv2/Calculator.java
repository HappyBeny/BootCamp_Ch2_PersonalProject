package calculatorLv2;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);
    private final ArrayList<Double> arrList = new ArrayList<>();

    public void start() {
        for (;;) {
            try{
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
                System.out.print("연산자를 입력하세요( +, -, *, / ) : ");
                char sign = sc.next().charAt(0);
                sc.nextLine();
                System.out.println();

                if (secNum == 0 && sign == '/'){
                    System.out.println("숫자를 0으로 나누는 것은 불가능합니다. 다시 입력해주세요");
                    System.out.println();
                    continue;
                }

                //기호 검증 및 계산
                if (sign == '+' || sign == '-' || sign == '*' || sign == '/'){
                    double result = calculate(finNum,secNum,sign);
                    System.out.println("<<<<< 계산을 시작합니다 >>>>>");
                    System.out.println("결과 : " + result);
                    System.out.println();
                    break;
                } else  {
                    System.out.println("[[error]] 잘못된 연산자를 입력하셨습니다. +, -, *, / 중에 입력해주세요.");
                    System.out.println();
                }
            } catch (Exception e) {
                System.out.println("잘못된 값을 입력하셨습니다. 다시 확인해주세요");
                sc.nextLine();
                System.out.println();
            }
        }
    }

    public double calculate(int firNum, int secNum, char sign){
        double result = 0;
        switch (sign){
            case '+':
                result = firNum + secNum;
                setArrList(result);
                break;
            case '-':
                result = firNum - secNum;
                setArrList(result);
                break;
            case '*':
                result = firNum * secNum;
                setArrList(result);
                break;
            case '/':
                result = (double) firNum / secNum;
                setArrList(result);
                break;
        }
        return result;
    }

    private void setArrList(double i) {
        arrList.add(i);
    }

    public void getArrList() {
        while (true) {
            System.out.print("현재까지 저장된 결과를 확인하시겠습니까? Y / N : ");
            char get = sc.next().charAt(0);
            sc.nextLine();

            if (get == 'Y') {
                System.out.println(arrList);
                break;
            } else if (get == 'N') {
                break;
            } else {
                System.out.println("[[error]] 잘못된 값을 입력하셨습니다. 다시 시도해주세요.");
                System.out.println();
            }
        }
        System.out.println();
    }

    public void removeFirstArr() {
        while (true) {
            System.out.print("가장 오래된 결과값을 삭제하시겠습니까? Y / N : ");
            char delete = sc.next().charAt(0);
            sc.nextLine();
            if (delete == 'Y'){
                arrList.remove(0);
                getArrList();
                break;
            } else if (delete == 'N') {
                break;
            } else {
                System.out.println("[[error]] 잘못된 값을 입력하셨습니다. 다시 시도해주세요.");
                System.out.println();
            }
        }
        System.out.println();
    }
}

