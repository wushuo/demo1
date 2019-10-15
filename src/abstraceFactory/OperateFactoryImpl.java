package abstraceFactory;

/**
 * @ClassName OperateFactoryImpl
 * @Description 抽象工厂实现类
 * @Author wush
 * @Date 2018/11/30 16:10
 * @Verson 1.0
 */
public class OperateFactoryImpl {

    public static OperateFactory getInstance(String pattern) {

        OperateFactory operateFactory;
        switch (pattern) {
            case "+":
                operateFactory = new OperateAdd();
                break;
            case "-":
                operateFactory = new OperateSub();
                break;
            case "*":
                operateFactory = new OperateMul();
                break;
            case "/":
                operateFactory = new OperateDiv();
                break;
            default:
                throw new UnsupportedOperationException("不支持该操作");
        }
        return operateFactory;
    }

    public static void main(String[] args) {
        OperateFactory operateFactory = OperateFactoryImpl.getInstance("/");
        operateFactory.setValue1(100L);
        operateFactory.setValue2(200L);
        System.out.println(operateFactory.getResult());
    }
}
