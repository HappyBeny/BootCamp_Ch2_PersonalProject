package calculatorLv2;

import java.util.ArrayList;

public class HistoryManager {
    private ArrayList list = new ArrayList();


    public void setList(String a) {
        list.add(a);
    }

    public void getList() {
        for (int i = 0; i < list.size(); i++){
            System.out.println((i+1) + " : " + list.get(i));
        }
    }

    public void delete() {
        list.remove(0);
    }
}
