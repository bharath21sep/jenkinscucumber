
package org.cucumberreport;

import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport{
	public static void generateJvmReport(String jsonpath) {
		File f = new File("G:\\selenium\\CucumberSample\\target\\reports");
		Configuration con = new Configuration(f, "Facebook Application");
		con.addClassifications("Browser","chrome");
		con.addClassifications("version","95");
		con.addClassifications("platform name", "Windows");
		 con .addClassifications("Sprint","5");
		 con.addClassifications("Tester name","Bharath");
		 con.addClassifications("Date","30/11/2021");
	ArrayList <String> li = new ArrayList<String>();
	li.add(jsonpath);
	ReportBuilder r = new ReportBuilder(li, con);
	r.generateReports();
	
	}

	
}