import java.lang.reflect.*;

public class ReflectionDemo {
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("ReflectionDemo");
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
        }
        Object obj = cls.getDeclaredConstructor().newInstance();
        Method sayHello = cls.getDeclaredMethod("sayHello", String.class);
        sayHello.invoke(obj, "ChatGPT");
    }
}
