package com.angular.employeeSkill.Service;

import com.angular.employeeSkill.DTO.SkillDTO;
import com.angular.employeeSkill.DTO.SkillSaveDTO;
import com.angular.employeeSkill.DTO.SkillUpdateDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SkillService {
    String addSkill(SkillSaveDTO skillSaveDTO);

    List<SkillDTO> getAllSkill();

    String updateSkill(SkillUpdateDTO skillUpdateDTO);

    boolean deleteSkill(int id);
}
