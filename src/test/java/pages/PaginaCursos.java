package pages;

import org.openqa.selenium.WebDriver;

public class PaginaCursos extends BasePage {

    private String IntroducionTestingLink="//a[normalize-space()='Introducción al Testing de Software' and @href]";
    private String SelectPlan="//h2[normalize-space()='Academia']/ancestor::*[self::section or self::div][1]//a[contains(normalize-space(),'Acceso a todos los cursos')][1]";

    // Constructor de la clase
    public PaginaCursos() {
        // Llama al constructor de la clase padre
        super(driver);
    }
   
    public void clickOnIntroduccionTestingLink(){
        clickElement(IntroducionTestingLink);
    }

    public void clickOnSelectPlanAcademiaLink(){
        clickElement(SelectPlan);
    }

}
