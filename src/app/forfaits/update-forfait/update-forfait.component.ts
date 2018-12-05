import { Component, OnInit } from '@angular/core';
import { ForfaitService } from '../forfait.service';

import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-update-forfait',
  templateUrl: './update-forfait.component.html',
  styleUrls: ['./update-forfait.component.css']
})
export class UpdateForfaitComponent implements OnInit {

  constructor(private _forfaitService: ForfaitService, private toastr :ToastrService) { }

  ngOnInit() {
  }

  updateForfait(forfait){
    this._forfaitService.updateForfait(forfait).subscribe(data =>{
      this.toastr.success('Forfait modifié avec succès', 'Enregistrement Forfait');
    });
  }

}
