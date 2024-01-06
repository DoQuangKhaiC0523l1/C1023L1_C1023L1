package Rise.interfaces;

public class TaskPageInterfaces {
    public static final String ClickTask = "//a[@href='https://rise.fairsketch.com/tasks/all_tasks']";
    public static final String ClickAddTask ="//a[@class='btn btn-default'][normalize-space()='Add task']";
    public static final String TitleTask ="//h4[normalize-space()='Tasks']";
    public static final String fieldSearch = "//div[@id='task-table_filter']//input";
    public static final String newTile = "//tr[@class='odd']//td[2]//a";
    public static final String fieldComment="//textarea[@id='comment_description']";

}
