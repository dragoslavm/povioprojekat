package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Campaign extends BasePage{
    public Campaign (WebDriver driver){
         super(driver);
    }
    String baseURL = "https://povio-at.herokuapp.com/users/sign_up";
    By campaingButtonBy = By.cssSelector("body > header > div > nav > div > div.collapse.navbar-collapse > ul > li:nth-child(2) > a");
    By addcampaingBy = By.cssSelector("body > main > div > a");
    By namecampaignBy = By.xpath("/html/body/main/div/form/div[1]/input");
    By descriptionBy = By.xpath("/html/body/main/div/form/div[2]/input");
    By onetimeBy = By.xpath("/html/body/main/div/form/div[4]/label");
    By createcampaignBy = By.xpath("/html/body/main/div/form/div[6]/input");
    By nameBy = By.id("user_name");
    By emailBy = By.id("user_email");
    By passwordBy = By.id("user_password");
    By passwordconfirmationBy = By.id("user_password_confirmation");
    By signupButtonBy = By.xpath("//*[@id=\"new_user\"]/input[3]");
    By editAccBy = By.xpath("/html/body/header/div/nav/div/div[2]/ul/li[1]/a");
    By cancelAccBy = By.xpath("/html/body/main/div[2]/form/input[2]");
    By editcampaignBy = By.xpath("/html/body/main/div[2]/div/div/table/tbody/tr/td[3]/a");
    By updatebuttonBy = By.xpath("/html/body/main/div/form/div[6]/input");
    By repeatbuttonBy = By.xpath("/html/body/main/div/form/div[5]/label");
    
    public Campaign basePage(){
        driver.get(baseURL);
        return this;
    }

    public Campaign editcamp(){
        click(editcampaignBy);
        return this;
    }

    public Campaign editformular(String novoime, String noviopis){
        writeText(namecampaignBy, novoime);
        writeText(descriptionBy, noviopis);
        click(repeatbuttonBy);
        click(updatebuttonBy);
        return this;
    }



    public Campaign deleteacc (){
        click(editAccBy);
        click(cancelAccBy);
        return this;
    }

    public Campaign formularcampanja (String campaignname, String opiskampanje){
        writeText(namecampaignBy, campaignname);
        writeText(descriptionBy, opiskampanje);
        click(onetimeBy);
        click(createcampaignBy);
        return this;
    }

    public Campaign addnewcamp(){
        click(addcampaingBy);
        return this;
    }

    public Campaign campentry(){
        click(campaingButtonBy);
        return this;
    }

    public Campaign newuser (String name, String email, String password, String passconf){
        writeText(nameBy, name);
        writeText(emailBy, email);
        writeText(passwordBy, password);
        writeText(passwordconfirmationBy, passconf);
        click(signupButtonBy);
        return this;
    }
}
