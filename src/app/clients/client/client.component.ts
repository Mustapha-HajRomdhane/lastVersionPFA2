import { Component, OnInit } from '@angular/core';
import { ClientService } from '../client.service';

import { ToastrService } from 'ngx-toastr';

@Component({
    selector: 'client-cmp',
    moduleId: module.id,
    templateUrl: 'client.component.html'
})

export class ClientComponent implements OnInit{

 constructor(private _clientService: ClientService, private toastr :ToastrService ){

 }

    ngOnInit(){
    }

    updateClient(client){
      this._clientService.updateClient(client).subscribe(data =>{
        this.toastr.success('Client modifié avec succès','Enregistrement Client');

      } );

    }

}
