package com.acitime.testscript;

 import java.io.File;
	import java.io.IOException;
	import java.time.LocalDateTime;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import org.testng.Reporter;

import com.actitime.generic.BaseClass;
import com.google.common.io.Files;

	public class ListenerImplementation extends BaseClass implements ITestListener{
		public void onTestSuccess(ITestResult result)
		{
			String res = result.getName();
			Reporter.log(res+"has got passed",true);
			
		}
		public void onTestFailure(ITestResult result)
		{
			String res = result.getName();
			String timesStamp = LocalDateTime.now().toString().replace(':', '_');
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/"+res+timesStamp+".png");
			try {
				Files.copy(src,dest);
			} catch (IOException e) {
				
			}
			
		}@Override
		public void onTestSkipped(ITestResult result)
		{
			String res = result.getName();
			Reporter.log(res+"has got skipped",true);
		}	
		
		@Override
		public void onTestStart(ITestResult result)
		{
			ITestListener.super.onTestStart(result);
			
		}
	}


