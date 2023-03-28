import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddSkillComponent } from './add-skill/add-skill.component';
import { LoginComponent } from './login/login.component';
import { SkillComponent } from './skill/skill.component';
import { SummaryComponent } from './summary/summary.component';

const routes: Routes = [
  {path:'skill' , component:SkillComponent},
  {path:'', redirectTo:'skill', pathMatch:"full"},
  {path:'addskill', component:AddSkillComponent},
  {path:'summary', component:SummaryComponent},
  {path:'login', component:LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
