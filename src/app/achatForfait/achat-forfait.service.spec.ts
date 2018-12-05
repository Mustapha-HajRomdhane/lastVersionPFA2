import { TestBed, inject } from '@angular/core/testing';

import { AchatForfaitService } from './achat-forfait.service';

describe('AchatForfaitService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AchatForfaitService]
    });
  });

  it('should be created', inject([AchatForfaitService], (service: AchatForfaitService) => {
    expect(service).toBeTruthy();
  }));
});
