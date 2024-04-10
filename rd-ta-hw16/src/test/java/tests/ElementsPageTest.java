package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ElementsPageTest extends BaseTest{

    @BeforeMethod
    public void before(){
        pageManager.elementsPage.openElements();
    }

    @Test
    public void clickButtons(){
        pageManager.elementsPage.clickButtons.click();
        pageManager.elementsPage.clickClickMeButton.click();
        pageManager.elementsPage.readClickMeText.click();
        String Text = pageManager.elementsPage.readClickMeText.getText();
        assertThat(Text).isEqualTo("You have done a dynamic click");
    }
}
