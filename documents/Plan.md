# План автоматизации тестирования приложения "Путешествие дня"

**Задача:** Автоматизировать позитивные и негативные сценарии покупки тура через приложение
## 1. Перечень автоматизируемых сценариев
### Позитивные сценарии:

### для Payment Gate:

### Позитивный сценарий №1
 
1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих валидных данных:

**в поле "Номер карты" (со статусом APPROVED: 4444 4444 4444 4441):**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел, заявка на получение карты одобрена, в базе данных запись об успешной операции



### Позитивный сценарий №2

1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих валидных данных:

**в поле "Номер карты" (со статусом APPROVED: 4444 4444 4444 4441):**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести данные в поле, содержащие дефис;


**в поле "CVC/CVV":**

* Ввести данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел, заявка на получение карты одобрена, в базе данных запись об успешной операции


### Позитивный сценарий №3

1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих валидных данных:

**в поле "Номер карты" (со статусом DECLINED: 4444 4444 4444 4442 ):**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел, заявка на получение карты одобрена, в базе данных запись об неуспешной операции


### Позитивный сценарий №4

1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих валидных данных:

**в поле "Номер карты" (со статусом APPROVED: 4444 4444 4444 4442):**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести данные в поле, содержащие дефис;


**в поле "CVC/CVV":**

* Ввести данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел, заявка на получение карты одобрена, в базе данных запись об неуспешной операции

### для Credit Gate:
### Позитивный сценарий №1


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих валидных данных:

**в поле "Номер карты" (со статусом APPROVED: 4444 4444 4444 4441):**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел, заявка на получение карты одобрена, в базе данных запись об успешной операции


### Позитивный сценарий №2

1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих валидных данных:

**в поле "Номер карты" (со статусом APPROVED: 4444 4444 4444 4441):**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести данные в поле, содержащие дефис;


**в поле "CVC/CVV":**

* Ввести данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел, заявка на получение карты одобрена, в базе данных запись об успешной операции


### Позитивный сценарий №3


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих валидных данных:

**в поле "Номер карты" (со статусом DECLINED: 4444 4444 4444 4442 ):**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел, заявка на получение карты одобрена, в базе данных запись об неуспешной операции


### Позитивный сценарий №4

1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих валидных данных:

**в поле "Номер карты" (со статусом APPROVED: 4444 4444 4444 4442):**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести данные в поле, содержащие дефис;


**в поле "CVC/CVV":**

* Ввести данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел, заявка на получение карты одобрена, в базе данных запись об неуспешной операции


### Негативные  сценарии:

### для Payment Gate:

### Негативный сценарий №1 


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести невалидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие менее 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Номер карты" появилась надпись "Неверный формат"


### Негативный сценарий №2


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести невалидные данные **в поле "Номер карты":**

* Пустое поле;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Номер карты" появилась надпись "Неверный формат"



### Негативный сценарий №3


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести невалидные данные в поле, содержащие более 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Месяц" появилась надпись "Неверно указан срок действия карты"


### Негативный сценарий №4


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести невалидные данные в поле, содержащие от 0 до 9 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Месяц" появилась надпись "Неверный формат"


### Негативный сценарий №5


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**Ввести невалидные данные в поле "Месяц":**

* Пустое поле;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Месяц" появилась надпись "Неверный формат"


### Негативный сценарий №6


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести невалидные данные в поле, содержащие менее 22  цифр(менее текущего года);

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Год" появилась надпись "Истёк срок действия карты"


### Негативный сценарий №7


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести данные в поле, содержащие 00 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Год" появилась надпись "Истёк срок действия карты"


### Негативный сценарий №8


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**Ввести невалидные данные в поле "Год":**

* Пустое поле;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Год" появилась надпись "Неверный формат"


### Негативный сценарий №9


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести невалидные данные в поле на кириллиице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Владелец" появилась надпись "Неверный формат"


### Негативный сценарий №10


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести невалидные данные в поле, содержащие цифры;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Владелец" появилась надпись "Неверный формат"


### Негативный сценарий №11


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести невалидные данные в поле, содержащие спецсимволы (кроме дефиса);


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Владелец" появилась надпись "Неверный формат"


### Негативный сценарий №12


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести невалидные данные в поле одним словом;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Владелец" появилась надпись "Неверный формат"


### Негативный сценарий №13


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**Ввести невалидные данные в поле "Владелец":**

* Пустое поле;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Владелец" появилась надпись "Неверный формат"


### Негативный сценарий №14


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести невалидные данные в поле, содержащие 1 цифру;
5. **Ожидаемый результат:** тест прошел и под полем "CVC/CVV" появилась надпись "Неверный формат"


### Негативный сценарий №15


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести невалидные данные в поле, содержащие 2 цифры;
5. **Ожидаемый результат:** тест прошел и под полем "CVC/CVV" появилась надпись "Неверный формат"


### Негативный сценарий №16


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**Ввести невалидные данные в поле "CVC/CVV":**

* Пустое поле;
5. **Ожидаемый результат:** тест прошел и под полем "CVC/CVV" появилась надпись "Неверный формат"


### Негативные  сценарии:

### для Credit Gate:

### Негативный сценарий №1


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести невалидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие менее 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Номер карты" появилась надпись "Неверный формат"


### Негативный сценарий №2


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести невалидные данные **в поле "Номер карты":**

* Пустое поле;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Номер карты" появилась надпись "Неверный формат"



### Негативный сценарий №3


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести невалидные данные в поле, содержащие более 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Месяц" появилась надпись "Неверно указан срок действия карты"


### Негативный сценарий №4


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести невалидные данные в поле, содержащие от 0 до 9 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Месяц" появилась надпись "Неверный формат"


### Негативный сценарий №5


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**Ввести невалидные данные в поле "Месяц":**

* Пустое поле;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Месяц" появилась надпись "Неверный формат"


### Негативный сценарий №6


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести невалидные данные в поле, содержащие менее 22  цифр(менее текущего года);

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Год" появилась надпись "Истёк срок действия карты"


### Негативный сценарий №7


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести данные в поле, содержащие 00 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Год" появилась надпись "Истёк срок действия карты"


### Негативный сценарий №8


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**Ввести невалидные данные в поле "Год":**

* Пустое поле;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Год" появилась надпись "Неверный формат"


### Негативный сценарий №9


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести невалидные данные в поле на кириллиице;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Владелец" появилась надпись "Неверный формат"


### Негативный сценарий №10


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести невалидные данные в поле, содержащие цифры;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Владелец" появилась надпись "Неверный формат"


### Негативный сценарий №11


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести невалидные данные в поле, содержащие спецсимволы (кроме дефиса);


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Владелец" появилась надпись "Неверный формат"


### Негативный сценарий №12


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести невалидные данные в поле одним словом;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Владелец" появилась надпись "Неверный формат"


### Негативный сценарий №13


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**Ввести невалидные данные в поле "Владелец":**

* Пустое поле;


**в поле "CVC/CVV":**

* Ввести валидные данные в поле, содержащие от 000 до 999 цифр;
5. **Ожидаемый результат:** тест прошел и под полем "Владелец" появилась надпись "Неверный формат"


### Негативный сценарий №14


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести невалидные данные в поле, содержащие 1 цифру;
5. **Ожидаемый результат:** тест прошел и под полем "CVC/CVV" появилась надпись "Неверный формат"


### Негативный сценарий №15


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**в поле "CVC/CVV":**

* Ввести невалидные данные в поле, содержащие 2 цифры;
5. **Ожидаемый результат:** тест прошел и под полем "CVC/CVV" появилась надпись "Неверный формат"


### Негативный сценарий №16


1. Создать проект в IntelliJ IDE на базе Gradle;
2. Поднять Docker контейнер (В файле application.properties приведён ряд типовых настроек, заявлена поддержка двух СУБД: MySQL, PostgreSQL, а также Node.js);
3. Запустить jar файл "aqa-shop.jar";
4. Написать автотест с использованием следующих  данных:

* Ввести валидные данные **в поле "Номер карты":**

* Ввести данные в поле, содержащие 16 цифр;

**в поле "Месяц":**

* Ввести валидные данные в поле, содержащие от 10 до 12 цифр;

**в поле "Год":**

* Ввести валидные данные в поле, содержащие от 22 до 27 цифр;

**в поле "Владелец":**

* Ввести валидные данные в поле на латинице;


**Ввести невалидные данные в поле "CVC/CVV":**

* Пустое поле;
5. **Ожидаемый результат:** тест прошел и под полем "CVC/CVV" появилась надпись "Неверный формат"


## 2. Перечень используемых инструментов с обоснованием выбора

1. **Java 11**

Самый востребованный язык для автоматизации, позволяющий работать на большинстве ОС и различном оборудовании.Хоть автоматизация и возможна на других языках программирования,вакансий для автоматизаторов на Java больше.

2. **IntelliJ IDE**

Мультиязычная, поддерживает разные языки программирования, бесплатная. Интегрирована с Git и GitHub.Позволяет использовать систему контроля версий Git и отправлять проекты на GitHub в один клик.  Позволяет настроить нужное окружение.

3. **Git**

Система контроля версий, бесплатная. Одновременная разработка. Работает в автономном режиме, так как почти каждая операция является локальной. Быстрые выпуски

4. **JUnit5**

Получаем больше детализации, можем импортировать только то, что необходимо. Позволяет нескольким исполнителям работать одновременно

5. **Gradle**

Позволяет создать удобный, понятный и быстро реализуемый проект. Проще подключать внешние зависимости. Проработанный API. Подробный и хорошо продуманный программный интерфейс упрощает отслеживание и настройку конфигурации сборки, контроль её исполнения.

6. **Lombok**

Хороший инструмент, который помогает писать меньше кода и больше сосредотачиваться на реальной работе. Генерирует код во время компиляции

7. **Selenide**

Фреймворк для автоматизированного тестирования, построенный  на базе Selenium WebDriver.Очень простой для изучения. Помогает делать стабильные тесты. Откроет браузер, когда он впервые понадобится и закроет, когда он больше не будет нужен.

8. **JavaFaker**

Библиотека, которая позволяет генерировать случайные данные для тестирования работы приложений. Можно заполнить таблицы в базе данных, построить корректные XML-документы, сформировать JSON-ответы для REST.

9. **Docker**

Платформа контейнеризации с открытым исходным кодом, с помощью которой можно автоматизировать создание приложений, их доставку и управление.Позволяет быстрее тестировать и выкладывать приложения, запускать на одной машине требуемое количество контейнеров.

10. **Allure Report**

Инструмент для построения отчётов автотестов. Хорошая информативная визуализация отчётов. Показывает, что происходит в тесте. Для каждого теста прикладывает подробный сценарий выполнения. Позволяет построить единый отчёт, вне зависимости, какой фреймворк используется

## 3. Перечень и описание возможных рисков при автоматизации
1. Сложности с запуском и настройкой SUT;
2. Сложности с настройкой автотестов при отсутствии уникальных css-селекторов в приложении
     
## 4. Интервальная оценка с учётом рисков (в часах)
1. Планирование автоматизации тестирования - 24-48 часов;
2. Написание кода тестов - 72-96 часов;
3. Подготовка отчётных документов по итогам автоматизированного тестирования - 24-48 часов;
4. Подготовка отчётных документов по итогам автоматизации - 24-48 часов

## 5. План сдачи работы
1. Готовность авто-тестов — через 10 рабочих дней после утверждения плана тестирования;
2. Подготовка отчетов по результатам прогона тестов — через 2 рабочих дня после прогона тестов;
3. Подготовка отчета по итогам автоматизации — через 2 рабочих дня после отчетов по результатам прогона тестов.