package web.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:home.page.url")
public class SubmitPage extends PageObject {
	public static final Target RESPNOSE_FORM = Target.the("Respone form")
			.located(By.cssSelector(".h3.page-subtitle div"));

}