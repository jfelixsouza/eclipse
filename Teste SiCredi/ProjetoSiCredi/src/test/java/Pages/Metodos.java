package Pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;
	
	public void abrirNavegador(String site){
		
		try {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}catch (Exception e) {
			System.err.println("------- erro ao abrir navegador "+ e.getMessage());
			System.err.println("------ causa do erro ------ " +e.getCause());

		}	}
	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
			
		} catch (Exception e) {
			System.err.println("------- erro ao clicar -------" + e.getMessage());
			System.err.println("------- causa do erro ----------" + e.getMessage());
		}
	}
	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("------- erro ao escrever -------" + e.getMessage());
			System.err.println("------- causa do erro ----------" + e.getMessage());
			}}
	public void fechar(){
		
		try {
		driver.quit();
	}catch (Exception e) {
		System.err.println("------- erro ao fechar -------" + e.getMessage());
		System.err.println("------- causa do erro ----------" + e.getMessage());
		}}

		public void screenShot ( String nomeEvidencia) {
			
			try {
				TakesScreenshot scrShot = (TakesScreenshot) driver;
				File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
				File destFile = new File("./Evidencias/"+nomeEvidencia+".png");
				FileUtils.copyFile(scrFile, destFile);
				
				
			} catch (Exception e) {
				System.err.println("------- erro ao tirar evidencia -------" + e.getMessage());
				System.err.println("------- causa do erro ----------" + e.getMessage());
			}
}}

