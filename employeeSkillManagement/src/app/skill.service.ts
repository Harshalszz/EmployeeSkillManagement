import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class SkillService {

  baseUrl ='http://localhost:8084/api/v1/skill';


  constructor(private http:HttpClient) { }

  getSkills() : Observable<any>{

    return this.http.get(`${this.baseUrl}/getAllSkills`);

  }

  addSkill(data : any) :Observable<any>{
    return this.http.post(`${this.baseUrl}/save`, data,{ responseType: 'text' });
  }

  updateSkill(data : any) :Observable<any>{
    return this.http.put(`${this.baseUrl}/update`, data,{ responseType: 'text' });
  }

  deleteSkill(id :any): Observable<any>{
    return this.http.delete(`${this.baseUrl}/deleteskill/${id}`,{ responseType: 'text' })
  }
}
