package StepDefinitions;

import UserInterfaces.HomePage;
import cucumber.api.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Tasks.BuscarProducto;
import Tasks.AgregarProducto;

import java.util.List;

public class EjemploGlobalStep {

    // @Managed(driver = "chrome")

    private Actor actor = Actor.named("Smavodev");
    private HomePage homePage = new HomePage();

    @Dado("^que un nuevo cliente accede hasta la web de compras$")
    public void queUnNuevoClienteAccedeHastaLaWebDeCompras() {
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @Cuando("^el agrega (.*) unidades de (.*) de (.*) al carro$")
    public void elAgregaUnProductoAlCarro(String cantidad, String descripcion, String tipoCategoria) {
        actor.wasAbleTo(BuscarProducto.conDescripcion(descripcion, tipoCategoria),
                AgregarProducto.cantidad(cantidad));

    }

    @Entonces("^el ve los productos listado en el carro de compras$")
    public void elVeLosProductosListadoEnElCarroDeCompras() {

    }

    @Cuando("^el agrega productos al carro$")
    public void elAgregaProductosAlCarro(List<String> datos) {

    }

}
