package testHomePage;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;

public class HomePageTest extends CommonAPI {


    HomePage homePage;
    String url = "https://www.uber.com/";


    @BeforeClass
    public void init1() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);
    }

    @Test
    public void clickOnOurProducts() {
        homePage.setOurProducts();
    }

    @Test
    public void clickOnOurCompany(){
        homePage.setOurCompany();
    }

    @Test
    public void clickOnSafety(){
        homePage.setSafety();
    }

    @Test
    public void clickOnHelp(){
        homePage.setHelp();
    }

    @Test
    public void clickOnLanguage() {
        homePage.setLanguage();
    }

    @Test
    public void clickOnRewards() {
        homePage.setRewards();
    }

    @Test
    public void clickOnPay() {
        homePage.setPay();
    }

    @Test
    public void clickOnLogIn() {
        homePage.setLogIn();
    }

    @Test
    public void clickOnSignUp() {
        homePage.setSignUp();
    }

    @Test
    public void clickOnEarn(){
        homePage.setEarn();
    }

    @Test
    public void clickOnRide(){
        homePage.setRide();
    }

    @Test
    public void clickOnEat(){
        homePage.setEat();
    }

    @Test
    public void clickOnFreight(){
        homePage.setFreight();
    }

    @Test
    public void clickOnBusiness(){
        homePage.setBusiness();
    }

    @Test
    public void clickOnTransit(){
        homePage.setTransit();
    }

    @Test
    public void clickOnBike(){
        homePage.setBike();
    }

    @Test
    public void clickOnFly(){
        homePage.setFly();
    }

    @Test
    public void clickOnNewsroom(){
        homePage.setNewsroom();
    }

    @Test
    public void clickOnInvestorRelatons(){
        homePage.setInvestor_relations();
    }

    @Test
    public void clickOnGlobalCitizenship(){
        homePage.setGlobalCitizenship();
    }

    @Test
    public void clickOnBlog(){
        homePage.setBlog();
    }

    @Test
    public void clickOnCareers(){
        homePage.setCareers();
    }

    @Test
    public void clickOnGiftCards(){
        homePage.setGiftCards();
    }

    @Test
    public void clickOnUberVDrivingJobs(){
        homePage.setUberVDrivingJobs();
    }

    @Test
    public void clickOnAdvancedTechnologiesGroup(){
        homePage.setAdvancedTechnologiesGroup();
    }
}
