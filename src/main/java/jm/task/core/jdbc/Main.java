package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Kamil", "Khusnullin", (byte) 22);
        userService.saveUser("Andrew", "Matt", (byte) 12);
        userService.saveUser("Scott", "Smith", (byte) 76);
        userService.saveUser("Amanda", "Plow", (byte) 34);

        userService.getAllUsers().forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();

        Util.closeSessionFactory();
    }
}
