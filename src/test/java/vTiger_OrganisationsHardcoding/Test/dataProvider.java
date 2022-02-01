package vTiger_OrganisationsHardcoding.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
@Test(dataProvider="dataproviderBookTicketTest")

public void bookTicketTest(String src,String dest){
	System.out.println("book tickets from"+src+"to"+dest);
}
@DataProvider
public Object[][] dataproviderBookTicketTest()
{
	Object[][] objArr=new Object[5][2];
	
	objArr[0][0]="hassan";
	objArr[0][1]="goa";
	
	objArr[1][0]="hassan";
	objArr[1][1]="mangalore";
	
	objArr[2][0]="hassan";
	objArr[2][1]="bangalore";
	
	objArr[3][0]="hassan";
	objArr[3][1]="mysore";
	
	objArr[4][0]="hassan";
	objArr[4][1]="sakleshpur";
	return objArr;
}
}