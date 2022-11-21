# Дипломный проект по профессии «Тестировщик»

В рамках дипломного проекта требовалось автоматизировать тестовые сценарии сервиса "Путешествие дня", взаимодействующего с СУБД и API Банка.

Для покупки тура используются два способа:  

1. Обычная оплата по дебетовой карте
2. Уникальная технология: выдача кредита по данным банковской карты

[Ссылка на Дипломное задание](https://github.com/netology-code/qa-diploma)

## Тестовая документация

1. [План тестирования](https://github.com/7Yuliya/JourneyOfTheDay/blob/master/documents/Plan.md)
2. [Отчётные документы по итогам  тестирования](https://github.com/7Yuliya/JourneyOfTheDay/blob/master/documents/Report.md)
3. [Отчетные документы по итогам автоматизации](https://github.com/7Yuliya/JourneyOfTheDay/blob/master/documents/Summary.md)

## Запуск приложения

### Подготовительный этап

1. Установить и запустить IntelliJ IDEA;
2. Установать и запустить Docker Desktop;
3. Открыть проект в IntelliJ IDEA

### Запуск тестов

### MySQL:

1. В application.properties использовать:

   `spring.datasource.url=jdbc:mysql://localhost:3306/app`

2. Поднять контейнеры MySQL, Node.js, используя команду в терминале:

   `docker-compose -f docker-compose-mysql.yml up`

3. Запустить jar файл, используя команду в терминале:

   `java "-Dspring.datasource.url=jdbc:mysql://localhost:3306/app" -jar artifacts/aqa-shop.jar`

4. Убедиться в готовности системы. Приложение должно быть доступно по адресу:

   `http://localhost:8080/`

5. Запустить автотесты в новой вкладке терминала, используя зеленый треугольник в IDEA либо через команду в терминале:

   `gradlew clean test "-Ddb.url=jdbc:mysql://localhost:3306/app"`

6. Остановить контейнеры, используя команду в терминале:

   `docker-compose -f docker-compose-mysql.yml down`

### PostgreSQL:

1. Поднять контейнеры MySQL, Node.js, используя команду в терминале:

   `docker-compose -f docker-compose-postgresql.yml up`

2. Запустить jar файл, используя команду в терминале:

   `java "-Dspring.datasource.url=jdbc:postgresql://localhost:5432/app" -jar artifacts/aqa-shop.jar`

3. Убедиться в готовности системы. Приложение должно быть доступно по адресу:

   `http://localhost:8080/`

4. Запустить автотесты в новой вкладке терминала, используя зеленый треугольник в IDEA либо через команду в терминале:

   `gradlew clean test "-Ddb.url=jdbc:postgresql://localhost:5432/app"`

5. Остановить контейнеры, используя команду в терминале:

   `docker-compose -f docker-compose-postgresql.yml down`


### Перезапуск тестов и приложения

Для остановки приложения в окне терминала ввести команду `Ctrl+С` и повторить необходимые действия из предыдущих разделов

## Формирование отчёта тестирования

Предусмотрено формирование отчётности, используя Allure Report. В новой вкладке терминала вводим команду:

`gradlew allureServe`
