import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateParcoursComponent } from './update-parcours.component';

describe('UpdateParcoursComponent', () => {
  let component: UpdateParcoursComponent;
  let fixture: ComponentFixture<UpdateParcoursComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateParcoursComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateParcoursComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
