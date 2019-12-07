import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';
import Swal from 'sweetalert2';


@Component({
  selector: 'app-studentreg',
  templateUrl: './studentreg.component.html',
  styleUrls: ['./studentreg.component.css']
})
export class StudentregComponent implements OnInit {

  mobNumberPattern = "^((\\+91-?)|0)?[0-9]{10}$";  

  public form = new FormGroup({

    firstname: new FormControl('',Validators.required),
    lastname: new FormControl('',Validators.required),
    address: new FormControl('', Validators.required),
    email: new FormControl('',[Validators.required, Validators.email]),
    dob: new FormControl('', Validators.required),
    phone: new FormControl ('',[Validators.required, Validators.pattern(this.mobNumberPattern)]),
    degree: new FormControl('', Validators.required),
    gender: new FormControl('', Validators.required),
    qualification: new FormControl('', Validators.required),
    yearOfJoining: new FormControl('', Validators.required),
    joiningTerm: new FormControl('', Validators.required),
    admissionNumber: new FormControl('', Validators.required)

  });
  
  url ='http://localhost:8080/api/v1/student/registerstudent'
  json;
  popup_msg;

  public onSubmit() {
    var sdata = this.form.value;  
    this.http.post(this.url,sdata).toPromise().then((data: any) => {
      this.popup_msg = data.id.concat('    &   ',data.password); 
      Swal.fire (
        'Student Login & Password:', this.popup_msg)
      this.json = JSON.stringify(data.json);
    })
    
  }

  

  constructor(private http:HttpClient) { }

  ngOnInit() {
  }

}
