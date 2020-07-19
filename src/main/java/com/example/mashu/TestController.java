package com.example.mashu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(HttpSession session, String user) {
        if (session.getAttribute("user")==null)
            session.setAttribute("user",user);
        else {
            user = session.getAttribute("user").toString();
        }
        return "hello world\n" + user;
    }

    @RequestMapping("/index")
    public String index(HttpSession session, String user) {
        if (session.getAttribute("user")==null)
            session.setAttribute("user",user);
        else {
            user = session.getAttribute("user").toString();
        }
        return "index\n" + user;
    }
}
