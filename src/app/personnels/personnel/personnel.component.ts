import { Component, OnInit } from '@angular/core';
import {PersonnelService } from '../personnel.service';

import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-personnel',
    moduleId: module.id,
  templateUrl: './personnel.component.html'
})
export class PersonnelComponent implements OnInit {

  constructor(private _personnelService: PersonnelService, private toastr :ToastrService) {

  }

  ngOnInit() {
  }

  updatePersonnel(personnel){
    this._personnelService.updatePersonnel(personnel).subscribe(data =>{
      this.toastr.success('Personnel modifié avec succès','Enregistrement Personnel');

    } );
  }

}
