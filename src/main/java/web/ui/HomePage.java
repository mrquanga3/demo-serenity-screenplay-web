package web.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:home.page.url")
public class HomePage extends PageObject {
	public static final Target NEXT_BUTTON = Target.the("Next button").locatedBy("//button[contains(text(),'Next')]");
	public static final Target RADIO_OPTION_GOOD = Target.the("Radio with option Good")
			.locatedBy("//span[contains(text(),'Good')]");

}