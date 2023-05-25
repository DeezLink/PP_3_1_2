package ru.deezlink.PP_3_1_2.service;


import ru.deezlink.PP_3_1_2.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void save(User user);

    User showUser(int id);

    void editUser(User user);

    void deleteUser(int id);
}