package com.co.sophos.certificacion.advantage.stepdefinitions;

import com.co.sophos.certificacion.advantage.questions.ValueLogin;
import com.co.sophos.certificacion.advantage.tasks.BuyProducts;
import com.co.sophos.certificacion.advantage.tasks.LoginAdvantage;
import com.co.sophos.certificacion.advantage.tasks.MenuLogin;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.GivenWhenThen;

public class LoginAvantageStepDefinitions {

    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Jose");
    }

    @Given("^Deseo ir al menu de logueo$")
    public void deseoIrAlMenuDeLogueo() {
        OnStage.theActorInTheSpotlight().attemptsTo(MenuLogin.inTheApp());

    }


    @When("^ingreso usuario y password$")
    public void ingresoUsuarioYPassword() {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginAdvantage.inTheLogin());
        OnStage.theActorInTheSpotlight().attemptsTo(BuyProducts.inStore());
        //Thread.sleep(5000);

    }

    @Then("^valido logueo exitoso$")
    public void validoLogueoExitoso() {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValueLogin.verify()));
    }
}
