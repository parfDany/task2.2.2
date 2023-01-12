package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> listAll();
    void delete(Long id);
    void save(User user);

    void update(Long id, User updatedUser);

    User show(Long id);
}
