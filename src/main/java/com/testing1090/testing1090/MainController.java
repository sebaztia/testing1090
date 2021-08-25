package com.testing1090.testing1090;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MainController {

    @GetMapping
    public List<Booke> getAll() {

        return Arrays.asList(new Booke(2L, "jaan", "janammaa"), new Booke(2L, "cooy", "coyappan"));
    }
}
