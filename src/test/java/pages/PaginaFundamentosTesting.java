package pages;

public class PaginaFundamentosTesting extends BasePage {

    private String fundamentosTestingLink="//a[normalize-space()='Preparación para el examen iSTQb Foundation Level' and @href]";
    // Constructor de la clase
    public PaginaFundamentosTesting() {
        // Llama al constructor de la clase padre
        super(driver);
    }
   
    public void clickOnFundamentosTestingLink(){
        clickElement(fundamentosTestingLink);
    }
    
}
