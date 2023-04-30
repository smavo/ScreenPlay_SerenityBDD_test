package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static UserInterfaces.DetalleArticulo.*;

public class AgregarProducto implements Task {

    private String cantidad;
    public AgregarProducto(String cantidad){
        this.cantidad = cantidad;
    }

    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(BUTTON_ANADIR_CESTA),
                Click.on(BUTTON_VER_CESTA)
        );
    }

    public static AgregarProducto cantidad(String cantidad){
        return instrumented(AgregarProducto.class, cantidad);
    }

}
