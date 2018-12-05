import { Component, OnInit } from '@angular/core';
import { ForfaitService } from '../forfait.service';

import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-ajout-forfait',
  templateUrl: './ajout-forfait.component.html',
  styleUrls: ['./ajout-forfait.component.css']
})
export class AjoutForfaitComponent implements OnInit {

  constructor(private _forfaitService: ForfaitService,private toastr :ToastrService ) { }

  ngOnInit() {
  }


  addForfait(forfait){
      this._forfaitService.addForfait(forfait).subscribe(data =>{
          this.toastr.success('Forfait modifié avec succès','Ajout Forfait');
      } );
  }

}
