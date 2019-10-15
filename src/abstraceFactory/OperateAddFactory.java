package abstraceFactory;

/**
 * @ClassName OperateAdd
 * @Description TODO
 * @Author wush
 * @Date 2018/12/3 9:41
 * @Verson 1.0
 */
public class OperateAddFactory implements FactoryMethodInterface {

    @Override
    public OperateFactory getOperateInstance() {
        return new OperateAdd();
    }
}
