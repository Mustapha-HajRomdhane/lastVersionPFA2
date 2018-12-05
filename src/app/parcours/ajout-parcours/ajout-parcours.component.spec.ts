import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutParcoursComponent } from './ajout-parcours.component';

describe('AjoutParcoursComponent', () => {
  let component: AjoutParcoursComponent;
  let fixture: ComponentFixture<AjoutParcoursComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AjoutParcoursComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AjoutParcoursComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
