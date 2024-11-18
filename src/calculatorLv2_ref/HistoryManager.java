package calculatorLv2_ref;

import java.util.ArrayList;

public class HistoryManager {
    private ArrayList list = new ArrayList();


    public void setList(double a) {
        list.add(a);
    }

    public void getList() {
        System.out.println(list);
    }

    public void delete() {
        list.remove(0);
    }
}
