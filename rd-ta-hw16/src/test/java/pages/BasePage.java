package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import utils.PropertyManager;

public abstract class BasePage {

    protected String pageUrl;
    PropertyManager propertyManager = new PropertyManager();

    public BasePage(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public void openElements() {
        String url = propertyManager.getProperty("APP_URL") ;
        Selenide.open(url);
    }

    public void openWebTables() {
        String url = propertyManager.getProperty("APP_URL2") ;
        Selenide.open(url);
    }

    public String getUrl(){
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }
}
