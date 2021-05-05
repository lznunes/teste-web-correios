package Steps;

import HomePage.HomePage;
import com.google.common.io.Files;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class RastrearObjetoPostado {

    private static WebDriver driver;
    public static HomePage homePage;

    @Before
    public static void startHomePage() {
        System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
        homePage = new HomePage(driver);
    }

    @After
    public static void finishHomePage() {
        homePage.driver.quit();
    }


    @Given("^Acessar o site dos correios$")
    public void acessar_o_site_dos_correios() {
        homePage.loadHomePage();
    }

    @When("^Informar objeto valido$")
    public void Informar_objeto_valido() {
        homePage.driver.findElement(By.cssSelector(".content:nth-child(1)")).click();
        homePage.driver.findElement(By.id("objetos")).sendKeys("JY183171564BR");
    }

    @When("^Informar objeto inválido$")
    public void informar_objeto_inválido() {
        homePage.driver.findElement(By.cssSelector(".content:nth-child(1)")).click();
        homePage.driver.findElement(By.id("objetos")).sendKeys("00000601594528");
    }

    @And("^Clicar no botão buscar$")
    public void clicar_no_botão_buscar() {
        homePage.driver.findElement(By.id("btnPesq")).click();
        homePage.driver.manage().timeouts().implicitlyWait(3000000, TimeUnit.MILLISECONDS);
    }

    @Then("^Valida status da entrega$")
    public void valida_status_da_entrega() {
        String statusEntrega = homePage.driver.findElement(By.cssSelector(".info")).getText();
        assertEquals("Entregue 20/02/2020", statusEntrega);
    }

    @Then("^Valida status da entrega invalido$")
    public void valida_status_da_entrega_invalido() {
        String statusEntrega = homePage.driver.findElement(By.cssSelector(".info")).getText();
        assertEquals("O(s) código(s) ou CPF/CNPJ estão inválidos", statusEntrega);
    }


}