package web.Service;


import web.Model.User;

import java.util.List;

public interface UserService {
    List<User> listAll();
    void delete(Long id);
    void save(User user);
    void update(Long id, User updatedUser);
    User show(Long id);


}
