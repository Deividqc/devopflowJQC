package pages;

public class PaginaCursos extends BasePage {

    private String IntroducionTestingLink="//a[normalize-space()='Introducción al Testing de Software' and @href]";
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
