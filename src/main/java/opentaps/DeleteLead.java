package opentaps;

import org.junit.Test;

import common.OpenTapsWrapper;

public class DeleteLead extends OpenTapsWrapper {

@Test
	public void deleteLead(){
	loginOpenTaps("chrome","DemoSalesManager","crmsfa");	
	clickByXpath("//div[@class='crmsfa']/a/img");
	clickByLinkText("Leads");
	clickByLinkText("Find Leads");
	clickByXpath("(//span[@class='x-tab-strip-text '])[2]");
	enterByXpath("(//div[@class='x-plain-bwrap'])[14]/div[1]/input[1]", "9600110856");
	clickByXpath("(//button[@class='x-btn-text'])[7]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	clickByLinkText("10016");		
	clickByClassName("subMenuButtonDangerous");
	clickByLinkText("Find Leads");
	clickByXpath("(//span[@class='x-tab-strip-text '])[2]");
	enterByXpath("(//div[@class='x-plain-bwrap'])[14]/div[1]/input[1]", "9600110856");
	clickByXpath("(//button[@class='x-btn-text'])[7]");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	getTextByClassName("x-paging-info");
	
  }

}
