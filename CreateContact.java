package week5.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class CreateContact extends BaseClass {
	@Test
	public void Createcontact() {
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Saravanan");
		driver.findElement(By.id("lastNameField")).sendKeys("Suresh");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Michael");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Scofield");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is my sample program");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Saravanansuresh710@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select ss = new Select(state);
		ss.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("(//textarea[@class ='inputBox'])[1]")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This contact has been edited");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
