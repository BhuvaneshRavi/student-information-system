import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';



@Component({
  selector: 'app-studentreg',
  templateUrl: './studentreg.component.html',
  styleUrls: ['./studentreg.component.css']
})
export class StudentregComponent implements OnInit {

  mobNumberPattern = "^((\\+91-?)|0)?[0-9]{10}$";  

  public form = new FormGroup({

    firstName: new FormControl('',Validators.required),
    lastName: new FormControl('',Validators.required),
    Address: new FormControl('', Validators.required),
    email: new FormControl('',[Validators.required, Validators.email]),
    birthDate: new FormControl('', Validators.required),
    phoneNumber: new FormControl ('',[Validators.required, Validators.pattern(this.mobNumberPattern)]),
    Degree: new FormControl('', Validators.required),
    Gender: new FormControl('', Validators.required),
    sel1: new FormControl('', Validators.required),
    sel2: new FormControl('', Validators.required),
    sel3: new FormControl('', Validators.required)

  });
  
  url ='http://localhost:8080/api/v1/student'
  json;

  public onSubmit() {
    var sdata = this.form.value;
    console.log (sdata);
   
    this.http.post(this.url,sdata).toPromise().then((data: any) => {
      console.log (data);
      this.json = JSON.stringify(data.json);
    })

  }


  constructor(private http:HttpClient) { }

  ngOnInit() {
  }

}
