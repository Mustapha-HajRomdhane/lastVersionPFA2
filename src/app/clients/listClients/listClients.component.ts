import { Component, OnInit, ViewChild } from '@angular/core';
import { ClientService } from '../client.service';
import { Client } from '../client'


@Component({
    selector: 'listClients-cmp',
    moduleId: module.id,
    templateUrl: 'listClients.component.html'
})

export class ListClientsComponent implements OnInit{

    clients: any;


  constructor( private _clientService: ClientService) {}

    ngOnInit(){
    this.getClients();

}

getClients(){
  this._clientService.getClients().subscribe(response => {
    this.clients = response;
  });
}

showClientForEdit(clt: Client){
  this._clientService.client=Object.assign({},clt);;

}

restartClient(){
  this._clientService.client=new Client();
}

deleteClient(idClient: number){
  this._clientService.deleteClient(idClient).subscribe( data =>{
    this.getClients();
  });
}
}
