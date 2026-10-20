package TestCases;

import Framework.TestBase;
import Taks.LoginTaks;
import Taks.ProdutoTaks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class RealizarCompraComSucessoTest extends TestBase {

     private final WebDriver driver = getDriverManager();

     LoginTaks loginTaks = new LoginTaks(driver);
     ProdutoTaks produtoTaks = new ProdutoTaks(driver);
     @Test

     public void realizarCompra() throws InterruptedException {

          loginTaks.efetuarLogin();
          produtoTaks.selecionarProduto();
     }
}
