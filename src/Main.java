import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Deletable deletable = new Deletable();
        Class clazz = deletable.getClass();
        Method delete = clazz.getDeclaredMethod("delete", String.class);

        delete.invoke(deletable,"s3d4");
    }
}