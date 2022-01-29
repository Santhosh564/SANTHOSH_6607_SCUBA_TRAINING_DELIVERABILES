package com.test.KDL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class UIImplementation {
	
	   WebDriver driver;
	    public UIImplementation(WebDriver driver){
	        this.driver = driver;
	    }
	    @SuppressWarnings("deprecation")
		public void perform(Properties p,String operation,String objectName,String objectType,String value) throws Exception{
	        System.out.println("");
	        switch (operation.toUpperCase()) {
	        case "CLICK":
	            driver.findElement(this.getObject(p,objectName,objectType)).click();
	            break;
	        case "SETTEXT":
	            driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(value);
	            break;
	            
	        case "GOTOURL":
	            driver.get(p.getProperty(value));
	            break;
	        case "GETTEXT":
	            driver.findElement(this.getObject(p,objectName,objectType)).getText();
	            break;
	        case "CLOSEBROWSER":
	        	driver.close();
	        case "WAIT":
	        	Thread.sleep(10000);
	        default:
	            break;
	        }
	    }
	    
	    /**
	     * Find element BY using object type and value
	     * @param p
	     * @param objectName
	     * @param objectType
	     * @return
	     * @throws Exception
	     */
	    private By getObject(Properties p,String objectName,String objectType) throws Exception{
	        if(objectType.equalsIgnoreCase("XPATH")){
	            
	            return By.xpath(p.getProperty(objectName));
	        }
	        else if(objectType.equalsIgnoreCase("CLASSNAME")){
	            
	            return By.className(p.getProperty(objectName));
	            
	        }
	        else if(objectType.equalsIgnoreCase("NAME")){
	            
	            return By.name(p.getProperty(objectName));
	            
	        }
	        else if(objectType.equalsIgnoreCase("CSS")){
	            
	            return By.cssSelector(p.getProperty(objectName));
	            
	        }
	        else if(objectType.equalsIgnoreCase("LINK")){
	            
	            return By.linkText(p.getProperty(objectName));
	            
	        }
	        else if(objectType.equalsIgnoreCase("PARTIALLINK")){
	            
	            return By.partialLinkText(p.getProperty(objectName));
	            
	        }else
	        {
	            throw new Exception("Wrong object type");
	        }
	    }
}
