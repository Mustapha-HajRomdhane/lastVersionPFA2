import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutAchatForfaitComponent } from './ajout-achat-forfait.component';

describe('AjoutAchatForfaitComponent', () => {
  let component: AjoutAchatForfaitComponent;
  let fixture: ComponentFixture<AjoutAchatForfaitComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AjoutAchatForfaitComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AjoutAchatForfaitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
