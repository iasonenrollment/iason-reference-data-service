package com.reference.data.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: HomeController
 * Inside the package - com.reference.data.config
 * Created Date: 5/4/2020
 * Created Time: 3:38 PM
 **/
@Controller
@Slf4j
public class HomeController {
    @RequestMapping(value = "/")
    public String index() {
        log.info("swagger-ui.html");
        return "redirect:swagger-ui.html";
    }
}
