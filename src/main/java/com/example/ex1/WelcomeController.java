package com.example.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WelcomeController {

    @GetMapping("/name")
public String myName(){
    return "my name is khaled";
}
@GetMapping("/age")
public String myAge(){
    return " my age is 23";
}
@GetMapping("/check/status")
public String status(){
    return "Everything ok";
}

@GetMapping("/health")
public String health(){
    return "Server health is up and running";
}

@GetMapping("/names")
public ArrayList<String> names(){
    ArrayList<String> names = new ArrayList<>();
    names.add("mohammed");
    names.add("khaled");
    names.add("omar");
    return names;
}

}
