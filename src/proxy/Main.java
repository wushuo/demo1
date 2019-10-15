package proxy;

import java.lang.reflect.Array;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Main
 * @Description TODO
 * @Author wush
 * @Date 2018/12/7 10:12
 * @Verson 1.0
 */
public class Main {

    public static void main(String[] args) {
        final List<RealObject> realObjects = Arrays.asList();
        AbstractObject realObject = new RealObject();
        ObjectProxy proxy = new ObjectProxy(realObject);
        ClassLoader classLoader = realObject.getClass().getClassLoader();
        AbstractObject abstractObject = (AbstractObject) Proxy.newProxyInstance(classLoader, new Class[]{AbstractObject.class}, proxy);
        abstractObject.visitor();
    }
}
