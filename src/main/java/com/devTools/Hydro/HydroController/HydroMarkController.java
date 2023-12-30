package com.devTools.Hydro.HydroController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HydroMarkController {

    @RequestMapping("")
    public String home(){
        return "hydro";
    }
}
