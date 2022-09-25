package com.co.sophos.certificacion.advantage.questions;

import com.co.sophos.certificacion.advantage.userinterfaces.LoginSection;
import com.co.sophos.certificacion.advantage.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValueLogin implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Constants.LOGIN_USER.equals(Text.of(LoginSection.LOGIN_ICON).viewedBy(actor).asString());
    }

    public static ValueLogin verify(){
        return new ValueLogin();
    }
}
