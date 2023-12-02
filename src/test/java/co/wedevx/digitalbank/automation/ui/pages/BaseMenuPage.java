package co.wedevx.digitalbank.automation.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseMenuPage extends BasePage{

    public BaseMenuPage(WebDriver driver){
        super(driver);
    }
    @FindBy(id="checking-menu")
    protected WebElement checkingMenu;

    @FindBy(id="new-checking-menu-item")
    protected WebElement newCheckingButton;

    @FindBy(id="view-checking-menu-item")
    protected WebElement viewCheckingButton;

    @FindBy(id="home-menu-item")
    protected WebElement homeButton;

    @FindBy(id="savings-menu")
    protected WebElement  savingsMenuButton;

    @FindBy(id="view-savings-menu-item")
    protected WebElement  viewSavingsMenuButton;

    @FindBy(id="new-savings-menu-item")
    protected WebElement  newSavingsMenuButton;

    @FindBy(id="external-accounts-menu")
    protected WebElement  newExternalAccountsMenuButton;

    @FindBy(id="link-external-menu-item")
    protected WebElement linkExternalMenuButton;

    @FindBy(id="view-external-menu-item")
    protected WebElement viewExternalMenuButton;

    @FindBy(id="deposit-menu-item")
    protected WebElement depositMenuButton;

    @FindBy(id="withdraw-menu-item")
    protected WebElement withdrawMenuButton;

    @FindBy(id="transfer-menu-item")
    protected WebElement transferMenuButton;

    @FindBy(id="visa-transfer-menu-item")
    protected WebElement visaTransferMenuButton;

    public void goToHomePage(){
        homeButton.click();
    }
}
