package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
@FindBy(xpath = "//*[@id='global-nav']/div/div/div[3]/ul/li[1]/a")
WebElement LogInLink;
}
