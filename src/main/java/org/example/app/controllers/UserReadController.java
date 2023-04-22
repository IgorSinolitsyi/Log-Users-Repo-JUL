package org.example.app.controllers;

import org.example.app.services.UserReadService;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.views.UserReadView;

public class UserReadController {

    UserReadService service;
    UserReadView view;

    public UserReadController(UserReadService service, UserReadView view) {
        this.service = service;
        this.view = view;
    }

    public void readUsers() {
        // Получаем результат.
        String str = service.readUsers();
        // Проверяем результат.
        // Если БД отсутствует, выводим сообщение об этом
        // и закрываем приложение.
        // Иначе выводим сообщение и перезапускаем приложение.
        if (str.equals(Constants.DB_ABSENT_MSG)) {
            // Выводим уведомление.
            view.getOutput(str);
            // Закрываем приложение.
            System.exit(0);
        } else {
            // Выводим уведомление или данные.
            view.getOutput("\n______ UserS ___________\n" + str);
            // Перезапускаем приложение.
            AppStarter.startApp();
        }
    }
}
