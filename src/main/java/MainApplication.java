import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutionException;

public class MainApplication {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j = 0; j < 10000; j++) {
            Random random = new Random();
            int i = random.nextInt(10000);
            arr.add(i);
        }
        Object clone = arr.clone();
        ArrayList<?> objects = clone instanceof ArrayList ? (ArrayList<?>) clone : null;
        assert objects != null;
        RunSort bubbling = new RunSort(new BubblingSort((ArrayListConvertUtils.convert(objects, Integer.class))));
        bubbling.run();
        RunSort select = new RunSort(new SelectSort((ArrayListConvertUtils.convert(objects, Integer.class))));
        select.run();
        RunSort insert = new RunSort(new InsertSort((ArrayListConvertUtils.convert(objects, Integer.class))));
        insert.run();
        RunSort merge = new RunSort(new MergeSort((ArrayListConvertUtils.convert(objects, Integer.class))));
        merge.run();
    }
}
