import { Component, OnInit } from '@angular/core';
import { ParcoursService } from '../parcours.service';
import { HttpClient } from '@angular/common/http';

import { Parcours } from '../parcours'

@Component({
  selector: 'app-list-parcours',
  templateUrl: './list-parcours.component.html',
  styleUrls: ['./list-parcours.component.css']
})
export class ListParcoursComponent implements OnInit {

parcours: any;

  constructor(private _parcoursService: ParcoursService ) { }

  ngOnInit() {
    this.getParcours();
  }

  getParcours(){
    this._parcoursService.getParcours().subscribe(response =>{
      this.parcours = response;
    });
  }

  showParcoursForEdit(parc: Parcours){
    this._parcoursService.parcours= Object.assign({},parc);;
  }

restartParcours(){
  this._parcoursService.parcours=new Parcours();
}

  deleteParcours(idParcours: number){
    this._parcoursService.deleteParcours(idParcours).subscribe( data =>{
      this.getParcours();
    });
  }

}
