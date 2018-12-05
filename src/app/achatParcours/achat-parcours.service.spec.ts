import { TestBed, inject } from '@angular/core/testing';

import { AchatParcoursService } from './achat-parcours.service';

describe('AchatParcoursService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AchatParcoursService]
    });
  });

  it('should be created', inject([AchatParcoursService], (service: AchatParcoursService) => {
    expect(service).toBeTruthy();
  }));
});
