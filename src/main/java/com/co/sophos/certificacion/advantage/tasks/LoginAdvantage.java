package com.co.sophos.certificacion.advantage.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.sophos.certificacion.advantage.userinterfaces.Login.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginAdvantage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("checr714").into(USUARIO));
        actor.attemptsTo(Enter.theValue("Hi2019").into(CONTRASENA));
        actor.attemptsTo(Click.on(INICIAR_SESION));

        //,Click.on(MENU)
    }

    public static LoginAdvantage inTheLogin() {
        return instrumented(LoginAdvantage.class);
    }
}
