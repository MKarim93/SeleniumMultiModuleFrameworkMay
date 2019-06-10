package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {

    @FindBy(xpath = ("//*[@id='/our-products/']"))
    WebElement OurProducts;

    @FindBy(xpath = ("//*[@id='/ride/']/div/span"))
    WebElement OurCompany;

    @FindBy(xpath = ("//*[@id='/safety/']/div/span"))
    WebElement Safety;

    @FindBy(xpath = ("//*[@id='https://help.uber.com/']/div/span"))
    WebElement Help;

    @FindBy(xpath = ("//*[@id=/'languages/']/div"))
    WebElement Language;

    @FindBy(xpath = ("//*[@id=/'/u/rewards//']/div/span"))
    WebElement Rewards;

    @FindBy(xpath = ("//*[@id=/'/ride/how-it-works/uber-cash//']/div/span"))
    WebElement Pay;

    @FindBy(xpath = ("//*[@id=/'/sign-in//']/div/span"))
    WebElement LogIn;

    @FindBy(xpath = ("//*[@id=/'/signup//']"))
    WebElement SignUp;

    @FindBy(xpath = ("//*[@id=/'0/']/div/div/span"))
    WebElement Earn;

    @FindBy(xpath = ("//*[@id=/'1/']/div/div/span"))
    WebElement Ride;

    @FindBy(xpath = ("//*[@id=/'2/']/div/div/span"))
    WebElement Eat;

    @FindBy(xpath = ("//*[@id=/'3/']/div/div/span"))
    WebElement Freight;

    @FindBy(xpath = ("//*[@id=/'4/']/div/div/span"))
    WebElement Business;

    @FindBy(xpath = ("//*[@id=/'5/']/div/div/span"))
    WebElement Transit;

    @FindBy(xpath = ("//*[@id=/'6/']/div/div/span"))
    WebElement Bike;

    @FindBy(xpath = ("//*[@id=/'7/']/div/div/span"))
    WebElement Fly;

    @FindBy(linkText = ("Newsroom"))
    WebElement Newsroom;

    @FindBy(linkText = ("Investor relations"))
    WebElement Investor_relations;

    @FindBy(linkText = ("Global citizenship"))
    WebElement Global_citizenship;

    @FindBy(linkText = ("Blog"))
    WebElement Blog;

    @FindBy(linkText = ("Careers"))
    WebElement Careers;

    @FindBy(linkText = ("Gift cards"))
    WebElement Gift_cards;

    @FindBy(linkText = ("Uber vs. driving jobs"))
    WebElement Uber_V_drivingJobs;

    @FindBy(linkText = ("Advanced Technologies Group"))
    WebElement AdvancedTechnologiesGroup;

    public void setOurProducts() {
        OurProducts.click();
    }

    public void setOurCompany() {
        OurCompany.click();
    }

    public void setSafety() {
        Safety.click();
    }

    public void setHelp() {
        Help.click();
    }

    public void setLanguage() {
        Language.click();
    }

    public void setRewards() {
        Rewards.click();
    }

    public void setPay() {
        Pay.click();
    }

    public void setLogIn() {
        LogIn.click();
    }

    public void setSignUp() {
        SignUp.click();
    }

    public void setEarn(){
        Earn.click();
    }

    public void setRide(){
        Ride.click();
    }

    public void setEat(){
        Eat.click();
    }

    public void setFreight(){
        Freight.click();
    }

    public void setBusiness(){
        Business.click();
    }

    public void setTransit(){
        Transit.click();
    }

    public void setBike(){
        Bike.click();
    }

    public void setFly(){
        Fly.click();
    }

    public void setNewsroom(){
        Newsroom.click();
    }

    public void setInvestor_relations(){
        Investor_relations.click();
    }

    public void setGlobalCitizenship(){
        Global_citizenship.click();
    }

    public void setBlog(){
        Blog.click();
    }

    public void setCareers(){
        Careers.click();
    }

    public void setGiftCards(){
        Gift_cards.click();
    }

    public void setUberVDrivingJobs(){
        Uber_V_drivingJobs.click();
    }

    public void setAdvancedTechnologiesGroup(){
        AdvancedTechnologiesGroup.click();
    }
}

