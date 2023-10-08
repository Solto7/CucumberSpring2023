package org.example.pages;

import org.example.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {

    public TextBoxPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "userName-label")
    public WebElement fullNameText;
}
