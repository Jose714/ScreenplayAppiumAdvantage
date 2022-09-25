package com.co.sophos.certificacion.advantage.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginSection extends PageObject {

    public static final Target LOGIN_ICON = Target.the("Login Icon").located(By.id("textViewMenuUser"));
}
