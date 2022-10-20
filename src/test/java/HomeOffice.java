import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeOffice {

    @Test(priority = 1, description = "Cargar ausentismo HomeOffice")
    public void cargarHomeOffice() {

        System.setProperty("webdriver.edge.driver","C:\\Users\\mehringl\\IdeaProjects\\Automatización HomeOffice\\src\\main\\resources\\drivers\\msedgedriver.exe");

        // Iniciar navegador
        WebDriver driver=new EdgeDriver();

        // Abrir Home Banking
        driver.get("https://portaldelcolaborador.bpn.com.ar/Ausentismo/RegistroAusentismo");
        // Maximizar ventana
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/a[1]/span[2]")).click();


        //Generic Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Select selectMotivo=new Select(driver.findElement(By.xpath("//*[@id=\"tipoAusentismo\"]")));
        WebElement motivo= driver.findElement(By.xpath("//*[@id=\"tipoAusentismo\"]"));

        //Wait after locator is load
        wait.until(ExpectedConditions.visibilityOf(motivo));

       //selectMotivo.click();

        selectMotivo.selectByVisibleText("Home Office");

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/div/div[10]/div[2]/button")).click();

    }
}