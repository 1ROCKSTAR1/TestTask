package Test;

import Base.BaseTest;
import Page.*;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void firstScenarioTest() throws InterruptedException {

        Allure.step("Авторизация");
        MainPage mainPage = new MainPage(getDriver());
        mainPage.enterButton.click();

        EnterPage enterPage = new EnterPage(getDriver());
        enterPage.enterYourEmailField.sendKeys(LOGIN);
        enterPage.nextButton.click();

        PassPage passPage = new PassPage(getDriver());
        passPage.enterYourPass.sendKeys(PASS);
        passPage.nextButton2.click();

        AfterAutorizationPage afterAutorizationPage = new AfterAutorizationPage(getDriver());
        afterAutorizationPage.emailButton.click();

        Allure.step("Переход на страницу \"Входящие\"");
        LettersPage lettersPage = new LettersPage(getDriver());

        Allure.step("Проверка перехода");
        Assert.assertTrue(lettersPage.incomingMailsTitle.isDisplayed());

        lettersPage.writeTheLetter.click();

        Allure.step("Создание нового письма");
        NewLetterPage newLetterPage = new NewLetterPage(getDriver());
        newLetterPage.recipientField.sendKeys("elrockstar25@gmail.com");
        newLetterPage.topicField.sendKeys("task");
        newLetterPage.messageField.sendKeys("hello");
        Thread.sleep(3000);

        newLetterPage.draftTitle.click();

        Allure.step("Проверка сохранения черновика");
        DraftPage draftPage = new DraftPage(getDriver());
        Assert.assertEquals(draftPage.theLastDraftEmail.getText(),"task - hello");

    }
}
