import { Component, OnInit } from '@angular/core';
import { MaterielService } from '../materiel.service';

import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-ajout-materiel',
  templateUrl: './ajout-materiel.component.html',
  styleUrls: ['./ajout-materiel.component.css']
})
export class AjoutMaterielComponent implements OnInit {

  constructor( private _materielService: MaterielService, private toastr: ToastrService) { }

  ngOnInit() {
  }

addMateriel(materiel){
  this._materielService.addMateriel(materiel).subscribe(data =>{
    this.toastr.success('Materiel ajouté avec succès','Enregistrement Materiel');
  } );

}
}
