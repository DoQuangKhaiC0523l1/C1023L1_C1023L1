package BaiThi.Interface;

public class SaleInterfaces {
    public static final String BTN_SALES = "//a[@href='https://rise.fairsketch.com/']";
    public static final String BTN_INVOICES = "//a[@href='https://rise.fairsketch.com/invoices']";
    public static final String BTN_ADDINVOICE = "//a[@title='Add invoice']";
    public static final String BTN_ADDPAYMENT ="//a[normalize-space()='Add payment']";
    public static final String BTN_RECURRING = "//a[normalize-space()='Recurring']";
    public static final String DETAIL_INVOICE = "//table[@id='recurring-invoice-table']//td/a[1]";
    public static final String BTN_PAYMENT = "//ul[@id='invoice-tabs']//a[contains(.,'Payment')]";
    public static final String BTN_DELETE = "//table[@id='invoice-payment-table']//td/a/following::a[1]";

}
