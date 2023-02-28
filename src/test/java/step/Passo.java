package step;

import Pages.Elementos;


import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import runner.Executar;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.Metodos;
import utils.Drivers;


public class Passo extends Drivers {
    Metodos metodos = new Metodos();
Elementos el = new Elementos();
Executar ex = new Executar();


@Test
    @Given("que eu aceeser o google")
    public void que_eu_aceeser_o_google() {
   ex.OpenBrowser();

    }

@After
    @When("pesquisar o no da empresa")
    public void pesquisar_o_no_da_empresa() {
        metodos.escrever("keeggo",el.pesquisar);
        metodos.clicar(el.acessar);
    }
@After
    @Then("Valido as informacoes")
    public void valido_as_informacoes()  {
metodos.validar();
    }

}