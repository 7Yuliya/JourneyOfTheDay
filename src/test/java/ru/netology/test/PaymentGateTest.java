package ru.netology.test;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

import org.junit.jupiter.api.*;
import ru.netology.data.DataHelper;
import ru.netology.data.SqlHelper;
import ru.netology.page.PaymentPage;


import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentGateTest {
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
    void shouldPaymentGatePositiveValidDataHolderOnLatinApprovedCard() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getHolderOnLatinApprovedCard());
        payment.getApprovedOperation();
        assertEquals("APPROVED", SqlHelper.getPaymentStatus());
    }

    @Test
    void shouldPaymentGatePositiveValidDataHolderContainsAHyphenApprovedCard() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getHolderContainsAHyphenApprovedCard());
        payment.getApprovedOperation();
        assertEquals("APPROVED", SqlHelper.getPaymentStatus());
    }

    @Test
    void shouldPaymentGatePositiveValidDataHolderOnLatinDeclinedCard() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getHolderOnLatinDeclinedCard());
        payment.getDeclinedOperation();
        assertEquals("DECLINED", SqlHelper.getPaymentStatus());
    }

    @Test
    void shouldPaymentGatePositiveValidDataHolderContainsAHyphenDeclinedCard() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getHolderContainsAHyphenDeclinedCard());
        payment.getDeclinedOperation();
        assertEquals("DECLINED", SqlHelper.getPaymentStatus());
    }


    @Test
    void shouldPaymentGateNegativeInvalidDataNumberCardLess16Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getNumberCardLess16Digits());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeCardNotInDatabase() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getCardNotInDatabase());
        payment.getDeclinedOperation();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataNumberCardEmptyField() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getNumberCardEmptyField());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataMonthMore12Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getMonthMoreThen12Digits());
        payment.getWrongValidityPeriodCard();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataMonthFor0Before10DigitMoreCurrentYear() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getMonthFrom0Before9Digits());
        payment.getWrongValidityPeriodCard();
        assertEquals("0", SqlHelper.getOrderCount());
    }


    @Test
    void shouldPaymentGateNegativeInvalidDataMonth00CurrentYear() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getMonth00CurrentYear());
        payment.getWrongValidityPeriodCard();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataMonth00MoreCurrentYear() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getMonth00MoreCurrentYear());
        payment.getWrongValidityPeriodCard();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataMonthEmptyField() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getMonthEmptyField());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataYearLess22Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getYearLessThan22Digits());
        payment.getExpiredValidityPeriodCard();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataYear00Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getYear00Digits());
        payment.getExpiredValidityPeriodCard();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataYearMoreCurrentYearOn7Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getYearMoreCurrentYearOn7Digits());
        payment.getWrongValidityPeriodCard();
        assertEquals("0", SqlHelper.getOrderCount());
    }


    @Test
    void shouldPaymentGateNegativeInvalidDataYearEmptyField() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getYearEmptyField());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataHolderCardCyrillic() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getHolderCardOnCyrillic());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataHolderCardNumber() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getHolderCardNumber());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataHolderCardSpecialSymbols() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getHolderCardSpecialSymbols());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataHolderCardOneWord() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getHolderCardOneWord());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataHolderCardEmptyField() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getHolderCardEmptyField());
        payment.getRequiredField();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataCvc1Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getCvc1Digit());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataCvc2Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getCvc2Digits());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataCvc000Digit() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getCvc000Digits());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataCvcEmptyField() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getCvcEmptyField());
        payment.getWrongFormat();
        assertEquals("0", SqlHelper.getOrderCount());
    }

    @Test
    void shouldPaymentGateNegativeInvalidDataEmptyField() {
        var startPage = new PaymentPage();
        var payment = startPage.buyPage();
        payment.dataInField(DataHelper.getEmptyFieldCard());
        payment.getWrongFormatFields();
        assertEquals("0", SqlHelper.getOrderCount());
    }

}

