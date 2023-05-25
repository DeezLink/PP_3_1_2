package ru.deezlink.PP_3_1_2.dao;


import ru.deezlink.PP_3_1_2.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    void save(User user);

    User showUser(int id);

    void editUser(User user);

    void deleteUser(int id);
}