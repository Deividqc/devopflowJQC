package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaPrincipal;
import pages.PaginaFundamentosTesting;
import pages.PaginaRegistro;

public class FreeRangeSteps {
    SoftAssert soft = new SoftAssert();

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentosTestingPage = new PaginaFundamentosTesting();
    PaginaRegistro registro= new PaginaRegistro();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
     }

    @When("I go to {word} using navigation bar")
    public void navigationBarUse(String section){
        landingPage.clickOnSectionNavigationBar(section);
    }

    @When("^(?:I|The user|The client) selects? Elegir Plan$")
    public void SelectPlan(){
        cursosPage.clickOnSelectPlanAcademiaLink();
    }

    @When("^(?:I|The user|The client) selects? Introduccion al Testing$")
    public void navigationToIntro(){
        cursosPage.clickOnIntroduccionTestingLink();;
        fundamentosTestingPage.clickOnFundamentosTestingLink();
    }
    
    @Then("^(?:I|The user|The client) can validate the options in the checkout page$")
    public void validateCheckoutPlans(){
        System.out.println("Validating checkout page");
        int valueplanSize = registro.returnPlanDropDownSize();
        Assert.assertEquals(3,valueplanSize );
                
        List<String> planOptions=registro.returnPlanDropDownValues();
        List<String> expectedOptions=Arrays.asList("Academia: $16.99 / mes • 14 productos","Academia: $176 / año • 14 productos","Free: Gratis • 3 productos");
        Assert.assertEquals(expectedOptions,planOptions);
    }

    public void EjemplosAssertions(){
        String palabraEsperada="Pepe";
        String palabraEncontrada="Papa";

        //Verificar que dos valores son iguales
        Assert.assertEquals(palabraEsperada, palabraEncontrada);

        //Verificar que los valores no son iguales
        Assert.assertNotEquals(palabraEsperada, palabraEncontrada);

        //Verificar que una condición es verdadera
        Assert.assertTrue(palabraEncontrada.contains(palabraEsperada));

        //Verificar que una condición es falsa
        Assert.assertFalse(palabraEncontrada.contains(palabraEsperada));

        //Soft Assertions : No detienen la ejecución al fallar. Ideal para verificar muchas cosas pequeñas a la vez
        soft.assertEquals(palabraEsperada, palabraEncontrada);
        soft.assertNotEquals(palabraEsperada, palabraEncontrada);
        soft.assertTrue(palabraEncontrada.contains(palabraEsperada));

        soft.assertAll();


    }
}
