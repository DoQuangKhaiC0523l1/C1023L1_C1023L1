package BaiThi.Interface;

public class SaleInterfaces {
    public static final String Sales = "//a[@href='https://rise.fairsketch.com/']";
    public static final String Invoices = "//a[@href='https://rise.fairsketch.com/invoices']";
    public static final String addPayment ="//a[@class='btn btn-default mb0'][normalize-space()='Add payment']";
    public static final String bttWrench = "//table[@id='monthly-invoice-table']//tbody/tr[3]//button";
    public static final String bttDelete = "//button/following::ul/li[2]/a";
    public static final String confirmDelete = "//button[@id='confirmDeleteButton']";
}
