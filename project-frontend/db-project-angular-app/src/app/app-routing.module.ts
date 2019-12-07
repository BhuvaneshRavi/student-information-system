import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './views/home/home.component';
import { LoginComponent } from './views/login/login.component';
import { StudentregComponent } from './views/studentreg/studentreg.component';
import { ViewstudentComponent } from './views/viewstudent/viewstudent.component';
import {HttpClient} from '@angular/common/http';
import { AddcourseComponent } from './views/addcourse/addcourse.component';
import { ViewcourseComponent } from './views/viewcourse/viewcourse.component';
import { AddadminComponent } from './views/addadmin/addadmin.component';
import { StudentprofileComponent } from './views/studentprofile/studentprofile.component';
import { AdminloginComponent } from './views/adminlogin/adminlogin.component';
import { DropcourseComponent } from './views/dropcourse/dropcourse.component';


const routes: Routes = [
  {
    path: '',component:HomeComponent
  },
  {
    path: 'login',
  component:LoginComponent
  },
  {
    path: 'studentreg',
  component:StudentregComponent
  },
  {
    path: 'viewstudent',
  component:ViewstudentComponent
  },
  {
    path: 'addcourse',
  component:AddcourseComponent
  },
  {
    path: 'viewcourse',
  component:ViewcourseComponent
  },
  {
    path: 'addadmin',
  component:AddadminComponent
  },
  {
    path: 'studentprofile',
  component:StudentprofileComponent
  },
  {
    path: 'adminlogin',
  component:AdminloginComponent
  },
  {
    path: 'dropcourse',
  component:DropcourseComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  
  exports: [RouterModule]
})
export class AppRoutingModule { }
