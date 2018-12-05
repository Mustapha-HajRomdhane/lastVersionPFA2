import { Component, OnInit } from '@angular/core';
import { ClientService } from '../client.service';

import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-ajout-client',
  templateUrl: './ajout-client.component.html',
  styleUrls: ['./ajout-client.component.css']
})
export class AjoutClientComponent implements OnInit {

  constructor(private _clientService: ClientService, private toastr :ToastrService ){

  }

     ngOnInit(){

     }

     addClient(client){
       this._clientService.addClient(client).subscribe(data =>{
         this.toastr.success('Client ajouté avec succès','Enregistrement Client');
       } );

     }

}
