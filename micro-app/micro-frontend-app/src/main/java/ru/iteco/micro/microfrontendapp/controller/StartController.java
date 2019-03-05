package ru.iteco.micro.microfrontendapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.iteco.micro.microfrontendapp.entity.json.TestJson;

/**
 * Created by FilatovNA(rogowasya@gmail.com) on 21.02.19.
 */

@Controller
public class StartController {

    @GetMapping("/test")
    public String test(Model model){
        String json = new TestJson("Hello! I`m simple json").toJson();
        model.addAttribute("json", json);
        return "test";
    }

    @ResponseBody
    @RequestMapping(value = "/test/{json}")
    public String setTestJson(@PathVariable("json") String json){
        return TestJson.fromJson(new TestJson(), json).toString();
    }
}
