package org.example.app.utils;

// Валидация email
public class EmailValidator {
    public static boolean isEmailValid(String email) {
        return email.isEmpty() || !email.matches(Constants.EMAIL_RGX);
    }
}
