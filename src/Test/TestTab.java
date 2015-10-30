package Test;
import org.junit.Test;

import Pages.MainPage;

public class TestTab extends TestBaseSetup {
	
	@Test
	
	public void testCase01() throws InterruptedException {
		
		MainPage onMainPage = new MainPage(driver);
		onMainPage = onMainPage.navigateToMainPage();
		onMainPage.clickOnTab();
		onMainPage.checkTable();
				
		}
}
