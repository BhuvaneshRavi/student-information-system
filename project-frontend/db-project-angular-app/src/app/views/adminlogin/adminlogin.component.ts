import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';
import {HttpClient} from '@angular/common/http';
import Swal from 'sweetalert2';


@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  public form = new FormGroup({

    username: new FormControl(''),
    password: new FormControl('')

  });
  popup_msg;


  constructor(private http:HttpClient) { }

  ngOnInit() {
  }

  url ='http://localhost:8080/api/v1/credential/checkcredentials'
  json;

  public onsubmit() {
   /* window.location.href='/viewstudent'; */

    var sdata = this.form.value;
  
    console.log (sdata);
   
    this.http.post(this.url,sdata).toPromise().then((data: any) => {
      console.log (data.loginStatus);
      this.json = JSON.stringify(data.json);
      if (data.loginStatus = 'success')
        {
        console.log(data)
        console.log("inside success")
        Swal.fire ('You have succesfully logged in',this.popup_msg)   
        window.location.href='/viewstudent'; 
      }
      else
      {
        Swal.fire ('Please check the Username and password',this.popup_msg)    
         console.log("fail")
    }
  })
   
  }
} 
