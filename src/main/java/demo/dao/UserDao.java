package demo.dao;

import demo.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
    void save(User user);
    User getById(Long id);
    void delete(Long id);
}
