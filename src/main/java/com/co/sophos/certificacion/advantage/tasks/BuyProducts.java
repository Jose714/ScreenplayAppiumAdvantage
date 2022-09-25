package com.co.sophos.certificacion.advantage.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.sophos.certificacion.advantage.userinterfaces.AdvantageShop.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuyProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(SELECT_PRODUCT),Click.on(LAPTOP),
            Click.on(QUANTITY),Click.on(PLUS),Click.on(APPLY),
            Click.on(COLOR),Click.on(CHANGE_COLOR),
            Click.on(ADD_TO_CAR));

    }

    public static BuyProducts inStore() {
        return instrumented(BuyProducts.class);
    }
}
