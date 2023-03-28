package com.angular.employeeSkill.Service;

import com.angular.employeeSkill.DTO.SkillDTO;
import com.angular.employeeSkill.DTO.SkillSaveDTO;
import com.angular.employeeSkill.DTO.SkillUpdateDTO;
import com.angular.employeeSkill.SkillRepo.SkillRepo;
import com.angular.employeeSkill.entity.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillServiceIMPL implements SkillService{

    @Autowired
    private SkillRepo skillRepo;
    @Override
    public String addSkill(SkillSaveDTO skillSaveDTO) {
        Skill skill = new Skill(
                skillSaveDTO.getSkillName(),
                skillSaveDTO.getSkillRating(),
                skillSaveDTO.getSkillExp(),
                skillSaveDTO.getSkillDuration(),
                skillSaveDTO.getSkillCertificate()

        );
        skillRepo.save(skill);

        return skill.getSkillName();
    }

    @Override
    public List<SkillDTO> getAllSkill() {
        List<Skill> getSkills = skillRepo.findAll();
        List<SkillDTO> skillDTOList = new ArrayList<>();
        for(Skill a:getSkills)
        {
            SkillDTO skillDTO = new SkillDTO(

                    a.getSkillId(),
                    a.getSkillName(),
                    a.getSkillRating(),
                    a.getSkillExp(),
                    a.getSkillCertificate(),
                    a.getSkillDuration()
            );
            skillDTOList.add(skillDTO);
        }

        return  skillDTOList;
    }

    @Override
    public String updateSkill(SkillUpdateDTO skillUpdateDTO ) {
        if (skillRepo.existsById(skillUpdateDTO.getSkillId())) {
            Skill skill = skillRepo.getById(skillUpdateDTO.getSkillId());

            skill.setSkillName((skillUpdateDTO.getSkillName()));
            skill.setSkillRating((skillUpdateDTO.getSkillRating()));
            skill.setSkillExp((skillUpdateDTO.getSkillExp()));
            skill.setSkillDuration((skillUpdateDTO.getSkillDuration()));
            skill.setSkillCertificate((skillUpdateDTO.getSkillCertificate()));
            skillRepo.save(skill);


        }
        else
        {
            System.out.println("Skill ID do not Exist");
        }

        return null;
    }

    @Override
    public boolean deleteSkill(int id) {

        if(skillRepo.existsById(id))
        {
            skillRepo.deleteById(id);
        }
        else
        {
            System.out.println("skill id not found");
        }

        return true;
    }
}
