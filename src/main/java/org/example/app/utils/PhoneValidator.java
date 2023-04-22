package org.example.app.utils;

// Валидация телефона
public class PhoneValidator {
    public static boolean isPhoneValid(String phone) {
        return phone.isEmpty() || !phone.matches(Constants.PHONE_RGX);
    }
}
