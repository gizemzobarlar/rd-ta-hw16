package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ElementsPage extends BasePage{

    public SelenideElement clickButtons = $("#item-4");
    public SelenideElement clickClickMeButton = $("button#zSR5C");
    public SelenideElement readClickMeText = $("#dynamicClickMessage");


    public ElementsPage(String pageUrl) {
        super(pageUrl);
    }






}
