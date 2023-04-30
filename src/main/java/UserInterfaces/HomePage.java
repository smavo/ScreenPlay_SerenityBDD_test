package UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://es.aliexpress.com/")
public class HomePage extends PageObject {

    public static final Target INPUT_BUSCAR_ARTICULO = Target.the("Input donde se realiza la búsqueda").located(By.id("search-key"));
    public static final Target BUTTON_BUSCAR_ACTICULO = Target.the("Botón buscar Articulo").located(By.xpath("//input[@class='search-button']"));
    public static final Target LINK_ARTICULO_ENCONTRADO = Target.the("Link de Objeto encontrado").located(By.xpath("//img[contains(@alt,'Filtro de algodón para respirador N95, mascarilla antipolvo de Gas, 10 piezas, 3701CN, 3200, 3700')]"));

}
