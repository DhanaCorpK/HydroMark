package com.example.HydroMark.Data;

import com.example.HydroMark.Service.HydroMarkService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class Data {
    private String name;
    private String email;
    private long mobile;

    private Map<Object, Object> data = new HashMap<>();

    HydroMarkService service = new HydroMarkService();

    public String setValue(String name, String email, long mobile) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        try {
            data.put("NAME", this.name);
            data.put("EMAIL", this.email);
            data.put("MOBILE", this.mobile);
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(data);
            System.out.println(json);
            return  data.toString();
        } catch (Exception e) {
            return "";
        }
    }
}
