package ru.netology.data;

import com.github.javafaker.Faker;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class DataHelper {

    public static Card getHolderOnLatinApprovedCard() {

        Faker faker = new Faker();
        String month = getNextMonth();
        String year = getNextYear(1);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(3);


        return new Card("4444444444444441", month, year, holderCard, cvc);
    }

    public static Card getHolderContainsAHyphenApprovedCard() {

        Faker faker = new Faker();
        String month = getNextMonth();
        String year = getNextYear(1);
        String cvc = faker.number().digits(3);


        return new Card("4444444444444441", month, year, "Nikolay Ivanov-Petrov", cvc);
    }


    public static Card getHolderOnLatinDeclinedCard() {

        Faker faker = new Faker();
        String month = getNextMonth();
        String year = getNextYear(1);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(3);


        return new Card("4444444444444442", month, year, holderCard, cvc);
    }

    public static Card getHolderContainsAHyphenDeclinedCard() {

        Faker faker = new Faker();
        String month = getNextMonth();
        String year = getNextYear(1);
        String cvc = faker.number().digits(3);


        return new Card("4444444444444442", month, year, "Nikolay Ivanov-Petrov", cvc);
    }


    public static String getNextMonth() {
        LocalDate currentMonth = LocalDate.now();
        int month = currentMonth.getMonthValue();
        return String.format("%02d", month);
    }

    public static String getNextYear(int yearCount) {
        return LocalDate.now().plusYears(yearCount).format(DateTimeFormatter.ofPattern("YY"));
    }

    public static Card getNumberCardLess16Digits() {
        Faker faker = new Faker();
        String numberCard = faker.number().digits(12);
        String month = getNextMonth();
        String year = getNextYear(2);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(3);

        return new Card(numberCard, month, year, holderCard, cvc);
    }

    public static Card getCardNotInDatabase() {
        Faker faker = new Faker();
        String month = getNextMonth();
        String year = getNextYear(1);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(3);
        return new Card("4444444444444443", month, year, holderCard, cvc);
    }

    public static Card getNumberCardEmptyField() {
        Faker faker = new Faker();
        String month = getNextMonth();
        String year = getNextYear(2);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(3);

        return new Card("", month, year, holderCard, cvc);
    }

    public static Card getMonthMoreThen12Digits() {
        Faker faker = new Faker();
        String year = getNextYear(1);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(3);
        return new Card("4444444444444441", "14", year, holderCard, cvc);

    }

    public static Card getMonthFrom0Before9Digits() {
        Faker faker = new Faker();
        String month = faker.number().digit();
        String year = getNextYear(1);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(3);
        return new Card("4444444444444441", month, year, holderCard, cvc);
    }


    public static Card getMonth00CurrentYear() {
        Faker faker = new Faker();
        String year = getNextYear(0);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(3);
        return new Card("4444444444444441", "00", year, holderCard, cvc);
    }

    public static Card getMonth00MoreCurrentYear() {
        Faker faker = new Faker();
        String year = getNextYear(2);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(3);
        return new Card("4444444444444441", "00", year, holderCard, cvc);
    }

    public static Card getMonthEmptyField() {
        Faker faker = new Faker();
        String year = getNextYear(1);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(3);
        return new Card("4444444444444441", "", year, holderCard, cvc);

    }

    public static Card getYearLessThan22Digits() {
        Faker faker = new Faker();
        String month = getNextMonth();
        String year = getNextYear(-3);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(3);
        return new Card("4444444444444441", month, year, holderCard, cvc);
    }

    public static Card getYear00Digits() {
        Faker faker = new Faker();
        String month = getNextMonth();
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(3);
        return new Card("4444444444444441", month, "00", holderCard, cvc);
    }

    public static Card getYearMoreCurrentYearOn7Digits() {
        Faker faker = new Faker();
        String month = getNextMonth();
        String year = getNextYear(7);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(3);
        return new Card("4444444444444441", month, year, holderCard, cvc);
    }


    public static Card getYearEmptyField() {
        Faker faker = new Faker();
        String month = getNextMonth();
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(3);
        return new Card("4444444444444441", month, "", holderCard, cvc);
    }

    public static Card getHolderCardOnCyrillic() {
        Faker faker = new Faker(new Locale("ru"));
        String month = getNextMonth();
        String year = getNextYear(3);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(3);
        return new Card("4444444444444441", month, year, holderCard, cvc);
    }

    public static Card getHolderCardNumber() {
        Faker faker = new Faker();
        String month = getNextMonth();
        String year = getNextYear(1);
        String holderCard = faker.number().digit();
        String cvc = faker.number().digits(3);
        return new Card("4444444444444441", month, year, holderCard, cvc);
    }

    public static Card getHolderCardSpecialSymbols() {
        Faker faker = new Faker();
        String month = getNextMonth();
        String year = getNextYear(1);
        String holderCard = "%";
        String cvc = faker.number().digits(3);
        return new Card("4444444444444441", month, year, holderCard, cvc);
    }

    public static Card getHolderCardOneWord() {
        Faker faker = new Faker();
        String month = getNextMonth();
        String year = getNextYear(1);
        String holderCard = faker.name().firstName();
        String cvc = faker.number().digits(3);
        return new Card("4444444444444441", month, year, holderCard, cvc);
    }

    public static Card getHolderCardEmptyField() {
        Faker faker = new Faker();
        String month = getNextMonth();
        String year = getNextYear(1);
        String cvc = faker.number().digits(3);
        return new Card("4444444444444441", month, year, "", cvc);
    }

    public static Card getCvc1Digit() {
        Faker faker = new Faker();
        String month = getNextMonth();
        String year = getNextYear(1);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(1);
        return new Card("4444444444444441", month, year, holderCard, cvc);
    }

    public static Card getCvc2Digits() {
        Faker faker = new Faker();
        String month = getNextMonth();
        String year = getNextYear(2);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        String cvc = faker.number().digits(2);
        return new Card("4444444444444441", month, year, holderCard, cvc);
    }

    public static Card getCvc000Digits() {
        Faker faker = new Faker();
        String month = getNextMonth();
        String year = getNextYear(2);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        return new Card("4444444444444441", month, year, holderCard, "000");
    }

    public static Card getCvcEmptyField() {
        Faker faker = new Faker();
        String month = getNextMonth();
        String year = getNextYear(2);
        String holderCard = faker.name().firstName() + " " + faker.name().lastName();
        return new Card("4444444444444441", month, year, holderCard, "");
    }

    public static Card getEmptyFieldCard() {
        return new Card("", "", "", "", "");
    }
}
