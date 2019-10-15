package abstraceFactory;

/**
 * @ClassName OperateDivFactory
 * @Description TODO
 * @Author wush
 * @Date 2018/12/3 9:46
 * @Verson 1.0
 */
public class OperateDivFactory implements FactoryMethodInterface {
    @Override
    public OperateFactory getOperateInstance() {
        return new OperateDiv();
    }
}
