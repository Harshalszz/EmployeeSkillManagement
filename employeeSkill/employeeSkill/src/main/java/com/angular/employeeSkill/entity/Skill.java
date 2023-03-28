package com.angular.employeeSkill.entity;


import jakarta.persistence.*;

@Entity
@Table(name ="skill")
public class Skill {

    @Id
    @Column(name = "skill_id", length = 50)
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int skillId;

    @Column(name = "skill_name", length = 50)
    private  String skillName;

    @Column(name = "skill_rating", length = 10)
    private  int skillRating;

    @Column(name = "skill_experience", length = 10)
    private  int skillExp;

    @Column(name = "skill_duration", length = 50)
    private  String skillDuration;


    @Column(name = "skill_certificate", length = 50)
    private  String skillCertificate;

    public Skill(String skillName, int skillRating, int skillExp, String skillDuration, String skillCertificate) {

        this.skillName = skillName;
        this.skillRating = skillRating;
        this.skillExp = skillExp;
        this.skillDuration = skillDuration;
        this.skillCertificate = skillCertificate;
    }

    public Skill(){ }


    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getSkillRating() {
        return skillRating;
    }

    public void setSkillRating(int skillRating) {
        this.skillRating = skillRating;
    }

    public int getSkillExp() {
        return skillExp;
    }

    public void setSkillExp(int skillExp) {
        this.skillExp = skillExp;
    }

    public String getSkillDuration() {
        return skillDuration;
    }

    public void setSkillDuration(String skillDuration) {
        this.skillDuration = skillDuration;
    }

    public String getSkillCertificate() {
        return skillCertificate;
    }

    public void setSkillCertificate(String skillCertificate) {
        this.skillCertificate = skillCertificate;
    }



}
