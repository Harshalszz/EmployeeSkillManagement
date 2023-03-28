package com.angular.employeeSkill.DTO;

public class SkillSaveDTO {

    //private int skillId;
    private  String skillName;
    private  int skillRating;
    private  int skillExp;
    private  String skillDuration;
    private  String skillCertificate;

    public SkillSaveDTO(String skillName, int skillRating, int skillExp, String skillDuration, String skillCertificate) {
        this.skillName = skillName;
        this.skillRating = skillRating;
        this.skillExp = skillExp;
        this.skillDuration = skillDuration;
        this.skillCertificate = skillCertificate;
    }

    public SkillSaveDTO(){ }



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

    @Override
    public String toString() {
        return "Skill{" +

                ", skillName='" + skillName + '\'' +
                ", skillRating=" + skillRating +
                ", skillExp=" + skillExp +
                ", skillDuration='" + skillDuration + '\'' +
                ", skillCertificate='" + skillCertificate + '\'' +
                '}';
    }
}
