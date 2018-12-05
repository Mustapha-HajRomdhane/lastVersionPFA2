import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListpersonnelsComponent } from './listpersonnels.component';

describe('ListpersonnelsComponent', () => {
  let component: ListpersonnelsComponent;
  let fixture: ComponentFixture<ListpersonnelsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListpersonnelsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListpersonnelsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
