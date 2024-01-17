package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DraftPage extends BasePage {
    public DraftPage(WebDriver driver) {
        super(driver);
    }

    public WebElement theLastDraftEmail = getWait5().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@class='zA yO'][1]")));
}
