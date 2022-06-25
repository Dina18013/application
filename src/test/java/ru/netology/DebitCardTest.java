package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DebitCardTest {

    @BeforeEach
    public  void setUp() {
        open("http://localhost:9999/");
    }

    @Test
    public void shouldSendForm() {
        $("[data-test-id=name] input").setValue("Петров Андрей");
        $("[data-test-id=phone] input").setValue("+79001234567");
        $("[data-test-id=agreement]").click();
        $("button.button").click();
        $("[data-test-id=order-success]").shouldHave(
                exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }
}
