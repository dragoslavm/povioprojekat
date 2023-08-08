package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register extends BasePage {
    public Register(WebDriver driver){
        super(driver);
    }
    
    String baseURL = "https://povio-at.herokuapp.com/users/sign_up";
    By nameBy = By.id("user_name");
    By emailBy = By.id("user_email");
    By passwordBy = By.id("user_password");
    By passwordconfirmationBy = By.id("user_password_confirmation");
    By emaildvaBy = By.xpath("//*[@id=\"user_email\"]");
    By passworddvaBy = By.xpath("//*[@id=\"user_password\"]");
    By signupButtonBy = By.xpath("//*[@id=\"new_user\"]/input[3]");
    By signupButtonBy2 = By.xpath("/html/body/header/div/nav/div/div[2]/ul/li[2]/a");
    By editAccBy = By.xpath("/html/body/header/div/nav/div/div[2]/ul/li[1]/a");
    By cancelAccBy = By.xpath("/html/body/main/div[2]/form/input[2]");
    By signInBy = By.cssSelector("body > header > div > nav > div > div.collapse.navbar-collapse > ul > li:nth-child(1) > a");
    By signInklikBy = By.xpath("//*[@id=\"new_user\"]/input[3]");
    By signout = By.xpath("/html/body/header/div/nav/div/div[2]/ul/li[3]/a");
    



    public Register basePage(){
        driver.get(baseURL);
        return this;
    }
    

    public Register newuser (String name, String email, String password, String passconf){
        writeText(nameBy, name);
        writeText(emailBy, email);
        writeText(passwordBy, password);
        writeText(passwordconfirmationBy, passconf);
        click(signupButtonBy);
        return this;
    }


    public Register signIn (String emaildva, String passworddva){
        writeText(emaildvaBy, emaildva);
        writeText(passworddvaBy, passworddva);
        click(signInklikBy);
        return this;
    }

    public Register signinulazak(){
        click(signInBy);
        return this;
    }
        

    public Register signout (){
        click(signout);
        return this;
    }

    public Register signupagain (){
        click(signupButtonBy2);
        return this;
    }


    public Register deleteacc (){
        click(editAccBy);
        click(cancelAccBy);
        return this;
    }

}
