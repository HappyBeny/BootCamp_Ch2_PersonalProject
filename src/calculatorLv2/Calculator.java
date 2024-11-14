package calculatorLv2;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Double> arrList = new ArrayList<>();


    public double calculate(int firNum, int secNum, char sign){
        double result = 0;
        switch (sign){
            case '+':
                result = firNum + secNum;
                setArrList(result);
                break;
            case '-':
                result = firNum - secNum;
                break;
            case '*':
                result = firNum - secNum;
                setArrList(result);
                break;
            case '/':
                if (secNum == 0) {
                    System.out.println("숫자를 0으로 나누는 것은 불가능합니다. 다시 입력해주세요");
                    break;
                }
                result = (double) firNum / secNum;
                setArrList(result);
                break;
        }
        return result;
    }

    private void setArrList(double i) {
        arrList.add(i);
    }
}

