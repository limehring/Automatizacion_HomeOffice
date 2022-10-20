package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import static java.lang.Thread.sleep;



public class Main {
    public static void main(String[] args) {
        boolean log=false;

        System.setProperty("webdriver.edge.driver","C:\\Users\\mehringl\\IdeaProjects\\Automatización HomeOffice\\src\\main\\resources\\drivers\\msedgedriver.exe");
        // Iniciar navegador
        WebDriver driver=new EdgeDriver();
        System.out.println(cargaHomeOffice(driver));
    }

    private static boolean cargaHomeOffice(WebDriver drvr){
        boolean seLoguea=false;
        WebDriver driver=drvr;
        try {

            // Abrir Home Banking
            driver.get("https://portaldelcolaborador.bpn.com.ar/Ausentismo/RegistroAusentismo");
            // Maximizar ventana
            driver.manage().window().maximize();

            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/a[1]/span[2]")).click();



            seLoguea=true;
        } catch (Exception e){
            e.printStackTrace();
        }

        return seLoguea;
    }
}