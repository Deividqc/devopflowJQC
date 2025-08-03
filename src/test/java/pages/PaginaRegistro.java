package pages;

import java.util.List;

public class PaginaRegistro extends BasePage {

    private String planDropDown = "//select[@id='cart_cart_item_attributes_plan_with_interval']";
    //private String nombreInput="//input[@id='name']";
    //private String emailInput="//input[@id='email']";
    //private String passwordInput="//input[@id='password']";
    //private String confirmPasswordInput="//input[@id='password_confirmation']";
    //private String registerButton="//button[normalize-space()='Registrarse']";

    // Constructor de la clase
    public PaginaRegistro() {
        // Llama al constructor de la clase padre
        super(driver);
    }
   
    public List<String> returnPlanDropDownValues(){
        return getDropDownValues(planDropDown);
    }
    
    public int returnPlanDropDownSize()
    {
        return dropDownSize(planDropDown);
    }

}
