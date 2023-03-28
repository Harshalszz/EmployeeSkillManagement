package com.angular.employeeSkill.SkillRepo;

import com.angular.employeeSkill.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@EnableJpaRepositories
@Repository
public interface SkillRepo extends JpaRepository<Skill, Integer> {

}
