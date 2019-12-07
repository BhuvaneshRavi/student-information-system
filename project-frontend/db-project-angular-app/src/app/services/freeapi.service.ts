import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http';
import { headersToString } from 'selenium-webdriver/http';

@Injectable({
  providedIn: 'root'
})
export class FreeapiService {

  constructor(private httpclient : HttpClient) { 

  }
  getComments(): Observable<any> {
    return this.httpclient.get("http://localhost:8080/api/v1/student/allstudents")
  }
  getVcourse(): Observable<any> {
    return this.httpclient.get("http://localhost:8080/api/v1/course/allcourses")
  }
  getenroll():Observable<any> {
    return this.httpclient.get("http://localhost:8080/api/v1/course/viewcourse")
  }
}
