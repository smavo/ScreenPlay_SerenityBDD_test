package UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleArticulo {

    public static final Target BUTTON_ANADIR_CESTA = Target.the("Botón buscar Articulo").located(By.xpath("//button[@class='next-btn next-large next-btn-primary addcart']"));
    public static final Target BUTTON_VER_CESTA = Target.the("Boton Ver Cesta").located(By.xpath("//button[@ae_button_type='View_shopping_cart']"));

}
