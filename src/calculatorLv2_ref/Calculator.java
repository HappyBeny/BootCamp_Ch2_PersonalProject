package calculatorLv2_ref;

import java.util.Scanner;

public class Calculator {
    private OperationManager opManager;
    private Checker checker;
    private HistoryManager resultSaver;
    Scanner sc = new Scanner(System.in);


    public void operating(){
        System.out.println("계산을 시작합니다. 정수 - 연산자 - 정수를 순서대로 입력해주세요");
        System.out.print("첫 번째 정수를 입력해주세요(0 이상의 정수를 입력해주세요) : ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("연산자를 입력해주세요( +, -, *, / ) : ");
        char sign = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("두 번째 정수를 입력해주세요(0 이상의 정수를 입력해주세요) : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (sign){
            case ('+'):
                opManager = new Add();
            case ('-'):
                opManager = new Sub();
            case ('*'):
                opManager = new Multiply();
            case ('/'):
                opManager = new Divide();
        }

        opManager.calculate(num1, num2);
    }

    public void save(){

    }

    public void check(){

    }
}
