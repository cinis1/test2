package com.test.tigrinho;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jackpot {
    @GetMapping(path = "/jackpot")
    public static String jackpot (){
        return "jackpot!";
    }

}
