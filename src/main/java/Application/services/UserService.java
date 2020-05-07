package Application.services;

import Application.datastore.UserRepository;
import Application.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User>getAllUsers(){
        return userRepository.findAll();
    }
    public Optional<User> findById(String id){
        return userRepository.findById(id);
    }

    public User postUser(User user){
        user = userRepository.save(user);
        return user;
    }
}
