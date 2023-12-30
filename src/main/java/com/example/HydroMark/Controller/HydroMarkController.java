package com.example.HydroMark.Controller;

import com.example.HydroMark.Data.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HydroMarkController {
    Data data = new Data();

    @GetMapping("/")
    public String HomePage() {
        return "Welcome";
    }
    @GetMapping("/entity")
    public String demo(@RequestParam String name, String email, long mobile) {
        return data.setValue(name, email,mobile);
    }
}
