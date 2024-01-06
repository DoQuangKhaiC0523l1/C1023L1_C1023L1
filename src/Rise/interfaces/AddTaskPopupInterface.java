package Rise.interfaces;

public class AddTaskPopupInterface {
    public static final String txbTitle="//input[@id='title']";
    public static final String txbDescription="//textarea[@id='description']";
    public static final String clickRelate = "//div[@id='s2id_task-context']";
    public static final String cbbRelated ="//div[@id='select2-drop']//div[text()='Client']";
    public static final String clickClient="//label[@for='client_id']/following::div";
    public static final String searchClient="//div[@id='select2-drop']//input";
    public static final String client="//div[text()='Demo Client']";
    public static final String clickPoints = "//div[@id='s2id_autogen18']//a";
    public static final String cbbPoints="//div[@id='select2-drop']//div[text()='2 Points']";
    public static final String clickAssign="//div[@id='s2id_assigned_to']";
    public static final String cbbAssign = "//div[@id='select2-drop']//div[text()='John Doe']";
    public static final String clickCollaborators="//div[@id='s2id_collaborators']";
    public static final String cbbCollaborators="//div[@id='select2-drop']//div[text()='Mark Thomas']";
    public static final String clickStatus="//div[@id='s2id_task_status_id']";
    public static final String cbbStatus="//div[@id='select2-drop']//div[text()='In progress']";
    public static final  String clickPriority="//div[@id='s2id_priority_id']";
    public static final String cbbPriority="//div[@id='select2-drop']//div[text()='Major']";
    public static final String clickLabel="//div[@id='s2id_project_labels']";
    public static final String cbbLabel="//div[@id='select2-drop']//div[text()='Bug']";
    public static final String clickStartDate="//input[@id='start_date']";
    public static final String StartDate="//input[@id='start_date']";
    public static final String clickDeadline = "//input[@name='deadline']";
    public static final String Deadline = "//input[@id='deadline']";
    public static final String cxbRecurring="//input[@name='recurring']";
    public static final String txbRepeatEvery = "//input[@id='repeat_every']";
    public static final String clickTime = "//div[@id='s2id_repeat_type']";
    public static final String Time = "//div[@id='select2-drop']//div[text()='Year(s)']";
    public static final String Cycles = "//input[@name='no_of_cycles']";
    public static final String bttSave = "//button[@type='submit']";
}
