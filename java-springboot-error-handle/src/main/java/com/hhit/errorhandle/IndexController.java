package com.hhit.errorhandle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(ModelMap modelMap) throws Exception {
        System.out.println("throw the exception");
        throw new Exception("");
    }

    @RequestMapping("/json")
    public String json(ModelMap modelMap) throws Exception {
        System.out.println("throw the exception json");
        throw new HHException("发生错误");
    }
}
