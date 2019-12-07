import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-dropcourse',
  templateUrl: './dropcourse.component.html',
  styleUrls: ['./dropcourse.component.css']
})
export class DropcourseComponent implements OnInit {
 
  public form = new FormGroup({
    
    id: new FormControl('',Validators.required),
 
    });
  url ='http://localhost:8080/api/v1/course/removecourse'
  json;
  popup_msg;

  public onSubmit() {
    var sdata = this.form.value;  
    console.log(sdata)
    this.http.post(this.url,sdata).toPromise().then((data: any) => {
      console.log(data)
      Swal.fire (
        'Course has been succesfully dropped', this.popup_msg)
      this.json = JSON.stringify(data.json);
    })
    
  }

  constructor(private http:HttpClient) { }

  ngOnInit() {
  }

}
