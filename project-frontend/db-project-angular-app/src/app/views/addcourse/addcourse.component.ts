import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-addcourse',
  templateUrl: './addcourse.component.html',
  styleUrls: ['./addcourse.component.css']
})
export class AddcourseComponent implements OnInit {
  public form = new FormGroup({

    id: new FormControl('',Validators.required),
    name: new FormControl('',Validators.required),
    department: new FormControl('', Validators.required),
    level: new FormControl('',Validators.required),
    credits: new FormControl('',Validators.required),
    offeringTerm: new FormControl('', Validators.required)
  });
  url ='http://localhost:8080/api/v1/course/addcourse'
  json;
  popup_msg;

  public onSubmit() {
    var sdata = this.form.value;  
    console.log(sdata)
    this.http.post(this.url,sdata).toPromise().then((data: any) => {
      console.log(data)
      Swal.fire (
        'Course has been succesfully added')
      this.json = JSON.stringify(data.json);
    })
    
  }

  constructor(private http:HttpClient) { }

  ngOnInit() {
  }

}
