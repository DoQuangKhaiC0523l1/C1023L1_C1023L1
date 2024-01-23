package BaiThi.Interface;

public class AddInvoiceInterface {
    public static final String TXB_BILLDATE = "//input[@id='invoice_bill_date']";
    public static final String TXB_DUADATE = "//input[@id='invoice_due_date']";
    public static final String CBB_CLIENT= "//label[normalize-space()='%s']/following-sibling::div//a";
    public static final String OPTION_CLIENT = "//div[@id='select2-drop']//li[contains(.,'%s')]";
    public static final String CBB_PROJECT = "//label[normalize-space()='%s']/following-sibling::div//a";
    public static final String OPTION_PROJECT = "//div[@id='select2-drop']//li[contains(.,'%s')]";
    public static final String CBB_TAX = "//label[normalize-space()='%s']/following-sibling::div//a";
    public static final String OPTION_TAX = "//div[@id='select2-drop']//li[contains(.,'%s')]";
    public static final String CBB_SECONDTAX = "//label[normalize-space()='%s']/following-sibling::div//a";
    public static final String OPTION_SECONDTAX = "//div[@id='select2-drop']//li[contains(.,'%s')]";
    public static final String CBB_TDS = "//label[normalize-space()='%s']/following-sibling::div//a";
    public static final String OPTION_TDS = "//div[@id='select2-drop']//li[contains(.,'%s')]";
    public static final String CXB_RECURRING = "//label[normalize-space()='Recurring']/following-sibling::div/input";
    public static final String TXB_REPEATEVERY = "//INPUT[@NAME='repeat_every']";
    public static final String CBB_TIME = "//div[@id='s2id_repeat_type']/a";
    public static final String OPTION_TIME = "//DIV[@id='select2-drop']/ul/li[contains(.,'%s')]";
    public static final String TXB_CYCLE = "//INPUT[@name='no_of_cycles']";
    public static final String TXA_NOTE = "//textarea[@id='invoice_note']";
    public static final String BTN_SAVE = "//button[normalize-space()='Save']";
}
