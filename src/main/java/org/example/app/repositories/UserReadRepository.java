package org.example.app.repositories;

import org.example.app.database.DBConn;
import org.example.app.entities.User;
import org.example.app.utils.Constants;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserReadRepository {

    private static final Logger LOGGER =
            Logger.getLogger(UserReadRepository.class.getName());

    public List<User> readUsers() {

        try (Statement stmt = DBConn.connect().createStatement()) {

            List<User> list = new ArrayList<>();

            String sql = "SELECT * FROM " + Constants.TABLE_USERS;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                User User = new User();
                User.setId(rs.getInt("id"));
                User.setName(rs.getString("name"));
                User.setPhone(rs.getString("phone"));
                User.setEmail(rs.getString("email"));
                list.add(User);
            }
            // Возвращаем коллекцию данных
            return list;
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, Constants.LOG_DB_ERROR_MSG);
            // Если ошибка - возвращаем пустую коллекцию
            return Collections.emptyList();
        }
    }
}
