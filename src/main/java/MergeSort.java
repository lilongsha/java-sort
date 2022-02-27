import java.util.ArrayList;
import java.util.List;

/**
 * @author ALGiii
 */
public class MergeSort extends SortParent{
    private String text;
    private ArrayList<Integer> arr;
    private long switchTimes;
    private long compareTimes;

    public MergeSort(ArrayList<Integer> arrayList) {
        this.text = "======插入排序======";
        this.arr = arrayList;
        this.switchTimes = 0;
        this.compareTimes = 0;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    public long getSwitchTimes() {
        return switchTimes;
    }

    public void setSwitchTimes(long switchTimes) {
        this.switchTimes = switchTimes;
    }

    public long getCompareTimes() {
        return compareTimes;
    }

    public void setCompareTimes(long compareTimes) {
        this.compareTimes = compareTimes;
    }

    @Override
    public void sort() {
        ArrayList<Integer> merge = merge(arr, 0, arr.size() - 1);
        System.out.println(merge);
        System.out.println("合并次数" + switchTimes);
        System.out.println("比较次数" + compareTimes);
    }

    private ArrayList<Integer> merge(ArrayList<Integer> arrayList, int l, int h) {
        if (l == h) {
            return new ArrayList<>(List.of(arrayList.get(l)));
        }
        // 找中间分
        int mid = l + (h - l) / 2;
        ArrayList<Integer> leftArrayList = merge(arrayList, l, mid);
        ArrayList<Integer> rightArrayList = merge(arrayList, mid + 1, h);
        int index1 = 0;
        int index2 = 0;
        ArrayList<Integer> newArrayList = new ArrayList<>();
        while (index1 < leftArrayList.size() && index2 < rightArrayList.size()) {
            compareTimes++;
            switchTimes++;
            newArrayList.add(leftArrayList.get(index1) < rightArrayList.get(index2) ? leftArrayList.get(index1++) : rightArrayList.get(index2++));
        }
        if (index1 < leftArrayList.size()) {
            for (int i = index1; i < leftArrayList.size(); i++) {
                newArrayList.add(leftArrayList.get(i));
                switchTimes++;
            }
        }
        if (index2 < leftArrayList.size()) {
            for (int i = index2; i < rightArrayList.size(); i++) {
                newArrayList.add(rightArrayList.get(i));
                switchTimes++;
            }
        }
        return newArrayList;
    }

    @Override
    public String call() throws Exception {
        sort();
        return "over";
    }
}
