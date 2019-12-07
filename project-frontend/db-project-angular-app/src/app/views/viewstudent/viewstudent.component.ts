
import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import {FreeapiService} from '../../services/freeapi.service';
import {Comments} from '../../classes/Comments';
import { NgModule } from '@angular/core';
import { DataTableModule } from 'ng-angular8-datatable';




@Component({
  selector: 'app-viewstudent',
  templateUrl: './viewstudent.component.html',
  styleUrls: ['./viewstudent.component.css']
})




export class ViewstudentComponent implements OnInit {

    

  constructor(private _freeApiService: FreeapiService) 
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
