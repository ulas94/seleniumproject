import java.lang.reflect.Method;

public class producktpage {
Method methods;
    public ProductPage(){
        methods = new Methods();
    }

    public void Select(){

        methods.sendKeys(By.id("search-ınput"), "oyuncak");
        methods.selectByText(By.cssSelector("select#review-sort-selection"),"Oylama (yüksek)");
        methods.click(By.cssSelector("search-ınput"),"türk klasikleri");
    }
}
