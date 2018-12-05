import { Component, OnInit } from '@angular/core';
import { ParcoursService } from '../parcours.service';

import { ToastrService } from 'ngx-toastr';


@Component({
  selector: 'app-update-parcours',
  templateUrl: './update-parcours.component.html',
  styleUrls: ['./update-parcours.component.css']
})
export class UpdateParcoursComponent implements OnInit {

  constructor(private _parcoursService: ParcoursService,private toastr :ToastrService ) { }

  ngOnInit() {
  }

  updateParcours(parcours){
    this._parcoursService.updateParcours(parcours).subscribe(data =>{
      this.toastr.success('Parcours  modifié avec succès', 'Enregistrement Parcours');
    });
  }

}
