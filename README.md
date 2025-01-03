# UsersCRUD - Web Application

**Opis:**  
Aplikacja `UsersCRUD` to prosta aplikacja webowa umożliwiająca zarządzanie użytkownikami w systemie. Użytkownicy mogą być dodawani, edytowane, wyświetlani oraz usuwani. Aplikacja jest oparta na technologii Java, z wykorzystaniem serwletów i JSP (Java Server Pages), oraz korzysta z bazy danych MySQL do przechowywania danych.

---

## Spis treści

- [Opis aplikacji](#opis-aplikacji)
- [Wymagania](#wymagania)

---

## Opis aplikacji

Aplikacja `UsersCRUD` pozwala na:

1. **Dodawanie użytkowników (Create)**  
   Formularz umożliwia dodanie nowych użytkowników do systemu. Po wprowadzeniu danych (nazwa użytkownika, email, hasło) dane są zapisywane w bazie danych.

2. **Wyświetlanie użytkownika (Show)**  
   Użytkownicy mogą przeglądać szczegóły użytkownika w systemie.

3. **Edycja użytkowników (Update)**  
   Użytkownicy mogą edytować swoje dane, takie jak nazwa użytkownika, email oraz hasło. Po zapisaniu zmian dane są zaktualizowane w bazie.

4. **Usuwanie użytkowników (Delete)**  
   Użytkownicy mogą usunąć swoje konto z systemu. Po potwierdzeniu użytkownik zostaje usunięty z bazy danych.

Dane użytkowników przechowywane są w bazie danych MySQL. Aplikacja korzysta z klas `User` i `UserDao`, które zostały stworzone podczas poprzednich warsztatów.

Projekt znajduje się w repozytorium GitHub: [Workshop-2](https://github.com/Maksim29AM/Workshop-2).


---

## Wymagania

Aby uruchomić aplikację, musisz mieć zainstalowane następujące narzędzia:

- **Java 8 lub wyższa**  
- **MySQL 5.7 lub wyższa**
- **Apache Tomcat 9.x** (lub inny serwer aplikacji zgodny z serwletami)
- **Maven** (opcjonalnie, jeśli używasz do zarządzania zależnościami)
