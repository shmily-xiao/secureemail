package enumTest;

/**
 * Created by simpletour_Jenkin on 2015/12/5.
 */
public enum OspError {

    EMPTY_OSP_NAME("0000", "Empty osp name");

    protected static final String ns = "RES.OSP";
    protected String errorCode;
    protected String errorMessage;

    private OspError(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
    public String getNamespace() {
        return ns;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public static void main(String args[]){
        OspError.EMPTY_OSP_NAME.getErrorCode();
    }
}
