package abstraceFactory;

/**
  *@ClassName FactoryMethodInterface
  *@Description 抽象产品工厂类，定义创建具体工厂类的接口
  *@Author wush
  *@Date 2018/12/3 9:37
  *@Verson 1.0
*/
public interface FactoryMethodInterface {
    /**
     * @Description 操作对象实例
     * @param: []
     * @return: abstraceFactory.OperateFactory
     * @Date 2018/12/3 9:39
     */
    public OperateFactory getOperateInstance();
}
