package enumTest;

/**
 * Created by simpletour_Jenkin on 2015/12/5.
 */
public class AbstractEnum implements IError{
    private String name;
    private String value;
    private String ns;

    public AbstractEnum(){}

    public AbstractEnum(String name, String value,String ns){
        this.name = name;
        this.value = value;
        this.ns = ns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    @Override
    public String getNamespace() {
        return ns;
    }

    @Override
    public String getErrorCode() {
        return name;
    }

    @Override
    public String getErrorMessage() {
        return value;
    }
}
