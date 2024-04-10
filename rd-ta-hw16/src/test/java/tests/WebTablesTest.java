package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WebTablesTest extends BaseTest{


    @Test
    public void WebTablesTest(){
        pageManager.webTablesPage.openWebTables();

    }

    @Test
    public void clickAdd(){
        pageManager.webTablesPage.clickAddButton.click();
        pageManager.webTablesPage.fillNameField.click();
        pageManager.webTablesPage.fillNameField.setValue("Gzm");

        pageManager.webTablesPage.fillSurnameField.click();
        pageManager.webTablesPage.fillSurnameField.setValue("Zor");

        pageManager.webTablesPage.fillAgeField.click();
        pageManager.webTablesPage.fillAgeField.setValue("27");

        pageManager.webTablesPage.fillSalaryField.click();
        pageManager.webTablesPage.fillSalaryField.setValue("1000");

        pageManager.webTablesPage.fillDepartmentField.click();
        pageManager.webTablesPage.fillDepartmentField.setValue("TEST");

        pageManager.webTablesPage.clickSubmit.click();

    }

    @Test
    public void clickEdit(){
        pageManager.webTablesPage.clickEdit.click();
        pageManager.webTablesPage.enterNewAge.click();
        pageManager.webTablesPage.enterNewAge.setValue("25");
        pageManager.webTablesPage.clickSubmit.click();
        String age =pageManager.webTablesPage.enterNewAge.getText();
        assertThat(age).isEqualTo(25);
    }
}
