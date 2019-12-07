import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms'; 

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './views/home/home.component';
import { LoginComponent } from './views/login/login.component';
import { StudentregComponent } from './views/studentreg/studentreg.component';
import { ViewstudentComponent } from './views/viewstudent/viewstudent.component';
import { HttpClientModule } from '@angular/common/http';
import {FreeapiService} from './services/freeapi.service';
import { DataTableModule } from 'ng-angular8-datatable';
import { AddcourseComponent } from './views/addcourse/addcourse.component';
import { ViewcourseComponent } from './views/viewcourse/viewcourse.component';
import { AddadminComponent } from './views/addadmin/addadmin.component';
import { CourseenrolComponent } from './views/courseenrol/courseenrol.component';
import { StudentprofileComponent } from './views/studentprofile/studentprofile.component';
import { AdminloginComponent } from './views/adminlogin/adminlogin.component';
import { DropcourseComponent } from './views/dropcourse/dropcourse.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    StudentregComponent,
    ViewstudentComponent,
    AddcourseComponent,
    ViewcourseComponent,
    AddadminComponent,
    CourseenrolComponent,
    StudentprofileComponent,
    AdminloginComponent,
    DropcourseComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    DataTableModule
    
  ],
  providers: [FreeapiService],
  bootstrap: [AppComponent]
})
export class AppModule { }
