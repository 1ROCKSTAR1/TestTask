package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LettersPage extends BasePage {

    public LettersPage(WebDriver driver) {
        super(driver);
    }

    public WebElement incomingMailsTitle = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-tooltip='Входящие']")));
    public WebElement writeTheLetter = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='T-I T-I-KE L3']")));
}
