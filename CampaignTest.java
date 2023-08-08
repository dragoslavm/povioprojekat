package tests;

import org.junit.Test;

import Pages.Campaign;



public class CampaignTest extends BaseTest {
    
    public Campaign campaign;

@Test
public void campaign(){
    Campaign campaign = new Campaign(driver);
    campaign.basePage();
    campaign.newuser("dragoslav", "dragoslav@gmail.com", "milenkovic", "milenkovic");
    campaign.campentry();
    campaign.addnewcamp();
    campaign.formularcampanja("Povio", "Zadatak");
    campaign.deleteacc();
    driver.switchTo( ).alert( ).accept();

    


}
}
