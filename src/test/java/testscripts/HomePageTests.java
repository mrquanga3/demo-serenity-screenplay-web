package testscripts;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import base.BasePageTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import web.task.HomePageTask;
import web.task.SubmitPageTask;
import web.ui.HomePage;


@RunWith(SerenityRunner.class)
public class HomePageTests extends BasePageTest {

	Actor actorTest = Actor.named(this.getClass().getSimpleName());
	@Managed
	WebDriver driver;

	@Before
	public void admin_user_browse_the_web() {
		actorTest.can(BrowseTheWeb.with(driver));
	}

	@Test
	public void test_submit() {
		givenThat(actorTest).attemptsTo(Open.browserOn().the(HomePage.class));
		when(actorTest).attemptsTo(HomePageTask.submit());
		then(actorTest).should(seeThat(SubmitPageTask.reponseMessage(), Matchers.is("Have a nice day.")));
	}
}
