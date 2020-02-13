package br.com.rsinet.mobile_Project_BDD.Utilitys;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Snapshot {
	
	public static AndroidDriver<MobileElement> driver;
    
    public static void tirarPrints(String nomeDaImagem, WebDriver driver) throws Exception {
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        String imageFileDir = "./Report/";
        FileUtils.copyFile(srcFile, new File(imageFileDir, nomeDaImagem + timestamp() + ".png"));
    }
        public static String timestamp() {
            return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
        } 

}














