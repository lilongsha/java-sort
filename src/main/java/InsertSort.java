import java.util.ArrayList;

/**
 * @author ALGiii
 */
public class InsertSort extends SortParent{
    private String text;
    private ArrayList<Integer> arr;

    public InsertSort(ArrayList<Integer> arrayList) {
        this.text = "======插入排序======";
        this.arr = arrayList;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String test) {
        this.text = test;
    }

    @Override
    public void sort() {
        long switchTimes = 0;
        long compareTimes = 0;
        for (int i = 1; i < arr.size(); i++) {
            int l = i - 1;
            int l1 = i;
            while (l >= 0) {
                compareTimes++;
                if (arr.get(l1) < arr.get(l)) {
                    switchTimes++;
                    Integer temp = arr.get(l);
                    arr.set(l, arr.get(l1));
                    arr.set(l1, temp);
                    l--;
                    l1--;
                } else {
                    break;
                }

            }
        }
        System.out.println(arr);
        System.out.println("交换次数" + switchTimes);
        System.out.println("比较次数" + compareTimes);
    }

    @Override
    public String call() throws Exception {
        sort();
        return "over";
    }
}
