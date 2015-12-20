package com.quickr;

import org.openqa.selenium.By;

public class Post extends Base {

	
	public void add_post() {
		
		driver.findElement(By.xpath("//*[@id='quikrcontainer']/div[9]/div[2]/div[4]/div[3]")).click();
		
		driver.findElement(By.xpath("//*[@id='18222212654_sub_cat_list']/div/ul/li[1]/a")).click();
	}

}
