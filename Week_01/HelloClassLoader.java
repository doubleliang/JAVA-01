import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HelloClassLoader extends ClassLoader {
    public static void main(String[] args) {
        String name = "Hello";
        try {
            Class<?> hello = new HelloClassLoader().findClass(name);
            Method sayHello = hello.getDeclaredMethod("hello");
            sayHello.invoke(hello.newInstance());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Class<?> findClass(String name) {
        byte[] bytes = new byte[0];
        try {
            bytes = readByName(name);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return defineClass(name, bytes, 0, bytes.length);
    }

    private byte[] readByName(String name) throws IOException {
        InputStream inputStream = new FileInputStream(String.format("./%s.xlass", name));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int byteValue;
        while ((byteValue = inputStream.read()) != -1) {
            outputStream.write(255 - byteValue);
        }

        return outputStream.toByteArray();
    }


}