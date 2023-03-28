package com.angular.employeeSkill.SkillController;


import com.angular.employeeSkill.DTO.SkillDTO;
import com.angular.employeeSkill.DTO.SkillSaveDTO;
import com.angular.employeeSkill.DTO.SkillUpdateDTO;
import com.angular.employeeSkill.Service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/skill")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @PostMapping(path = "/save")
    public String saveSkill(@RequestBody SkillSaveDTO skillSaveDTO){

        String id = skillService.addSkill(skillSaveDTO);
        return id;
    }

    @GetMapping(path = "/getAllSkills")
    public List<SkillDTO> getAllSkills()
    {
        List<SkillDTO> allSkills = skillService.getAllSkill();
        return allSkills;
    }

    @PutMapping(path = "/update")
    public String updateSkill(@RequestBody SkillUpdateDTO skillUpdateDTO)
    {
        String id = skillService.updateSkill(skillUpdateDTO);
        return id;
    }

    @DeleteMapping(path = "/deleteskill/{id}")
    public String deleteSkill(@PathVariable(value = "id") int id)
    {
        boolean deleteSkill = skillService.deleteSkill(id);
        return "deleted";
    }



}
