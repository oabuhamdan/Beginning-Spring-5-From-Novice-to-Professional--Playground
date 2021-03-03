package com.bsg5.chapter6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;

@Controller
public class GreetingWithModelController {
    @GetMapping("/greeting/{name}")
    //Adding this nice annotation indicates that this method is returning the response, not forwarding it to a template.
    // i.e by adding this annotation, "greeting" will be printed on the screen, by removing it, we will render greeting.html.
    //@ResponseBody
    public String greeting(@PathVariable(name = "name") String name, Model model) {
        HashMap<String, String> modelMap = new HashMap<>();
        modelMap.put("name", name);
        modelMap.put("text", "threadbareLoaf");
        model.addAllAttributes(modelMap);
        return "greeting";
    }
}