package controller;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.SignInService;

@Controller
public class UserController {

    @Autowired
    private SignInService signInService;

    @RequestMapping("/")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("toSignIn")
    public String toSignIn() {
        return "signIn";
    }

    @RequestMapping("signIn")
    public String signIn(User user) {
        signInService.signIn(user);
        return "login";
    }
}
