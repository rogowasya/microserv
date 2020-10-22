package ru.iteco.ou.app.prototyp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.iteco.ou.app.prototyp.entity.json.TestJson;

/**
 * Created by FilatovNA(rogowasya@gmail.com) on 21.02.19.
 */

@RestController
public class StartController {

    @ResponseBody
    @RequestMapping(value = "/")
    public String home() {
        return "<div style='color:green'>Prototyp application for ouService!</div>";
    }

    @ResponseBody
    @RequestMapping(value = "/test/")
    public String getTestJson() {
        return new TestJson("Hello!").toJson();
    }

    @ResponseBody
    @RequestMapping(value = "/test/{json}")
    public String setTestJson(@PathVariable("json") String json) {
        return TestJson.fromJson(new TestJson(), json).toString();
    }
}
