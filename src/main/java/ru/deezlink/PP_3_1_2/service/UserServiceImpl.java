package ru.deezlink.PP_3_1_2.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.deezlink.PP_3_1_2.dao.UserDao;
import ru.deezlink.PP_3_1_2.model.User;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public User showUser(int id) {
        return userDao.showUser(id);
    }

    @Override
    @Transactional
    public void editUser(User user) {
        userDao.editUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
