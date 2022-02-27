import java.util.ArrayList;

/**
 * @author ALGiii
 */
public class ArrayListConvertUtils {
    public static  <T> ArrayList<T> convert(ArrayList<?> arrayList, Class<T> clazz) {
        ArrayList<T> result = new ArrayList<>();
        arrayList.forEach(array -> {
            if (clazz == array.getClass()) {
                result.add(clazz.cast(array));
            }
        });
        return result;
    }
}
