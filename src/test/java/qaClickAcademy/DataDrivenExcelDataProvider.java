package qaClickAcademy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenExcelDataProvider {

	@Test(dataProvider="driverTest")
	public void testCaseData(String a, String b, int c) {
		System.out.println(a +b +c);
	}
	
	@DataProvider(name="driverTest")
	public Object[][] geteData() {
	
		
		Object[][] data= {{"id1","pwd1",1},{"id2","pwd2",2},{"id3","pwd3",3}};
		return data;
	}

}
