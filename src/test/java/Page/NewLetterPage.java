package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewLetterPage extends BasePage {

    public NewLetterPage(WebDriver driver) {
        super(driver);
    }

    public WebElement recipientField = getWait5().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@tabindex='1'][.='Получатели']")));
    public WebElement topicField = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Тема']")));
    public WebElement messageField = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Текст письма']")));
    public WebElement draftTitle = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-tooltip='Черновики']")));

}
