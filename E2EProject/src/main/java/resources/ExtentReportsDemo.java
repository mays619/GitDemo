package resources;



import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo {
	static ExtentReports er;
	
	
	public  static ExtentReports getReports() {
		
		//ExtentReports, ExtentSparkReporter
		
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter esp=new ExtentSparkReporter(path);
		esp.config().setReportName("Web Automation Result");
		esp.config().setDocumentTitle("Test Results");
		
		 er= new ExtentReports();
		er.attachReporter(esp);
		er.setSystemInfo("NewTester", "Mayank Sharma");
		return er;
		
	}

}
