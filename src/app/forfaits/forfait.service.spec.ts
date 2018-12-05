import { TestBed, inject } from '@angular/core/testing';

import { ForfaitService } from './forfait.service';

describe('ForfaitService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ForfaitService]
    });
  });

  it('should be created', inject([ForfaitService], (service: ForfaitService) => {
    expect(service).toBeTruthy();
  }));
});
