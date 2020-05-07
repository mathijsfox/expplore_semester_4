package Application.REST.controllers;


import Application.models.User;
import Application.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //user wordt ontvangen vanuit frontend en wordt in de database opgeslagen.
    @PostMapping
    public User postUser(@RequestBody User user){
        return userService.postUser(user);
    }

    @GetMapping
    public List<User>getUsers(){
        return userService.getAllUsers();
    }
    //todo maak frontend user aan.
}
