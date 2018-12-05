import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutAchatParcoursComponent } from './ajout-achat-parcours.component';

describe('AjoutAchatParcoursComponent', () => {
  let component: AjoutAchatParcoursComponent;
  let fixture: ComponentFixture<AjoutAchatParcoursComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AjoutAchatParcoursComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AjoutAchatParcoursComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
