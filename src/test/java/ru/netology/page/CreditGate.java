package ru.netology.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ru.netology.data.Card;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CreditGate {
    private SelenideElement heading = $$("h3").find(exactText("Кредит по данным карты"));
    private SelenideElement numberCardField = $(byText("Номер карты")).parent().$("[class=\"input__control\"]");
    private SelenideElement monthField = $(byText("Месяц")).parent().$("[class=\"input__control\"]");
    private SelenideElement yearField = $(byText("Год")).parent().$("[class=\"input__control\"]");
    private SelenideElement holderCardField = $(byText("Владелец")).parent().$("[class=\"input__control\"]");
    private SelenideElement cvcField = $(byText("CVC/CVV")).parent().$("[class=\"input__control\"]");
    private SelenideElement approvedOperation = $(byText("Операция одобрена Банком.")).parent().$("[class=\"notification__content\"]");
    private SelenideElement declinedOperation = $(byText("Ошибка! Банк отказал в проведении операции.")).parent().$("[class=\"notification__content\"]");
    private SelenideElement wrongFormat = $(byText("Неверный формат"));
    private ElementsCollection wrongFormatFields = $$(byText("Неверный формат"));
    private SelenideElement wrongValidityPeriodCard = $(byText("Неверно указан срок действия карты"));
    private SelenideElement expiredValidityPeriodCard = $(byText("Истёк срок действия карты"));
    private SelenideElement requiredField = $(byText("Поле обязательно для заполнения"));

    private SelenideElement iconButton = $$("[class=\"icon-button__text\"]").first();
    private SelenideElement continueButton = $$("button").find(exactText("Продолжить"));

    public CreditGate() {
        heading.shouldBe(visible);
    }

    public void dataInField(Card card) {
        numberCardField.setValue(card.getNumberCard());
        monthField.setValue(card.getMonth());
        yearField.setValue(card.getYear());
        holderCardField.setValue(card.getHolderCard());
        cvcField.setValue(card.getCvc());
        continueButton.click();
    }

    public void getApprovedOperation() {
        approvedOperation.should(visible, Duration.ofSeconds(15));
        iconButton.click();
    }

    public void getDeclinedOperation() {
        declinedOperation.should(visible, Duration.ofSeconds(15));
    }

    public void getWrongFormat() {
        wrongFormat.should(visible, Duration.ofSeconds(15));
    }

    public void getWrongValidityPeriodCard() {
        wrongValidityPeriodCard.should(visible, Duration.ofSeconds(15));
    }

    public void getExpiredValidityPeriodCard() {
        expiredValidityPeriodCard.should(visible, Duration.ofSeconds(15));
    }

    public void getWrongFormatFields() {
        wrongFormatFields.shouldHaveSize(4);
        requiredField.should(visible, Duration.ofSeconds(15));
    }

    public void getRequiredField() {
        requiredField.should(visible, Duration.ofSeconds(15));
    }
}


