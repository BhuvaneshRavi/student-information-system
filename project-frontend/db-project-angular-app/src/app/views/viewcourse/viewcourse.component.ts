import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import {FreeapiService} from '../../services/freeapi.service';
import {Vcourse} from '../../classes/Comments';
import { NgModule } from '@angular/core';

@Component({
  selector: 'app-viewcourse',
  templateUrl: './viewcourse.component.html',
  styleUrls: ['./viewcourse.component.css']
})
export class ViewcourseComponent implements OnInit {

  constructor(private _freeApiService: FreeapiService) { }

  lstComments:Vcourse[];

  ngOnInit() {
    console.log("constructor called");

    this._freeApiService.getVcourse()
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
