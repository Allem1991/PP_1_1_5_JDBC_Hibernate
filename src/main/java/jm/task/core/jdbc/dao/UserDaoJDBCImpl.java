/*package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {

    }
    public void createUsersTable() {
        try(Statement statement = Util.getConnection().createStatement()) {
            statement.executeUpdate("""
                    CREATE TABLE USERS (
                    id INT NOT NULL AUTO_INCREMENT,
                    name VARCHAR(45) NOT NULL,
                    lastname VARCHAR(45) NOT NULL,
                    age TINYINT NOT NULL,
                    primary key (id)
                    );
                    """);
        } catch (SQLException e) {
            System.out.println("Ошибка операции createUsersTable");
        }
        Util.closeConnection();
    }

    public void dropUsersTable() {
        try(Statement statement = Util.getConnection().createStatement()) {
            statement.executeUpdate("DROP TABLE USERS;");
        } catch (SQLException e) {
            System.out.println("Ошибка операции dropUsersTable");
        }
        Util.closeConnection();
    }

    public void saveUser(String name, String lastName, byte age) {
        String INSERT_NEW = "INSERT INTO USERS (name, lastname, age) VALUES (?, ?, ?)";
        try(PreparedStatement preparedStatement = Util.getConnection().prepareStatement(INSERT_NEW)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lastName);
            preparedStatement.setByte(3, age);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Util.closeConnection();
    }

    public void removeUserById(long id) {
        String REMOVE_USER = "DELETE FROM USERS WHERE id = ?";
        try(PreparedStatement preparedStatement = Util.getConnection().prepareStatement(REMOVE_USER)) {
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Util.closeConnection();
    }

    public List<User> getAllUsers() {
        String GET_ALL = "SELECT * FROM USERS";
        List<User> userList = new ArrayList<>();
        try(PreparedStatement preparedStatement = Util.getConnection().prepareStatement(GET_ALL)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                long id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String lastname = resultSet.getString("lastname");
                byte age = resultSet.getByte("age");
                userList.add(new User(name, lastname, age));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Util.closeConnection();
        return userList;
    }

    public void cleanUsersTable() {
        String REMOVE_ALL = "DELETE FROM USERS";
        try(PreparedStatement preparedStatement = Util.getConnection().prepareStatement(REMOVE_ALL)) {
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Util.closeConnection();
    }

}

 */
