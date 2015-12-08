package enumTest;

/**
 * Created by simpletour_Jenkin on 2015/12/5.
 */
public class SimpletourEnum {

    //AbstractEnum 这个不是抽象类，不应该这样取名字
    public static AbstractEnum EMPTY_OSP_NAME = new AbstractEnum("00001","i am dying for you","RES.OP");
    public static AbstractEnum EMPTY_OSP_NAME_1 = new AbstractEnum("00002","i am happy to see you","RES.OP");

    public SimpletourEnum(){}

    public static void main(String args[]){
        System.out.println(SimpletourEnum.EMPTY_OSP_NAME.getErrorCode());
        System.out.println(SimpletourEnum.EMPTY_OSP_NAME.getErrorMessage());
        System.out.println(SimpletourEnum.EMPTY_OSP_NAME.getNamespace());

        System.out.println(SimpletourEnum.EMPTY_OSP_NAME_1.getName());
        System.out.println(SimpletourEnum.EMPTY_OSP_NAME_1.getValue());

    }
}
