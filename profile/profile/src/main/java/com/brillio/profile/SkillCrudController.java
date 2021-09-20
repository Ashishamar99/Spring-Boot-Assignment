package com.brillio.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@RequestMapping("/skill")
public class SkillCrudController {

    @Autowired
    SkillDAO skillDAO;

    @PostMapping("/insert")
    public String insertSkill(@RequestBody SkillDTO sDTO){
        try{
            skillDAO.save(sDTO);
            return "Skill is Inserted";
        }catch (Exception e){
            return (e.getMessage());
        }
    }

    @PutMapping("/update")
    public String updateSkill(@RequestBody SkillDTO sDTO){
        try{
            skillDAO.save(sDTO);
            return "Skill is Updated";
        }catch (Exception e){
            return (e.getMessage());
        }
    }

    @DeleteMapping("/delete/{sid}")
    public String deleteSkill(@PathVariable String sid){
        try{
            skillDAO.deleteById(sid);
            return "Skill is Deleted";
        }catch (Exception e){
            return (e.getMessage());
        }
    }
}
