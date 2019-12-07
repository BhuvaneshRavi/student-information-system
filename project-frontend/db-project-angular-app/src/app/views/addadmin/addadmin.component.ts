import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-addadmin',
  templateUrl: './addadmin.component.html',
  styleUrls: ['./addadmin.component.css']
})
export class AddadminComponent implements OnInit {
  mobNumberPattern = "^((\\+91-?)|0)?[0-9]{10}$"; 
   

  public form = new FormGroup({
    
    firstname: new FormControl('',Validators.required),
    lastname: new FormControl('',Validators.required),
    address: new FormControl('', Validators.required),
    email: new FormControl('',[Validators.required, Validators.email]),
    dob: new FormControl('',Validators.required),
    admintype: new FormControl('',Validators.required),
    phone: new FormControl ('',[Validators.required, Validators.pattern(this.mobNumberPattern)]),
    username: new FormControl('',Validators.required),
    password: new FormControl('',Validators.required),

  });
  url ='http://localhost:8080/api/v1/credential/addadmin'
  json;
  popup_msg;

  public onSubmit() {
    var sdata = this.form.value;  
    console.log(sdata)
    this.http.post(this.url,sdata).toPromise().then((data: any) => {
      console.log(data)
      Swal.fire (
        'Admin has been succesfuly added', data.firstname)
      this.json = JSON.stringify(data.json);
    })
    
  }
  constructor(private http:HttpClient) { }

  ngOnInit() {
  }

}
