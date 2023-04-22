Реализованы базовые CRUD операции
по работе с локальной SQLite БД.

Логирование.
Применение Java Logging API,
пакет java.util.logging (JUL)
----------------------------------------------

1) Создаем Maven-проект.
В Advanced Settings можем прописать org.example.app

2) В pom.xml добавляем зависимости

SQLite JDBC Driver
https://github.com/xerial/sqlite-jdbc
https://mvnrepository.com/artifact/org.xerial/sqlite-jdbc

3) В src/main/resources создаем папку database

4) Через DB Browser for SQLite (https://sqlitebrowser.org/),
в src/main/resources/database, создаем файл БД (Users_db.db).

5) Через DB Browser for SQLite создаем таблицу в БД (Users)

SQL-запрос на создание таблицы:

CREATE TABLE IF NOT EXISTS Users (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  name TEXT NOT NULL,
  phone TEXT NOT NULL
)

ВНИМАНИЕ. После манипуляций в базе данных,
в DB Browser for SQLite, записываем изменения.

6) В src/main/java/org/example/app создаем пакеты, классы.
Пишем код.

7) Проверяем функционал проекта.

8) Прописываем функционал логирования.

9) Проверяем функционал проекта, с учетом логирования.
