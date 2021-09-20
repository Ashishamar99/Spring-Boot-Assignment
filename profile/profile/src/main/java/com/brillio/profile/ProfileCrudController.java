package com.brillio.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@RequestMapping("/profile")
public class ProfileCrudController {

    @Autowired
    ProfileDAO profileDAO;


    @PostMapping("/insert")
    public String insertProfile(@RequestBody ProfileDTO pDTO){
        try{
            profileDAO.save(pDTO);
            return "Data is Inserted";
        }catch (Exception e){
            return (e.getMessage());
        }
    }

    @PutMapping("/update")
    public String updateProfile(@RequestBody ProfileDTO pDTO){
        try{
            profileDAO.save(pDTO);
            return "Data is Updated";
        }catch (Exception e){
            return (e.getMessage());
        }
    }

    @DeleteMapping("/delete/{pid}")
    public String deleteProfile(@PathVariable String pid){
        try{
            profileDAO.deleteById(pid);
            return "Data is Deleted";
        }catch (Exception e){
            return (e.getMessage());
        }
    }
}
