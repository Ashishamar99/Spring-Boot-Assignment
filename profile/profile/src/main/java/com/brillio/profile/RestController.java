package com.brillio.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@Component
public class RestController {

    @Autowired
    ProfileDAO profileDAO;

    @GetMapping("/")
    public String firstMethod(){
        return "Welcome to Profile Application";
    }

    @GetMapping("/getProfiles")
    public List<ProfileDTO> getAllProfiles(){
        return profileDAO.findAll();
    }
}
