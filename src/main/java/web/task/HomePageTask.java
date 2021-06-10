package web.task;

import static web.ui.HomePage.NEXT_BUTTON;
import static web.ui.HomePage.RADIO_OPTION_GOOD;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class HomePageTask implements Task {

	@Override
	public <T extends Actor> void performAs(T t) {
		t.attemptsTo(Click.on(RADIO_OPTION_GOOD));
		t.attemptsTo(Click.on(NEXT_BUTTON));
	}

	public static HomePageTask submit() {
		return Tasks.instrumented(HomePageTask.class);
	}
}
