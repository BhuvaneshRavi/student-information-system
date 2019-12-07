import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';
import {HttpClient} from '@angular/common/http';
import { promise } from 'protractor';
import {Comments} from '../../classes/Comments';
import Swal from 'sweetalert2';
import {enrolled} from '../../classes/Comments';
import {FreeapiService} from '../../services/freeapi.service';
import {Vcourse} from '../../classes/Comments';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  showLogin: boolean
  showStudentProfile: boolean
  showEnrolledCourse: boolean
  showCourseEnrollment: boolean
  showCourse: boolean
  dropCourse: boolean


  public getShowLogin() {
    return this.showLogin
  }

  public getShowStudentProfile() {
    return this.showStudentProfile
  }

  public getShowEnrolledCourse() {
    return this.showEnrolledCourse
  }

  public getShowCourseEnrollment() {
    return this.showCourseEnrollment
  }

  public getShowCourse() {
    return this.showCourse
  }

  public getDropCourse() {
    return this.dropCourse
  }

  public displayEnrollCourseSection() {
    this.dropCourse = false
    this.showCourseEnrollment = true
  }

  public displayDropCourseSection() {
    this.showCourseEnrollment = false
    this.dropCourse = true
  }

  public viewcourses() {
    console.log("I am here")
    this._freeApiService.getVcourse()
    .subscribe
    (
      data=>
      {
        this.showCourse = true
        this.lstvcourse=data;
        console.log(this.lstvcourse);
      }

    );

  }
 
  public form = new FormGroup({

    username: new FormControl(''),
    password: new FormControl('')

  });

  public form1 = new FormGroup({

    courseid: new FormControl('')

  });
  
  popup_msg;
  ccid;
  constructor(private http:HttpClient,private _freeApiService: FreeapiService ) { }

  ngOnInit() {
    this.showLogin = true
    this.showStudentProfile = false
    this.showEnrolledCourse = false
    this.showCourseEnrollment = false
    this.showCourse = false
    this.dropCourse = false

  }

  url ='http://localhost:8080/api/v1/credential/checkcredentials'
  url1 ='http://localhost:8080/api/v1/student/getOneStudent'
  url2 ='http://localhost:8080/api/v1/course/viewcourse'
  url3 ='http://localhost:8080/api/v1/course/enrollcourse'
  url4 ='http://localhost:8080/api/v1/course/dropcourse'


  lstComments:Comments[];
  lstenrolled:enrolled[];
  lstvcourse:Vcourse[];

  json;

  public onenrosubmit() {
    console.log("iam here")
    var sdata1 = this.form1.value.courseid

    var susername = this.form.value.username
  console.log(susername)
  var ssdata = {
    'id': sdata1,
    'username': susername
  }
    this.http.post(this.url3,ssdata).toPromise().then((data:any) => {
    console.log(data)
    Swal.fire ('You have succesfully Added the course',this.popup_msg)}) 

          }
public onedrop() {

  
    var sdata1 = this.form1.value.courseid

    var susername = this.form.value.username
  console.log(susername)
  var ssdata = {
    'username': susername,
    'courseid': sdata1
    
  }
    this.http.post(this.url4,ssdata).toPromise().then((data:any) => {
    console.log(data)
    Swal.fire ('You have succesfully Dropped the course',this.popup_msg)
  }) 

  }

  public onsubmit() {
   /* window.location.href='/viewstudent'; */

      var sdata = this.form.value;
      console.log ('sdata is ', sdata);
   
      this.http.post(this.url,sdata).toPromise().then((data: any) => 
      {
        console.log (data.loginStatus);
        this.json = JSON.stringify(data.json);
        if (data.loginStatus = 'success') {
          this.showLogin = false
          this.http.post(this.url1,sdata).toPromise().then((data:any) => 
          {
            this.lstComments =[data];
            console.log(this.lstComments);
            console.log(data)}) 
            console.log("inside success")
            this.showStudentProfile = true
            this.popup_msg = data.firstname 
            Swal.fire ('You have succesfully logged in',this.popup_msg)    
           }
          })
            
      this.http.post(this.url2,sdata).toPromise().then((data:any) => 
      {
        this.showEnrolledCourse = true
        this.ccid = data.courseid
        this.lstenrolled =data;
        console.log(this.lstenrolled);
        console.log(this.ccid); })
      }     
      
}