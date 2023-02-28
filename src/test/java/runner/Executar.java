package runner;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import utils.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;



@CucumberOptions(
features = "src//test//java//utils//features//Demo.feature",
glue = "step",
tags = "@test",
monochrome = true,
dryRun = false,
plugin = {"pretty","html:target/cucumber-report.html"},
snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Executar extends Drivers {

    public  void OpenBrowser() {

            String browser = ("chrome");
            if (browser.contains("chrome")) {
                System.out.println(" you are opening the browser" + browser);
                WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();
                driver.manage().window().maximize();
               driver.get("https://google.com.br");

        }


        }


    }
