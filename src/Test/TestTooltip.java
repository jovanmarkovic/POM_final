package Test;

import org.junit.Test;

import Pages.TooltipPage;

public class TestTooltip extends TestBaseSetup {
	
	@Test
	
	public void testCase02() throws InterruptedException {
		
		TooltipPage onTooltipPage = new TooltipPage(driver);
		onTooltipPage = onTooltipPage.navigateToTooltipPage();
		onTooltipPage.moveToTooltip();
		onTooltipPage.printToolTipText();
				
		}
}

