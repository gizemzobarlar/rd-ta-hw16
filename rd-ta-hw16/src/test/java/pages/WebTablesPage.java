package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class WebTablesPage extends BasePage{

    public SelenideElement clickAddButton = $("#addNewRecordButton");
    public SelenideElement fillNameField = $("#firstName");
    public SelenideElement fillSurnameField = $("#lastName");
    public SelenideElement fillAgeField = $("#age");
    public SelenideElement fillSalaryField = $("#salary");
    public SelenideElement fillDepartmentField = $("#department");
    public SelenideElement clickSubmit = $("#submit");
    public SelenideElement clickEdit = $("span#edit-record-4");
    public SelenideElement enterNewAge = $("#age");


    public WebTablesPage(String pageUrl) {
        super(pageUrl);
    }
}
