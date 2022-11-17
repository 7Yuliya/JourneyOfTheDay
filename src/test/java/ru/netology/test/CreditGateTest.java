package ru.netology.test;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

import org.junit.jupiter.api.*;
import ru.netology.data.DataHelper;
import ru.netology.data.SqlHelper;
import ru.netology.page.PaymentPage;


import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditGateTest {
    public static String url = System.getProperty("sut.url");

    @BeforeEach
    public void openPage() {
        open(url);
    }

    @AfterEach
    public void cleanBase() {
        SqlHelper.cleanDataBase();
    }

    @BeforeAll
    static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }

    @Test
    void shouldCreditGatePositiveValidDataHolderOnLatinApprovedCard() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getHolderOnLatinApprovedCard());
        payment.getApprovedOperation();
        assertEquals("APPROVED", SqlHelper.getCreditStatus());
    }

    @Test
    void shouldCreditGatePositiveValidDataHolderContainsAHyphenApprovedCard() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getHolderContainsAHyphenApprovedCard());
        payment.getApprovedOperation();
        assertEquals("APPROVED", SqlHelper.getCreditStatus());
    }

    @Test
    void shouldCreditGatePositiveValidDataHolderOnLatinDeclinedCard() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getHolderOnLatinDeclinedCard());
        payment.getDeclinedOperation();
        assertEquals("DECLINED", SqlHelper.getCreditStatus());
    }

    @Test
    void shouldCreditGatePositiveValidDataHolderContainsAHyphenDeclinedCard() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getHolderContainsAHyphenDeclinedCard());
        payment.getDeclinedOperation();
        assertEquals("DECLINED", SqlHelper.getCreditStatus());
    }


    @Test
    void shouldCreditGateNegativeInvalidDataNumberCardLess16Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getNumberCardLess16Digits());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeCardNotInDatabase() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getCardNotInDatabase());
        payment.getDeclinedOperation();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataNumberCardEmptyField() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getNumberCardEmptyField());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataMonthMore12Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getMonthMoreThen12Digits());
        payment.getWrongValidityPeriodCard();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataMonthFor0Before10Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getMonthFrom0Before9Digits());
        payment.getWrongValidityPeriodCard();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataMonth00CurrentYear() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getMonth00CurrentYear());
        payment.getWrongValidityPeriodCard();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataMonth00MoreCurrentYear() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getMonth00MoreCurrentYear());
        payment.getWrongValidityPeriodCard();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataMonthEmptyField() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getMonthEmptyField());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataYearLess22Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getYearLessThan22Digits());
        payment.getExpiredValidityPeriodCard();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataYear00Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getYear00Digits());
        payment.getExpiredValidityPeriodCard();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataYearMoreCurrentYearOn7Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getYearMoreCurrentYearOn7Digits());
        payment.getWrongValidityPeriodCard();
        assertEquals("0", SqlHelper.getOrderCount());
    }


    @Test
    void shouldCreditGateNegativeInvalidDataYearEmptyField() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getYearEmptyField());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataHolderCardCyrillic() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getHolderCardOnCyrillic());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataHolderCardNumber() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getHolderCardNumber());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataHolderCardSpecialSymbols() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getHolderCardSpecialSymbols());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataHolderCardOneWord() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getHolderCardOneWord());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataHolderCardEmptyField() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getHolderCardEmptyField());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataCvc1Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getCvc1Digit());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataCvc2Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getCvc2Digits());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataCvc000Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getCvc000Digits());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataCvcEmptyField() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getCvcEmptyField());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldCreditGateNegativeInvalidDataEmptyField() {
        var startPage = new PaymentPage();
        var payment = startPage.creditPage();
        payment.dataInField(DataHelper.getEmptyFieldCard());
        payment.getWrongFormatFields();
        assertEquals("0", SqlHelper.getOrderCount());
    }

}
