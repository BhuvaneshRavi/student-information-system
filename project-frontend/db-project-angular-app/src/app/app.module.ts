import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms'; 

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './views/home/home.component';
import { LoginComponent } from './views/login/login.component';
import { StudentregComponent } from './views/studentreg/studentreg.component';
import { HttpClientModule } from '@angular/common/http';
import { ViewstudentComponent } from './viewstudent/viewstudent.component';
import {freeApiServices} from './services/freeapi.services';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    StudentregComponent,
    ViewstudentComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [freeApiServices],
  bootstrap: [AppComponent]
})
export class AppModule { }
  