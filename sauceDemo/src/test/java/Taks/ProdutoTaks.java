package Taks;

import PageObjects.ProdutoPage;
import org.openqa.selenium.WebDriver;

public class ProdutoTaks {

    private WebDriver driver;
    private ProdutoPage produtoPage;

    public ProdutoTaks (WebDriver driver){

        this.driver = driver;
        produtoPage = new ProdutoPage(this.driver);
    }

    public void selecionarProduto(){

        produtoPage.getAddToCartButton().click();
        produtoPage.getCartButton().click();
    }


}
