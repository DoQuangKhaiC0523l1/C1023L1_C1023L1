package BaiThi.Interface;

public class AddPaymentInterfaces {
    public static final String CBB_PAYMENTMETHOD = "//label[normalize-space()='Payment method']/following::div/div/a";
    public static final String OPTION_PAYMENTMETHOD = "//DIV[@id='select2-drop']/ul/li[normalize-space()='Cash']";
    public static final String TXB_PAYMENTDATE = "//LABEL[contains(.,'Payment date')]/following::div/input";
    public static final String TXB_AMOUNT = "//LABEL[contains(.,'Amount')]/following::div/input";
    public static final String TXA_NOTECLICK1 = "//label[contains(.,'Note')]/following::textarea";
    public static final String TXA_NOTECLICK = "//label[contains(.,'Note')]/following::textarea/following::div/textarea/following::div";
    public static final String TXA_NOTE = "//label[contains(.,'Note')]/following::textarea/following::div/textarea";
    public static final String BTN_SAVE = "//button[normalize-space()='Save']";
}
