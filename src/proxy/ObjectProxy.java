package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName ObjectProxy
 * @Description 代理类
 * @Author wush
 * @Date 2018/12/7 10:06
 * @Verson 1.0
 */
public class ObjectProxy implements InvocationHandler {

    private Object object;

    public ObjectProxy(Object object) {
        this.object = object;
    }

    /*
     * @Description
     * @param: [proxy, method, obj]
     * @return: java.lang.Object
     * @Date 2018/12/7 10:10
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] obj) throws Throwable {
        return method.invoke(object, obj);
    }
}
