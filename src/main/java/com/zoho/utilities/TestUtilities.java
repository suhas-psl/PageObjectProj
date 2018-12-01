package com.zoho.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.zoho.base.Page;

public class TestUtilities extends Page {

	public static String screenshot, destPath;
	public static void captureScreenShot() throws IOException{
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d = new Date();
		screenshot = d.toString().replaceAll(":", "_").replaceAll(" ", "_")+".jpg";
		destPath =System.getProperty("user.dir")+"\\target\\surefire-reports\\"+screenshot;
		FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\target\\surefire-reports\\"+screenshot));
	}
}
