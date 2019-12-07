import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CourseenrolComponent } from './courseenrol.component';

describe('CourseenrolComponent', () => {
  let component: CourseenrolComponent;
  let fixture: ComponentFixture<CourseenrolComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CourseenrolComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CourseenrolComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
