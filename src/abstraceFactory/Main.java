package abstraceFactory;

/**
 * @ClassName Main
 * @Description TODO
 * @Author wush
 * @Date 2018/12/3 9:48
 * @Verson 1.0
 */
public class Main {

    public static void main(String[] args) {
        FactoryMethodInterface fmi = new OperateAddFactory();
        OperateFactory operateAdd = fmi.getOperateInstance();
        operateAdd.setValue1(10000L);
        operateAdd.setValue2(2000L);
        System.out.println(operateAdd.getResult());
    }
}
