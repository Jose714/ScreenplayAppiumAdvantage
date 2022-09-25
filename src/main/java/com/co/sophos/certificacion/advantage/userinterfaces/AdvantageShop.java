package com.co.sophos.certificacion.advantage.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdvantageShop extends PageObject {

    public static final Target SELECT_PRODUCT = Target.the("Seleccionar Producto").located(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView"));
    public static final Target LAPTOP = Target.the("seleccionar laptop").located(By.id("textViewProductName"));
    public static final Target QUANTITY = Target.the("Cantidad").located(By.id("textViewProductQuantity"));
    public static final Target PLUS = Target.the("Mas").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView[2]\n"));
    public static final Target APPLY = Target.the("Aplicar").located(By.id("textViewApply"));
    public static final Target COLOR = Target.the("Color").located(By.id("linearLayoutProductColors"));
    public static final Target CHANGE_COLOR = Target.the("Cambiar color").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]"));
    public static final Target ADD_TO_CAR = Target.the("Añadir al carrito").located(By.id("linearLayoutProductColors"));

}
