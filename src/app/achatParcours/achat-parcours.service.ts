import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AchatParcours } from './achatParcours'
import { AchatParcoursPK } from './achatParcoursPK'


const httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class AchatParcoursService {

 achatParcours: AchatParcours;
idAchat: AchatParcoursPK;

  constructor(private http:HttpClient) {
this.achatParcours = new AchatParcours();
this.idAchat =new AchatParcoursPK();
  }

 addAchatParcours(achatParcours , idAchat){
    achatParcours.idAchat=idAchat;
    console.log(achatParcours);
   let achat =JSON.stringify(achatParcours);
   console.log(achat); 
   return this.http.post('http://localhost:8080/appNoyau/rest/Achat/addAchatParcours',achat , httpOptions);
   }
 }
