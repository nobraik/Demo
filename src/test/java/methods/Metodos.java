package methods;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.Drivers;

import java.util.concurrent.TimeUnit;

public class Metodos extends Drivers {

    public void escrever(String texto, By elemeneto){
      driver.findElement(elemeneto).sendKeys(texto);

    }
    public void clicar(By elemento) {
        driver.findElement(elemento).submit();
    }
    public void validar()  {
        Assert.assertTrue("keeggo",true);


    }
}
