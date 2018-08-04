package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	WebDriver dr;
	@BeforeTest
	public void SetBrow()
	{
		 dr=new FirefoxDriver();
	}
	@BeforeMethod 
	 public void SetUp() 
	 {
		dr.get("https://www.facebook.com/");
	 }
  @Test(dataProvider = "getdata")
  public void verify(String username,String password) {
	  //dr=new FirefoxDriver();
	  //dr.get("https://www.facebook.com/");
	  dr.findElement(By.xpath(".//*[@id='email']")).sendKeys(username);
	  //dr.findElement(By.xpath(".//*[@id='email']")).clear();
	  dr.findElement(By.xpath(".//*[@id='pass']")).sendKeys(password);
	  //dr.findElement(By.xpath(".//*[@id='pass']")).clear();
	  dr.findElement(By.xpath(".//*[@id='u_0_6']")).click();
	  //dr.findElement(By.xpath(".//*[@id='u_0_6']")).click();
	 
  }

  @DataProvider
  public Object[][] getdata() {
	  Object data[][]=new Object[2][2];//j=No of data which we want to pass ,i=no of times we want to run 
	  data[0][0]="Pooja";
	  data[0][1]="123";
	  data[1][0]="welcome";
	  data[1][1]="1233";
	 // data[2][0]="gggg";
	  return data;
   
  }
}
