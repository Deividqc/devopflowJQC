package pages;

import org.openqa.selenium.WebDriver;

public class PaginaCursos extends BasePage {

    private String IntroducionTestingLink="//a[normalize-space()='Introducción al Testing de Software' and @href]";
    //private String SelectPlan="//h3[normalize-space()='Academia']/ancestor::section[1]//a[contains(normalize-space(),'Elegir')][1]";

    
    private String SelectPlan="//a[normalize-space()='Elegir este plan']";


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
