package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DebitCardTest {

    @BeforeEach
    public  void setup() {
        open("http://localhost:9999/");
    }

    @Test
    public void callBackTest() {

    }
}
