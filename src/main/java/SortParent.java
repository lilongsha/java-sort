import java.util.ArrayList;
import java.util.concurrent.Callable;

/**
 * @author ALGiii
 */
public abstract class SortParent implements Callable<String> {
    private String text;

    /**
     * @return 返回指定输出字符
     */
    public abstract String getText();

    /**
     * @param text 设置输出字符
     */
    public abstract void setText(String text);

    public abstract void sort();
}
