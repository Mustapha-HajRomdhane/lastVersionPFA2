import { Component, OnInit } from '@angular/core';
import { ForfaitService} from '../forfait.service';
import { Forfait } from'../forfait'

import { ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-forfait',
  templateUrl: './forfait.component.html',
  styleUrls: ['./forfait.component.css']
})
export class ForfaitComponent implements OnInit {

    forfaits: any;
    constructor( private _forfaitService: ForfaitService, private toastr : ToastrService ) {}

    ngOnInit(){
        this.getForfaits();

    }

    getForfaits(){
        this._forfaitService.getForfaits().subscribe(response => {
            this.forfaits = response;
        });
    }

    showForfaitForEdit(forf: Forfait){
      this._forfaitService.forfait=Object.assign({},forf);;
    }

    restartForfait(){
      this._forfaitService.forfait = new Forfait();
    }

    deleteForfait(idForfait){
      this._forfaitService.deleteForfait(idForfait).subscribe( data =>{
        this.getForfaits();
        this.toastr.success('Forfait supprimé avec succès','Suppression Forfait');
      });
    }


}
