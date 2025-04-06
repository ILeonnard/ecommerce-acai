package com.ileonnard.ecommerce_acai.resources;

import com.ileonnard.ecommerce_acai.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {


    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Leonard", "leonnard@gmail.com", "999999999", "1234455");
        return ResponseEntity.ok().body(u);
    }
}
