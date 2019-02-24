package ru.iteco.micro.gatewayservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by FilatovNA(rogowasya@gmail.com) on 21.02.19.
 */

@RestController
public class StartController {

    @ResponseBody
    @RequestMapping(value = "/")
    public String home(){
        return "<div style='color:green'>Prototyp application for MicroService!</div>";
    }

}
