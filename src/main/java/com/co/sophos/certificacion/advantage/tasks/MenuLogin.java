package com.co.sophos.certificacion.advantage.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.sophos.certificacion.advantage.userinterfaces.Login.LOGIN;
import static com.co.sophos.certificacion.advantage.userinterfaces.Login.MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MenuLogin implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MENU),
                Click.on(LOGIN));
    }

    public static MenuLogin inTheApp() {
        return instrumented(MenuLogin.class);
    }
}
