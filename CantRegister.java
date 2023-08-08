package tests;

import org.junit.Test;

import Pages.Register;

public class CantRegister extends BaseTest {

    public CantRegister cantregister;


@Test
public void registerlogin(){
    Register register = new Register(driver);
    register.basePage();
    register.newuser("dragoslav", "dragoslav@gmail.com", "milenkovic", "milenkovic");
    register.signout();
    register.signupagain();
    register.newuser("dragoslav", "dragoslav@gmail.com", "milenkovic", "milenkovic");
    register.signinulazak();
    try{
        Thread.sleep(2000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
    register.signIn("dragoslav@gmail.com", "milenkovic");
    register.deleteacc();
    driver.switchTo( ).alert( ).accept();
}
}