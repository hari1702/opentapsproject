package opentaps;

import org.junit.Test;

import common.OpenTapsWrapper;

public class CreateLead extends OpenTapsWrapper  {
	
@Test	
	public void createLead(){
	
	    String CompanyName = readCellFromExcel("CreateLead",7,1);	
	    String FirstName = readCellFromExcel("CreateLead", 7, 2);
	    String LastName = readCellFromExcel("CreateLead", 7, 3);
	    String PhoneNumber = readCellFromExcel("CreateLead", 7, 4);
	    String EmailId = readCellFromExcel("CreateLead", 7, 5);	    
		loginOpenTaps("firefox","DemoSalesManager","crmsfa");
		clickByXpath("//div[@class='crmsfa']/a/img");
		clickByXpath("//div[@id='left-content-column']/div[1]/div[2]/ul[1]/li[1]/a[1]");
		enterById("createLeadForm_companyName", CompanyName);
		enterById("createLeadForm_firstName", FirstName);
		enterById("createLeadForm_lastName", LastName);
		selectValueByIndex("createLeadForm_dataSourceId", 3);
		selectValueByIndex("createLeadForm_marketingCampaignId", 4);
		enterById("createLeadForm_primaryPhoneNumber",PhoneNumber);
		enterById("createLeadForm_primaryEmail",EmailId);	
		clickByClassName("smallSubmit");
		getTextByIdSysOut("viewLead_companyName_sp");
		
	}
}
	

