import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateForfaitComponent } from './update-forfait.component';

describe('UpdateForfaitComponent', () => {
  let component: UpdateForfaitComponent;
  let fixture: ComponentFixture<UpdateForfaitComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateForfaitComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateForfaitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
