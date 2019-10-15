package abstraceFactory;

/**
 * @ClassName OperateMul1
 * @Description TODO
 * @Author wush
 * @Date 2018/12/3 9:44
 * @Verson 1.0
 */
public class OperateMulFactory implements FactoryMethodInterface {

    @Override
    public OperateFactory getOperateInstance() {
        return new OperateMul();
    }
}
