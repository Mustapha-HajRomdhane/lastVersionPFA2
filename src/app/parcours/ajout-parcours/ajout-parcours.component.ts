import { Component, OnInit } from '@angular/core';
import { ParcoursService } from '../parcours.service';

import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-ajout-parcours',
  templateUrl: './ajout-parcours.component.html',
  styleUrls: ['./ajout-parcours.component.css']
})
export class AjoutParcoursComponent implements OnInit {

  constructor(private _parcoursService: ParcoursService,  private toastr: ToastrService ) { }

  ngOnInit() {
  }

  addParcours(parcours){
    this._parcoursService.addParcours(parcours).subscribe(data =>{
      this.toastr.success('Parcours ajouté avec succès','Enregistrement Parcours');
    } );

  }

}
