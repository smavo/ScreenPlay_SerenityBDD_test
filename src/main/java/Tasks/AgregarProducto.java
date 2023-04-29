package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProducto implements Task {

    private String cantidad;
    public AgregarProducto(String cantidad){
        this.cantidad = cantidad;
    }

    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(),
                Enter.theValue(cantidad).into(),
                Click.on(),
                Click.on()
        );
    }

    public static AgregarProducto cantidad(String cantidad){
        return instrumented(AgregarProducto.class, cantidad);
    }

}
