package Test;
import org.junit.Test;

import Pages.RegistrationPage;

public class TestRegistration extends TestBaseSetup {
	
	@Test
	
	public void testCase03() throws InterruptedException {
		
		RegistrationPage onRegistrationPage = new RegistrationPage(driver);
		onRegistrationPage = onRegistrationPage.navigateRegistrationPage();
		onRegistrationPage.clearFields();
		onRegistrationPage.registerUser("Jovan","Markovic", "Russia", "9", "23", "1989", "0611234567", "jmarkovic16", "129@129.com", "C:\\Users\\jovanm\\Desktop\\452276.jpg", "I am not a bot and this is not automated!", "Neskafa89", "Neskafa89");
		onRegistrationPage.clickOnFields();
		onRegistrationPage.clickOnSubmit();
		}
}
