import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Client } from './client'


const httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class ClientService {

client : Client;
  constructor(private http:HttpClient) {
this.client=new Client();
 }


getClients(){
return  this.http.get('http://localhost:8080/appNoyau/rest/Client/all');
}


addClient(client){
  let cli = JSON.stringify(client);
return this.http.post('http://localhost:8080/appNoyau/rest/Client/addClient',cli , httpOptions);
}

updateClient(client){
  let cli = JSON.stringify(client);
return this.http.put('http://localhost:8080/appNoyau/rest/Client/updateClient',cli,httpOptions);
}

deleteClient(id: number){
  return this.http.delete('http://localhost:8080/appNoyau/rest/Client/deleteClient/'+id);
}


}
