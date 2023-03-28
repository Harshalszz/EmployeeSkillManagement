import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { SkillService } from '../skill.service';

@Component({
  selector: 'app-skill',
  templateUrl: './skill.component.html',
  styleUrls: ['./skill.component.css']
})
export class SkillComponent {
  SkillArray: any[] = [];

  
  isResultLoaded = false;
  isUpdateFormActive = false;


  skillName: string ="";
  skillRating: number = 0;
  skillExp: number = 0;
  skillDuration: string = "";
  skillCertificate: string = "";
  currentSkillID ="";





  constructor(private http: HttpClient, private skill:SkillService) {
    
    this.getAllSkill();
    //this.register();
    //this.UpdateSkill()
   // this.deleteSkill(1);
  }


  getAllSkill() {
    this.skill.getSkills().subscribe((res: any) => {
      this.isResultLoaded = true;
      console.log(res);
      this.SkillArray = res;
    })
  }

  register() {

    let bodyData = {
      "skillName": this.skillName,
      "skillRating": this.skillRating,
      "skillExp": this.skillExp,
      "skillDuration": this.skillDuration,
      "skillCertificate": this.skillCertificate
    };

    this.skill.addSkill(bodyData).subscribe((resultData: any) => {
      console.log(resultData);
      alert("Skill Added Successfully");
      this.getAllSkill();

      this.skillName = '';
      this.skillExp = 0;
      this.skillRating = 0;
      this.skillDuration = '';
      this.skillCertificate = '';


    });

  }


  setUpdate1(data: any) {
    this.skillName = data.skillName;
    this.skillExp = data.skillExp;
    this.skillRating = data.skillRating;
    this.skillDuration = data.skillDuration;
    this.skillCertificate = data.skillCertificate;
    this.currentSkillID = data.skillId;
  }



  UpdateSkill() {

    let bodyData = {
      "skillId" : this.currentSkillID,
      "skillName": this.skillName,
      "skillRating": this.skillRating,
      "skillExp": this.skillExp,
      "skillDuration": this.skillDuration,
      "skillCertificate": this.skillCertificate
    };

    this.skill.updateSkill(bodyData).subscribe((resultData: any) => {
      console.log(resultData);
      alert("Skill Updated Successfully");
      this.getAllSkill();

      this.skillName = '';
      this.skillExp = 0;
      this.skillRating = 0;
      this.skillDuration = '';
      this.skillCertificate = '';


    });



  }



  save1(){
    if (this.currentSkillID == '') {
      this.register();
    }
    else {
      this.UpdateSkill();
    }
  }




  deleteSkill(data:any){

    this.skill.deleteSkill(data.skillId).subscribe((resultData: any) => {
      console.log(resultData);
      alert("Skill Deleted Successfully")
      this.getAllSkill();

      this.skillName = '';
      this.skillExp = 0;
      this.skillRating = 0;
      this.skillDuration = '';
      this.skillCertificate = '';

    });


  }




}
