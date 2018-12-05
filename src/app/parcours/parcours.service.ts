import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Parcours } from './parcours'

const httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


@Injectable()
export class ParcoursService {

    parcours: Parcours ;

    constructor(private http: HttpClient ) {
      this.parcours= new Parcours();
    }


    getParcours(){
        return  this.http.get('http://localhost:8080/appNoyau/rest/Parcours/all');
    }

    addParcours(parcours){
        console.log(parcours);
        let par = JSON.stringify(parcours);
        console.log(par);
        return this.http.post('http://localhost:8080/appNoyau/rest/Parcours/addParcours', par ,httpOptions );
    }

updateParcours(parcours){
  let par=JSON.stringify(parcours);
  return this.http.put('http://localhost:8080/appNoyau/rest/Parcours/updateParcours',par,httpOptions);
}

deleteParcours(id: number){
  return this.http.delete('http://localhost:8080/appNoyau/rest/Parcours/updateParcours/'+id);
}

}
