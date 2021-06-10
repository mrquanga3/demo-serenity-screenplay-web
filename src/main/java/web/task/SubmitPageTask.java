package web.task;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static web.ui.SubmitPage.RESPNOSE_FORM;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SubmitPageTask implements Task {
	public static Question<String> reponseMessage() {
		return actor -> {
			WaitUntil.the(RESPNOSE_FORM, isVisible());
			return Text.of(RESPNOSE_FORM).viewedBy(actor).asString();
		};
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

	}
}
