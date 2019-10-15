package abstraceFactory;

/**
 * @ClassName SimpleAbstractFactory
 * @Description 工厂模式---简单工厂类
 * @Author wush
 * @Date 2018/11/30 15:18
 * @Verson 1.0
 **/
public abstract class OperateFactory {

    private Long value1;
    private Long value2;

    public Long getValue1() {
        return value1;
    }

    public void setValue1(Long value1) {
        this.value1 = value1;
    }

    public Long getValue2() {
        return value2;
    }

    public void setValue2(Long value2) {
        this.value2 = value2;
    }

    /*
     * @Description 抽象方法，获取运算结果
     * @param:
     * @return: java.lang.Long
     * @Date 2018/11/30 15:49
     */
    public abstract Long getResult();
}

/**
  *@ClassName OperateFactory
  *@Description 加法运算类
  *@Author wush
  *@Date 2018/11/30 15:57
  *@Verson 1.0
*/
class OperateAdd extends OperateFactory {

    @Override
    public Long getResult() {
        return this.getValue1()+this.getValue2();
    }
}

/**
  *@ClassName OperateFactory
  *@Description 减法运算类
  *@Author wush
  *@Date 2018/11/30 15:59
  *@Verson 1.0
*/
class OperateSub extends OperateFactory {

    @Override
    public Long getResult() {
        return this.getValue1()-this.getValue2();
    }
}

/**
  *@ClassName OperateFactory
  *@Description 乘法运算
  *@Author wush
  *@Date 2018/11/30 16:01
  *@Verson 1.0
*/
class OperateMul extends OperateFactory {

    @Override
    public Long getResult() {
        return this.getValue1() * this.getValue2();
    }
}

/**
  *@ClassName OperateDiv
  *@Description 除法运算
  *@Author wush
  *@Date 2018/11/30 16:02
  *@Verson 1.0
*/
class OperateDiv extends OperateFactory {

    @Override
    public Long getResult() {
        if(this.getValue2() != 0L) {
            return this.getValue1() / this.getValue2();
        }
        throw new IllegalArgumentException("除法分母不能为0");
    }
}

class Test {

    public static void main(String[] args) {
        OperateAdd add = new OperateAdd();
        add.setValue1(10L);
        add.setValue2(20L);
        System.out.println(add.getResult());
    }
}