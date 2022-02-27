import java.util.ArrayList;

/**
 * @author ALGiii
 */
public class BubblingSort extends SortParent{
    private String text;
    private ArrayList<Integer> arr;

    public BubblingSort(ArrayList<Integer> arrayList) {
        this.text = "======冒泡排序======";
        this.arr = arrayList;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void sort() {
        long switchTimes = 0;
        long compareTimes = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                compareTimes++;
                if (arr.get(i) > arr.get(j)) {
                    Integer temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                    switchTimes++;
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
