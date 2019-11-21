
import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import {freeApiServices} from '../services/freeapi.services';
import {Comments} from '../classes/Comments';
import { NgModule } from '@angular/core';




@Component({
  selector: 'app-viewstudent',
  templateUrl: './viewstudent.component.html',
  styleUrls: ['./viewstudent.component.css']
})




export class ViewstudentComponent implements OnInit {

    

  constructor(private _freeApiService: freeApiServices) 
  {
   }

   lstComments:Comments[];
   

  ngOnInit() {
    console.log("constructor called");

    this._freeApiService.getComments()
    .subscribe
    (
      data=>
      {
        this.lstComments=data;
        console.log(this.lstComments);
      }

    );
  }

}
