import { Component, OnInit } from '@angular/core';
import { MaterielService} from '../materiel.service';
import { ToastrService} from 'ngx-toastr';


@Component({
  selector: 'app-materiel',
  templateUrl: './materiel.component.html',
  styleUrls: ['./materiel.component.css']
})
export class MaterielComponent implements OnInit {

    materiels: any;
    constructor( private _materielService: MaterielService, private toastr: ToastrService ) {}

    ngOnInit(){
        this.getMateriels();

    }

    getMateriels(){
        this._materielService.getMateriels().subscribe(response => {
            this.materiels = response;
        });
    }

    addMateriel(materiel){
        this._materielService.addMateriel(materiel).subscribe(data =>{
            this.toastr.success('Materiel modifié avec succès','Ajout Materiel');
        } );
    }








}
