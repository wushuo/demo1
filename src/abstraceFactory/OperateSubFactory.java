package abstraceFactory;

/**
 * @ClassName OperateSub1
 * @Description TODO
 * @Author wush
 * @Date 2018/12/3 9:43
 * @Verson 1.0
 */
public class OperateSubFactory implements FactoryMethodInterface {

    @Override
    public OperateFactory getOperateInstance() {
        return new OperateSub();
    }
}
