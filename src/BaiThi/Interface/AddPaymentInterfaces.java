package BaiThi.Interface;

public class AddPaymentInterfaces {
    public static final String clickInvoice = "//div[@id='s2id_invoice_id']";
    public static final String cbbInvoice ="//div[@id='select2-drop']//input";
    public static final String clickPaymentMethod = "//label[text()='Payment method']/following::div//div";
    public static final String cbbPaymentMethod = "//div[@id='select2-drop']//input";
    public static final String inputPayment = "//input[@name='invoice_payment_date']";
    public static final String cbbPaymentDate = "//td[@class='active day']";
    public static final String txbAmount = "//input[@id='invoice_payment_amount']";
    public static final String txbNote = "//textarea[@id='invoice_payment_note']";
    public static final String bttSave = "//button[normalize-space()='Save']";
}
