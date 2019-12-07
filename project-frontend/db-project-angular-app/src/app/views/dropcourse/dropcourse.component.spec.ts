import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DropcourseComponent } from './dropcourse.component';

describe('DropcourseComponent', () => {
  let component: DropcourseComponent;
  let fixture: ComponentFixture<DropcourseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DropcourseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DropcourseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
