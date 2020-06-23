package com.demo.springbootsoapclientexample.endpoint;

import com.demo.springbootsoapclientexample.auto.generated.GetUserRequest;
import com.demo.springbootsoapclientexample.auto.generated.GetUserResponse;
import com.demo.springbootsoapclientexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserEndPoint {

    @Autowired
    private UserService userService;

    @GetMapping
    public GetUserResponse getUserRequest(@RequestBody GetUserRequest request) {
        return userService.getUser(request);
    }
}
