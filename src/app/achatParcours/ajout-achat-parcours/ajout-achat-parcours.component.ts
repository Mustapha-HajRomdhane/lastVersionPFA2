import { Component, OnInit } from '@angular/core';
import { AchatParcoursService } from '../achat-parcours.service';

import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-ajout-achat-parcours',
  templateUrl: './ajout-achat-parcours.component.html',
  styleUrls: ['./ajout-achat-parcours.component.css']
})
export class AjoutAchatParcoursComponent implements OnInit {

  constructor(private _achatParcoursService:AchatParcoursService,   private toastr :ToastrService) { }

  ngOnInit() {
  }

addAchatParcours(achatParcours, idAchat){
  this._achatParcoursService.addAchatParcours(achatParcours, idAchat).subscribe(data =>{
    this.toastr.success('Achat ajouté avec succès','Enregistrement Achat Parcours');
  } );

}

}
