import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Materiel } from './materiel'


const httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class MaterielService {

  materiel: Materiel;

    constructor(private http: HttpClient ) {
      this.materiel=new Materiel();
    }


    getMateriels(){
        return  this.http.get('http://localhost:8080/appNoyau/rest/Materiel/all');
    }


    addMateriel(materiel){
        let body = JSON.stringify(materiel);
        console.log(body);
        return this.http.post('http://localhost:8080/appNoyau/rest/Materiel/addMateriel', body , httpOptions );
    }

    updateMateriel(materiel){
      let body = JSON.stringify(materiel);
    return this.http.put('http://localhost:8080/appNoyau/rest/Materiel/updateMateriel', body ,httpOptions);
    }

    deleteMateriel(id: number){
      return this.http.delete('http://localhost:8080/appNoyau/rest/Materiel/deleteMateriel/'+id);
    }

}
