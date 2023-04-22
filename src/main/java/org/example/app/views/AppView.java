package org.example.app.views;

import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppView {

    Scanner scanner;
    int option;

    public int chooseOption() {
        scanner = new Scanner(System.in);
        showMenu();
        try {
            option = scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println(Constants.INCORRECT_VALUE_MSG);
            AppStarter.startApp();
        }
        return option;
    }

    private void showMenu() {
        System.out.print("""
                
                ______ MENU ___________
                1 - Create a User.
                2 - View Users.
                3 - Update the User's phone number.
                4 - Delete User.
                0 - Close the App.
                """);
    }

    public void getOutput(int choice, String output) {
        if (choice == 0) System.out.println(output);
        // Scanner лучше закрыть здесь,
        // т.к. в этом методе завершаем программу.
        scanner.close();
        System.exit(0);
    }
}
