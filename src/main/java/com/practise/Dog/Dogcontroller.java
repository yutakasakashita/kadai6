package com.practise.Dog;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dogcontroller {

    @GetMapping("/dog")
    public Dog Introduction() {
        return new Dog("pochi", 5, "Chihuahua");
    }

}
