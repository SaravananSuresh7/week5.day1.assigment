package week5.classroom;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditLead extends BaseClass {
	@Test
	public void Edit() throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Saravanan");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//a[@href = '/crmsfa/control/viewLead?partyId=10036'])[1]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text() ='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@value = 'Update']")).click();

	}

}
