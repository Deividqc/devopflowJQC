package pages;

public class PaginaPrincipal extends BasePage {

    //private String searchButton = "//a[normalize-space()='Comprar curso']";
    private String sectionLink="//a[normalize-space()='%s' and @href]";

    // Constructor de la clase
    public PaginaPrincipal() {
        // Llama al constructor de la clase padre
        super(driver);
    }
    // Método para navegar a la página principal
    public void navigateToFreeRangeTesters() {
        // Navega a la página principal
        navigateTo("https://www.freerangetesters.com");
        //clickElement(searchButton);
    }
    public void clickOnSectionNavigationBar(String section){
        //Reemplaza el marcador de psoocion en sectionLink con el nombre
        String xpathSection=String.format(sectionLink, section);
        clickElement(xpathSection);
    }


}
