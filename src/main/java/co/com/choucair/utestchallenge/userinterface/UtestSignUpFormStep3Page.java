package co.com.choucair.utestchallenge.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class UtestSignUpFormStep3Page extends PageObject {

    //Computer device details
    public static final Target LIST_OS = Target.the("Write the Operating System name")
                                            .located(By.xpath("//div[@placeholder='Select OS']"));
    public static final Target DIV_OS = Target.the("Click to select the Operating System")
                                            .located(By.xpath("//div[contains(text(),'Ubuntu')]"));
    public static final Target LIST_OS_VERSION = Target.the("Click to show the Operating System version list")
            .located(By.xpath("//div[@placeholder='Select a Version']"));
    public static final Target DIV_OS_VERSION = Target.the("Click to select the Operating System version")
            .located(By.xpath("//div[contains(text(),'Ubuntu 20.04')]"));
    public static final Target LIST_OS_LANGUAGE = Target.the("Click to show the Operating System language list")
            .located(By.xpath("//div[@placeholder='Select OS language']"));
    public static final Target DIV_OS_LANGUAGE = Target.the("Click to select the Operating System language")
            .located(By.xpath("//div[contains(text(),'English')]"));

    //Mobile device details
    public static final Target LIST_MOBILE_BRAND = Target.the("Click to show the mobile device brand list")
            .located(By.xpath("//div[@placeholder='Select Brand']"));
    public static final Target DIV_MOBILE_BRAND = Target.the("Click to select the mobile device brand")
            .located(By.xpath("//div[contains(text(),'Samsung')]"));
    public static final Target LIST_MOBILE_MODEL = Target.the("Click to show the mobile device model list")
            .located(By.xpath("//div[@placeholder='Select a Model']"));
    public static final Target DIV_MOBILE_MODEL = Target.the("Click to select the mobile device model")
            .located(By.xpath("//div[contains(text(),'Galaxy J7')]"));
    public static final Target LIST_MOBILE_OS = Target.the("Click to show the  mobile device Operating Sytem list")
            .located(By.xpath("//div[@name='handsetOSId']//div[@placeholder='Select OS']"));
    public static final Target DIV_MOBILE_OS = Target.the("Click to select the  mobile device Operating System")
            .located(By.xpath("//div[@id='mobile-device']//div[contains(text(),'Android 8.0')]"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the("Click button to go to step 3 of the form")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
