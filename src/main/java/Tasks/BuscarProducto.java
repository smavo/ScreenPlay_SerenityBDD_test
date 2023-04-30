package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static UserInterfaces.HomePage.*;

public class BuscarProducto implements Task {

    private String descripcion;

    public BuscarProducto(String descripcion){

        this.descripcion = descripcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(descripcion).into(INPUT_BUSCAR_ARTICULO),
                Hit.the(Keys.ENTER).into(INPUT_BUSCAR_ARTICULO),
                Click.on(LINK_ARTICULO_ENCONTRADO)
        );
    }

    public static BuscarProducto conDescripcion(String descripcion) {
        return instrumented(BuscarProducto.class, descripcion);
    }

}
