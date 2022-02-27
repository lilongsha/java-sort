import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author ALGiii
 */
public record  RunSort(SortParent sort) {

    public void run() throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(sort);
        Thread thread = new Thread(task);
        System.out.println(sort.getText());
        long start = System.currentTimeMillis();
        thread.start();
        task.get();
        long end = System.currentTimeMillis();
        System.out.println("共用时" + (end - start) + "毫秒");
    }
}
