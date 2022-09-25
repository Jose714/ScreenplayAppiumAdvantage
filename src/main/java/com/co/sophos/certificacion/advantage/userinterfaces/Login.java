package com.co.sophos.certificacion.advantage.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login extends PageObject {
    public static final Target MENU = Target.the("Menu").located(By.id("imageViewMenu"));
    public static final Target LOGIN = Target.the("Login").located(By.id("linearLayoutLogin"));
    public static final Target USUARIO = Target.the("Campo de busqueda de Google").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText"));
    public static final Target CONTRASENA = Target.the("Campo de busqueda de Google").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText"));
    public static final Target INICIAR_SESION = Target.the("Iniciar sesion").located(By.id("buttonLogin"));
}
