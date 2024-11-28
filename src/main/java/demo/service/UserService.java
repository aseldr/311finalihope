package demo.service;

import demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void save(User user);
    User getById(Long id);
    void delete(Long id);
}