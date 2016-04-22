package opentaps;

import org.junit.Test;

import common.OpenTapsWrapper;

public class MergeLead extends OpenTapsWrapper {

@Test
	public void mergeLead(){
	loginOpenTaps("firefox","DemoSalesManager","crmsfa");
	clickByXpath("//div[@class='crmsfa']/a/img");
	clickByLinkText("Leads");
	clickByLinkText("Merge Leads");
	clickByXpath("//table[@class='twoColumnForm']/tbody[1]/tr[1]/td[2]/a[1]/img[1]");
	switchToLastWindow();
	enterByXpath("(//div[@class='x-form-element'])[1]/input[1]", "10034");
	clickByXpath("(//td[@class='x-btn-center'])[1]/em[1]/button[1]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	clickByLinkText("10034");
	switchToPrimaryWindow();
	clickByXpath("//table[@class='twoColumnForm']/tbody[1]/tr[2]/td[2]/a[1]/img[1]");
	switchToLastWindow();
	enterByXpath("(//div[@class='x-form-element'])[1]/input[1]", "10036");
	clickByXpath("(//td[@class='x-btn-center'])[1]/em[1]/button[1]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	clickByLinkText("10036");
	switchToPrimaryWindow();
	clickByClassName("buttonDangerous");
	acceptAlert();
	clickByLinkText("Find Leads");
	enterByXpath("//div[@class='x-form-item x-tab-item']/div[1]/input[1]", "10034");
	clickByXpath("(//td[@class='x-btn-center'])[7]/em[1]/button[1]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	getTextByClassName("x-paging-info");
	}
}
