package calculatorLv2_ref;

public class Calculator {
    Operator operator;
    Checker checker;

    public Calculator(){
        this.operator = new Operator() {
            @Override
            public double calculate() {
                return 0;
            }
        };

        this.checker = new Checker();
    }
}
