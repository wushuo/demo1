package proxy;

/**
 * @ClassName RealObject
 * @Description 目标类
 * @Author wush
 * @Date 2018/12/7 10:03
 * @Verson 1.0
 */
public class RealObject implements AbstractObject {

    @Override
    public void visitor() {
        System.out.println("HI MAN");
    }
}
