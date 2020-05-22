//xpath's of elements are added here. For Example an element below.
package com.sample.pages;

import com.sample.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {

    private WebDriver driver;

    public Elements() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(), 'Gmail')]")
    public WebElement gmail;
}
